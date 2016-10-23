package rundialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rundialogdemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					rundialogdemo frame = new rundialogdemo();
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
	public rundialogdemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New text");
		lblNewLabel.setIcon(new ImageIcon("F:\\worksplace\\rundialog\\src\\u=1964161247,140991163&fm=21&gp=0.jpg"));
		lblNewLabel.setBounds(10, 10, 186, 68);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrinternetwindows = new JTextArea();
		txtrinternetwindows.setText("\u8BF7\u8F93\u5165\u7A0B\u5E8F\u3001\u6587\u4EF6\u5939\u3001\u6587\u6863\u6216\u8005Internet\u8D44\u6E90\u7684\u540D\u79F0\uFF0CWindows\u5C06\u4E3A\u4F60\u6253\u5F00\u5B83");
		txtrinternetwindows.setLineWrap(true);
		txtrinternetwindows.setBounds(219, 10, 248, 54);
		contentPane.add(txtrinternetwindows);
		
		JLabel lblo = new JLabel("\u6253\u5F00\uFF08O\uFF09");
		lblo.setBounds(41, 127, 54, 15);
		contentPane.add(lblo);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(49, 179, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(208, 179, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u6D4F\u89C8");
		btnNewButton_2.setBounds(374, 179, 93, 23);
		contentPane.add(btnNewButton_2);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(348, 124, 66, 21);
		contentPane.add(comboBox1);
	}
}
