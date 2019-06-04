package client.controller;

import java.awt.EventQueue;
//import java.net.InetAddress;
//import java.net.UnknownHostException;
import java.rmi.RemoteException;

import client.GUI.frmInicio;

public class clsMain {

	public static void main(String[] args) 
	{
	/*	
		try {
			System.out.println(InetAddress.getLocalHost().//getHostAddress());
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	*/	
		EasyBookingController Controller;
		try {
			Controller=new EasyBookingController();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
						frmInicio frame = new frmInicio(Controller);
						frame.setVisible(true);
				}});
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}