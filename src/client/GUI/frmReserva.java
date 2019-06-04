package client.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import LN.FlightDTO;
import client.controller.EasyBookingController;

import javax.swing.JButton;

public class frmReserva extends JFrame {

	private JFrame frame;
	private JTextField textField;
	
	
	
	EasyBookingController controller;

	/**
	 * Launch the application.
	 * @param usuario 
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmReserva window = new frmReserva();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmReserva( FlightDTO flights, String usuario) {
		initialize(flights, usuario);
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(FlightDTO flights, String usuario) {
		
		controller.ReservarVuelo(flights);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(46, 72, 385, 159);
		frame.getContentPane().add(list);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFrom.setBounds(22, 32, 56, 16);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTo.setBounds(250, 32, 56, 16);
		frame.getContentPane().add(lblTo);
		
		JLabel lblNewLabel = new JLabel("Number of seats:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(46, 280, 148, 32);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(206, 282, 73, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Pay for it!");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(98, 379, 156, 45);
		
		btnNewButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					controller.PagoReserva(usuario, flights.getPrecio());
					
					frmRegistro window = new frmRegistro();
					window.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
			}
		});
		
		frame.getContentPane().add(btnNewButton);
	}

}
