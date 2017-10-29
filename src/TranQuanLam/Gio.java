package TranQuanLam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Gio extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gio frame = new Gio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		HaNoi n=new HaNoi();
		
		textField = new JTextField();
		textField.setBounds(126, 11, 172, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField.setText(n.toString());
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 71, 172, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHNi = new JLabel("H\u00E0 N\u1ED9i");
		lblHNi.setBounds(10, 21, 46, 14);
		contentPane.add(lblHNi);
		
		JLabel lblNewYork = new JLabel("New York");
		lblNewYork.setBounds(10, 81, 70, 14);
		contentPane.add(lblNewYork);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		  
	}
}
