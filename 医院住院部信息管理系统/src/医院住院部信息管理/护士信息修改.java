package ҽԺסԺ����Ϣ����;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ��ʿ��Ϣ�޸� extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the frame.
	 */
	public ��ʿ��Ϣ�޸�() {
		setTitle("��ʿ��Ϣ�޸�");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// ������ʾ
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("�������뻤ʿ����");
		label_1.setFont(new Font("����", Font.BOLD, 14));
		label_1.setBounds(10, 25, 133, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(161, 22, 169, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitUpdate();
			}

			private void submitUpdate() {
				// TODO Auto-generated method stub
				String driver = "com.mysql.jdbc.Driver";
		        // ���ݿ����Ӵ�
		        String url = "jdbc:mysql://localhost:3306/�γ�������ݿ�";
		        // �û���
		        String username = "root";
		        // ����
		        String password = "zw19980309";
		
		try {
			
			    Class.forName(driver);
			    Connection conn = DriverManager.getConnection(url, username, password);
			    Statement state = conn.createStatement();
			    String sql="UPDATE ��ʿ SET ��ʿ����='"+textField_2.getText()+"',"+
			    "����='" +textField_3.getText()+ "',�����ұ��='" +textField_4.getText()+ "'"+" WHERE ��ʿ����='"+textField_1.getText()+"'";
			    state.executeUpdate(sql);
			    conn.close();
			    JOptionPane.showMessageDialog(��ʿ��Ϣ�޸�.this, "�޸ĳɹ���");
				
			}catch(Exception e1){
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setBounds(214, 248, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u63D0\u4EA4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showNurseData(null);
			}

			private void showNurseData(Object object) {
				// TODO Auto-generated method stub
				String id=textField.getText();
				String driver = "com.mysql.jdbc.Driver";
		        // ���ݿ����Ӵ�
		        String url = "jdbc:mysql://localhost:3306/�γ�������ݿ�";
		        // �û���
		        String username = "root";
		        // ����
		        String password = "zw19980309";
		
		try {
			
			    Class.forName(driver);
			    Connection conn = DriverManager.getConnection(url, username, password);
			    Statement state = conn.createStatement();
			    String sql = "SELECT * FROM ��ʿ WHERE ��ʿ����='"+id+"'";
			    ResultSet result = state.executeQuery(sql);
			   // conn.close();
			    while(result.next()) {
					@SuppressWarnings("unused")
					LinkedList<String> list = new LinkedList<>();
					textField_1.setText(result.getString("��ʿ����"));
					textField_2.setText(result.getString("��ʿ����"));
					textField_3.setText(result.getString("����"));
					textField_4.setText(result.getString("�����ұ��"));
			    }
				} catch(Exception e) {

				e.printStackTrace();
			}
			}

		});
		btnNewButton_1.setBounds(340, 21, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("\u62A4\u58EB\u5DE5\u53F7");
		label.setBounds(30, 91, 54, 15);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 85, 107, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u62A4\u58EB\u59D3\u540D");
		label_2.setBounds(302, 91, 54, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(366, 88, 122, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u5E74\u9F84");
		label_3.setBounds(30, 163, 54, 15);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 160, 107, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u624B\u672F\u5BA4\u7F16\u53F7");
		label_4.setBounds(284, 163, 72, 15);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(366, 160, 122, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
				
