package ҽԺסԺ����Ϣ����;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ��ʿ��Ϣ��� extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public ��ʿ��Ϣ���() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// ������ʾ
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("��ʿ��Ϣ���");
		
		
	
		
		JLabel lblNewLabel = new JLabel("\u62A4\u58EB\u5DE5\u53F7");
		lblNewLabel.setBounds(36, 58, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u62A4\u58EB\u59D3\u540D");
		label.setBounds(36, 98, 54, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("\u5E74\u9F84");
		lblNewLabel_1.setBounds(36, 143, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u624B\u672F\u5BA4\u7F16\u53F7");
		lblNewLabel_2.setBounds(240, 58, 76, 15);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(102, 55, 110, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(102, 95, 110, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 140, 110, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(314, 55, 110, 21);
		contentPane.add(textField_3);
		
		lblNewLabel_4 = new JLabel("\u8F93\u5165\u8981\u6DFB\u52A0\u7684\u62A4\u58EB\u4FE1\u606F");
		lblNewLabel_4.setFont(new Font("����", Font.BOLD, 16));
		lblNewLabel_4.setBounds(132, 10, 184, 21);
		contentPane.add(lblNewLabel_4);
		
		btnNewButton = new JButton("\u63D0\u4EA4");
		btnNewButton.setBounds(174, 194, 93, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addInfo_1();
				
			}

			private void addInfo_1() {
				// TODO Auto-generated method stub
				String id = textField.getText();
				String name= textField_1.getText();
				String age= textField_2.getText();
				String roomid= textField_3.getText();
				if(id.length()==0||name.length()==0||age.length()==0||
						roomid.length()==0)
					JOptionPane.showMessageDialog(��ʿ��Ϣ���.this,"�������ȫ��Ϣ");
				else{
					    String driver = "com.mysql.jdbc.Driver";
						// ���ݿ����Ӵ�
						String url = "jdbc:mysql://localhost:3306/�γ�������ݿ�";
						// �û���
						@SuppressWarnings("unused")
						String username = "root";
						// ����
						@SuppressWarnings("unused")
						String password = "zw19980309";
					try{
						
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url,"root","zw19980309");
					String sql="INSERT INTO ��ʿ VALUES(?,?,?,?,?)";
				    PreparedStatement ps=conn.prepareStatement(sql);
				    ps.setString(1, id);
				    ps.setString(2, name);
				    ps.setString(3, age);
				    ps.setString(4, roomid);
				    ps.execute();
				    conn.close(); 
				    JOptionPane.showMessageDialog(��ʿ��Ϣ���.this, "��ӳɹ�!");
				}catch(Exception e1){
					e1.printStackTrace();
				}
				}
				
			}
				
		});
	}
}
