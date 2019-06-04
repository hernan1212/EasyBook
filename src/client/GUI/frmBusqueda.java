package client.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.SwingConstants;

import assemble.FlightDTO;
import client.controller.EasyBookingController;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class frmBusqueda extends JFrame{

	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	EasyBookingController controller;
	List <FlightDTO> flightList;
	
	DefaultListModel modeloLista = new DefaultListModel();
	/**
	 * Create the application.
	 * @param usuario 
	 */
	public frmBusqueda(String Usuario, EasyBookingController controller) {
		this.controller=controller;
		initialize(Usuario);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String Usuario) {
		
		setBounds(100, 100, 500, 519);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EasyBooking");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBounds(126, 13, 234, 67);
		getContentPane().add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(12, 189, 458, 190);
		getContentPane().add(list);
		list.setModel(modeloLista);
		
		JLabel lblDepartureAirport = new JLabel("Departure Airport");
		lblDepartureAirport.setBounds(12, 85, 122, 16);
		getContentPane().add(lblDepartureAirport);
		
		textField_3 = new JTextField();
		textField_3.setBounds(12, 114, 122, 28);
		getContentPane().add(textField_3);
		
		JLabel lblArrivalAirport = new JLabel("Arrival Airport");
		lblArrivalAirport.setBounds(165, 85, 122, 16);
		getContentPane().add(lblArrivalAirport);
		
		textField_4 = new JTextField();
		textField_4.setBounds(165, 114, 122, 28);
		getContentPane().add(textField_4);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(332, 85, 122, 16);
		getContentPane().add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(314, 117, 70, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassengers = new JLabel("Passengers");
		lblPassengers.setBounds(400, 85, 75, 16);
		getContentPane().add(lblPassengers);
		
		textField_2 = new JTextField();
		textField_2.setBounds(400, 117, 75, 28);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(152, 385, 192, 67);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String departure_airport = textField_3.getText();
					String arrival_airport = textField_4.getText();
					String date = textField.getText();
					int passengers = Integer.parseInt(textField_2.getText());
					
					flightList = controller.BuscarVuelo(departure_airport, arrival_airport, date, passengers);
					
					for (FlightDTO flights : flightList)
					{
						modeloLista.addElement(flights);
					}
					frmReserva window = new frmReserva((FlightDTO) list.getSelectedValue(), Usuario, controller);
					window.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}
}
