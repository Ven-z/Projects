package ҽԺסԺ����Ϣ����;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ��ʿ��Ϣɾ�� extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public ��ʿ��Ϣɾ��() {
		setTitle("��ʿ��Ϣɾ��");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// ������ʾ
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label = new JLabel("��ʿ��Ϣɾ��");
		label.setFont(new Font("����", Font.BOLD, 26));
		label.setBounds(125, 27, 162, 73);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("�����뻤ʿ����");
		label_1.setFont(new Font("����", Font.BOLD, 12));
		label_1.setBounds(43, 123, 101, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 120, 146, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del();
			}

			private void del() {
				// TODO Auto-generated method stub
             String id=textField_1.getText();
				
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
					    String sql="DELETE  FROM ��ʿ WHERE ��ʿ����='"+id+"'";
					    state.executeUpdate(sql);
					    conn.close();
					    JOptionPane.showMessageDialog(��ʿ��Ϣɾ��.this, "ɾ���ɹ���");
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(143, 190, 93, 23);
		contentPane.add(btnNewButton);
				
			}
	}
