package client.GUI;

import java.awt.EventQueue;
import java.net.InetAddress;
import java.net.UnknownHostException;

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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmInicio frame = new frmInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}