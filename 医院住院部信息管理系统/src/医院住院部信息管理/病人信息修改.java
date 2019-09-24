package 医院住院部信息管理;

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
public class 病人信息修改 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	

	/**
	 * Create the frame.
	 */
	public 病人信息修改() {
		setTitle("病人信息修改");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 644, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// 居中显示
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("\u8BF7\u60A8\u8F93\u5165\u75C5\u4EBA\u7F16\u53F7");
		label_1.setFont(new Font("宋体", Font.BOLD, 14));
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
		        // 数据库连接串
		        String url = "jdbc:mysql://localhost:3306/课程设计数据库";
		        // 用户名
		        String username = "root";
		        // 密码
		        String password = "zw19980309";
		
		try {
			
			    Class.forName(driver);
			    Connection conn = DriverManager.getConnection(url, username, password);
			    Statement state = conn.createStatement();
			    String sql="UPDATE 病人 SET 病人姓名='"+textField_2.getText()+"',"+
			    "地址='"+textField_3.getText()+"',医生工号='"+textField_4.getText()+"',"+
			    		"病房编号='"+textField_5.getText()+"',账单编号='"+textField_6.getText()+"'"+"WHERE 病人编号='"+textField_1.getText()+"'";
			    state.executeUpdate(sql);
			    conn.close();
			    JOptionPane.showMessageDialog(病人信息修改.this, "修改成功！");
				
			}catch(Exception e1){
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setBounds(237, 284, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u63D0\u4EA4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPatientData(null);
			}

			private void showPatientData(Object object) {
				// TODO Auto-generated method stub
				String id=textField.getText();
				String driver = "com.mysql.jdbc.Driver";
		        // 数据库连接串
		        String url = "jdbc:mysql://localhost:3306/课程设计数据库";
		        // 用户名
		        String username = "root";
		        // 密码
		        String password = "zw19980309";
		
		try {
			
			    Class.forName(driver);
			    Connection conn = DriverManager.getConnection(url, username, password);
			    Statement state = conn.createStatement();
			    String sql = "SELECT * FROM 病人 WHERE 病人编号='"+id+"'";
			    ResultSet result = state.executeQuery(sql);
			   // conn.close();
			    while(result.next()) {
					@SuppressWarnings("unused")
					LinkedList<String> list = new LinkedList<>();
					textField_1.setText(result.getString("病人编号"));
					textField_2.setText(result.getString("病人姓名"));
					textField_3.setText(result.getString("地址"));
					textField_4.setText(result.getString("医生工号"));
					textField_5.setText(result.getString("病房编号"));
					textField_6.setText(result.getString("账单编号"));
			    }
				} catch(Exception e) {

				e.printStackTrace();
			}
			}

		});
		btnNewButton_1.setBounds(340, 21, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("\u75C5\u4EBA\u7F16\u53F7");
		label.setBounds(30, 91, 54, 15);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 85, 107, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u75C5\u4EBA\u59D3\u540D");
		label_2.setBounds(302, 91, 54, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(366, 88, 122, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u5730\u5740");
		label_3.setBounds(30, 163, 54, 15);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 160, 107, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u533B\u751F\u5DE5\u53F7");
		label_4.setBounds(302, 163, 54, 15);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(366, 160, 122, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u75C5\u623F\u7F16\u53F7");
		label_5.setBounds(30, 235, 54, 15);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(107, 235, 107, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8D26\u5355\u7F16\u53F7");
		lblNewLabel.setBounds(302, 238, 54, 15);
		contentPane.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(366, 235, 122, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
