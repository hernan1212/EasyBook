package client.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import server.remote.IFacade;

public class RMIServiceLocator
{
	/** 
	 * The Cache - Limitation: one server at a time
	 * Proposed improvement: list of services
	 */
	
	private IFacade service = null;

    /** Creates a new instance of RMIServiceLocator */
    public RMIServiceLocator() {
    	
    }

    public void setService(String ip, String port, String serviceName) 
    {    
    	// Add your code to locate and initialize the SERVICE reference
    	
    	if (System.getSecurityManager() == null) 
		{
			System.setSecurityManager(new SecurityManager());
		}
    	
    	try 
		{ 	System.out.println("1");
			Registry registry = LocateRegistry.getRegistry(((Integer.valueOf(port))));
			System.out.println("2");
			String name = "//" + ip + ":" + port + "/" + serviceName;			
			this.service = (IFacade) registry.lookup(name);
			System.out.println("* Server: " + this.getService().sayHello() );			
		} 
		catch (Exception e) 
		{
			System.err.println("- Exception running the client: " + e.getMessage());
			e.printStackTrace();
		}
    }
    
    public IFacade getService() 
    {    	
    	return this.service;
    }
}