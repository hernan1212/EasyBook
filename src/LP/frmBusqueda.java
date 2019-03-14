package LP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class frmBusqueda extends JFrame{

	private JTextField textField;

	/**
	 * Create the application.
	 */
	public frmBusqueda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		list.setBounds(12, 189, 458, 270);
		getContentPane().add(list);
		
		JLabel lblDepartureAirport = new JLabel("Departure Airport");
		lblDepartureAirport.setBounds(12, 85, 122, 16);
		getContentPane().add(lblDepartureAirport);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 114, 122, 28);
		getContentPane().add(comboBox);
		
		JLabel lblArrivalAirport = new JLabel("Arrival Airport");
		lblArrivalAirport.setBounds(165, 85, 122, 16);
		getContentPane().add(lblArrivalAirport);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(165, 114, 122, 28);
		getContentPane().add(comboBox_1);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(332, 85, 122, 16);
		getContentPane().add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(314, 117, 140, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
}
