package client.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

import client.controller.EasyBookingController;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class frmInicio extends JFrame {
	
	EasyBookingController controller;

	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public frmInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 500, 519);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to EasyBooking!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(29, 29, 417, 73);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(49, 156, 86, 38);
		getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(49, 225, 86, 38);
		getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(189, 156, 237, 38);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 225, 236, 38);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.setBounds(115, 283, 237, 45);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String Usuario = textField.getText();
					String password = new String(passwordField.getPassword());
					
					if(controller.IniciarSesion(Usuario, password))
					{
						frmBusqueda window = new frmBusqueda(Usuario);
						window.setVisible(true);
					}	
					else
					{
						JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
	
		});
		
		JLabel lblNewLabel_1 = new JLabel("If you have not registered yet...");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(125, 341, 278, 31);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnRegister.setBounds(115, 379, 237, 45);
		btnRegister.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							frmRegistro window = new frmRegistro();
							window.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
					}
			
				});
		getContentPane().add(btnRegister);
	}

}
