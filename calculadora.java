package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
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
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 420, 222);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(130, 11, 162, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 77, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(20, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(76, 76, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 119, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 + val2;
				JOptionPane.showMessageDialog(null, "Resultado: " + total);
			}
		});
		btnNewButton.setBounds(191, 75, 101, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtrair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 - val2;
				JOptionPane.showMessageDialog(null, "Resultado: " + total);
			}
		});
		btnNewButton_1.setBounds(305, 75, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplicar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 * val2;
				JOptionPane.showMessageDialog(null, "Resultado: " + total);
			}
		});
		btnNewButton_2.setBounds(191, 118, 101, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Dividir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 / val2;
				JOptionPane.showMessageDialog(null, "Resultado: " + total);
			}
		});
		btnNewButton_3.setBounds(305, 118, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
	}
}