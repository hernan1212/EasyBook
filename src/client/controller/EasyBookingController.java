package client.controller;

import java.rmi.RemoteException;
import java.util.List;

import assemble.FlightDTO;
import client.remote.RMIServiceLocator;

public class EasyBookingController 
{
	private RMIServiceLocator rsl = null;

	List <FlightDTO> flightList;
	private String UsuarioActivo;
	private int passenger;
	
	public EasyBookingController() throws RemoteException 
	{		
		// Add your related code for the initialization of the Service Locator
		rsl = new RMIServiceLocator();
		rsl.setService("127.0.0.1", "1000", "ServEB");
	}
	
    public boolean IniciarSesion(String Usuario, String Password)
    {    	
    	try 
    	{
    		// Add your code related to getting the service and requesting creation of TVProgram    		
    		if(rsl.getService().IniciarSesion(Usuario, Password))
    		{
    			UsuarioActivo = Usuario;
    			
    			return true;
    		}	
    	} 
    	catch (Exception e)
    	{
    		System.err.println("$ Error sending new TV program: " + e.toString());
    	}
    	return false;
    }
    public boolean NuevoUsuario(String Usuario, String Password, String Aut_sys_name, String Payment){
    	try
    	{	
    		// Add your related to getting the service and sending a message
    		if(rsl.getService().NuevoUsuario(Usuario, Password, Aut_sys_name, Payment))
    		{
    			UsuarioActivo = Usuario;
    			
    			return true;
    		}
    	} 
    	catch(Exception e)
    	{
    		System.out.println("$ Error sending a message: " + e.getMessage());
    	}
    	return false;
    }
    public List <FlightDTO> BuscarVuelo(String Origen, String Destino, String Fecha, int Passenger){
    	try
    	{	
    		// Add your related to getting the service and sending a message
    		flightList = rsl.getService().BuscarVuelos(Origen, Destino, Fecha, Passenger);
    		passenger=Passenger;
    	} 
    	catch(Exception e)
    	{
    		System.out.println("$ Error sending a message: " + e.getMessage());
    	}
		return flightList;
    }
    public void ReservarVuelo(FlightDTO MiVuelo){
    	try
    	{	
    		// Add your related to getting the service and sending a message
    		rsl.getService().ReservarVuelo(MiVuelo, UsuarioActivo, passenger );
    	} 
    	catch(Exception e)
    	{
    		System.out.println("$ Error sending a message: " + e.getMessage());
    	}
    }
    public void PagoReserva(String Usuario, int precio)
    {
    	try
    	{
    	// Add your related to getting the service and sending a message
		rsl.getService().PagoReserva(UsuarioActivo, precio);
    	}
		catch(Exception e)
		{
			System.out.println("$ Error sending a message: " + e.getMessage());
		}
	} 
	public void switchServer(String ip, String port, String name)
	{
		
		// Add your code related to switching servers		
		System.out.println("- Switching to server: " + ip + ":" + port + "/" + name);
	}
    public void exit(){
    	System.exit(0);
    }
}