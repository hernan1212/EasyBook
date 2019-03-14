package LP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class frmRegistro extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public frmRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 500, 519);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(44, 94, 65, 46);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPassword.setBounds(44, 153, 108, 46);
		getContentPane().add(lblPassword);
		
		JLabel lblPayment = new JLabel("Payment method");
		lblPayment.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPayment.setBounds(44, 212, 180, 46);
		getContentPane().add(lblPayment);
		
		JLabel lblAuthenticationSys = new JLabel("Authentication sys");
		lblAuthenticationSys.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAuthenticationSys.setBounds(44, 271, 192, 46);
		getContentPane().add(lblAuthenticationSys);
		
		textField = new JTextField();
		textField.setBounds(266, 94, 204, 46);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(266, 153, 204, 46);
		getContentPane().add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paypal", "Visa"}));
		comboBox.setBounds(266, 212, 204, 48);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Google +", "Facebook"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(266, 271, 204, 48);
		getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmBusqueda window1 = new frmBusqueda();
					window1.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(152, 358, 192, 67);
		getContentPane().add(btnNewButton);
		
		JLabel lblEasybooking = new JLabel("EasyBooking");
		lblEasybooking.setForeground(Color.ORANGE);
		lblEasybooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblEasybooking.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblEasybooking.setBounds(70, 13, 351, 68);
		getContentPane().add(lblEasybooking);
	}
}
