package ҽԺסԺ����Ϣ����;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class ҽ����Ϣɾ�� extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Create the frame.
	 */
	public ҽ����Ϣɾ��() {
		setTitle("ҽ����Ϣɾ��");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// ������ʾ
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5220\u9664\u533B\u751F\u4FE1\u606F");
		label.setFont(new Font("����", Font.BOLD, 26));
		label.setBounds(125, 27, 162, 73);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u533B\u751F\u5DE5\u53F7");
		label_1.setFont(new Font("����", Font.BOLD, 12));
		label_1.setBounds(43, 123, 101, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(172, 120, 146, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del();
			}

			private void del() {
				// TODO Auto-generated method stub
				String id=textField.getText();
				
				try{
					String driver = "com.mysql.jdbc.Driver";
		        // ���ݿ����Ӵ�
		        String url = "jdbc:mysql://localhost:3306/�γ�������ݿ�";
		        // �û���
		        String username = "root";
		        // ����
		        String password = "zw19980309";
					 Class.forName(driver);
					    Connection conn = DriverManager.getConnection(url, username, password); 
					    Statement state=conn.createStatement();
					    String sql="DELETE  FROM ҽ�� WHERE ҽ������='"+id+"'";
					    state.executeUpdate(sql);
					    conn.close();
					    JOptionPane.showMessageDialog(ҽ����Ϣɾ��.this, "ɾ���ɹ���");
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(143, 190, 93, 23);
		contentPane.add(btnNewButton);
	}
}
