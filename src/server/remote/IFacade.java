package server.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import LN.FlightDTO;

public interface IFacade extends Remote 
{
	public List <FlightDTO> BuscarVuelo(String Origen, String Destino, String Fecha, int Passenger)throws RemoteException;;
	public boolean ReservarVuelo(FlightDTO MiVuelo)throws RemoteException;;
	public boolean PagoReserva(String Usuario, int precio)throws RemoteException;;
	public boolean IniciarSesion(String Usuario, String Contraseña)throws RemoteException;;
	public boolean NuevoUsuario(String Usuario, String Contraseña, String Aut_sys_name, String Payment)throws RemoteException;;
	//public void newTVProgram(String acronym, String description) throws RemoteException;
    //public void receiveMessage(String phone, String text) throws RemoteException;
	String sayHello() throws RemoteException;
}