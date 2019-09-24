package 医院住院部信息管理;

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
public class 护士信息添加 extends JFrame {

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
	public 护士信息添加() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// 居中显示
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("护士信息添加");
		
		
	
		
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
		lblNewLabel_4.setFont(new Font("宋体", Font.BOLD, 16));
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
					JOptionPane.showMessageDialog(护士信息添加.this,"请添加完全信息");
				else{
					    String driver = "com.mysql.jdbc.Driver";
						// 数据库连接串
						String url = "jdbc:mysql://localhost:3306/课程设计数据库";
						// 用户名
						@SuppressWarnings("unused")
						String username = "root";
						// 密码
						@SuppressWarnings("unused")
						String password = "zw19980309";
					try{
						
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url,"root","zw19980309");
					String sql="INSERT INTO 护士 VALUES(?,?,?,?,?)";
				    PreparedStatement ps=conn.prepareStatement(sql);
				    ps.setString(1, id);
				    ps.setString(2, name);
				    ps.setString(3, age);
				    ps.setString(4, roomid);
				    ps.execute();
				    conn.close(); 
				    JOptionPane.showMessageDialog(护士信息添加.this, "添加成功!");
				}catch(Exception e1){
					e1.printStackTrace();
				}
				}
				
			}
				
		});
	}
}
