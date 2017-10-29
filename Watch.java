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
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class Watch extends JFrame implements ActionListener, IWatch{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Watch frame = new Watch();
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
	public Watch() {
		initViews();//lệnh này là sao anh hì
		//gọi ham` thoi chu co gif dau, thay vi bo het trong contructor, a viet ra ham` addComponents, de goi
		//gon gang hon.
		HaNoi haNoi = new HaNoi();
		haNoi.setUi(this);
		haNoi.start();
	}

	private void initViews() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		textField = new JTextField();
		textField.setBounds(126, 11, 172, 34);
		contentPane.add(textField);
		textField.setColumns(10);
	
		
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

	
	@Override
	public void updateUI(int h, int m, int s) {
		SwingUtilities.invokeLater(new Runnable() {
			//cai nay em thay tren mang roi ma k bieet de lamf j
			
			@Override
			public void run() {
				textField.setText(h+"-"+m+"_"+s);
			}
		});
		
	}
	
}
