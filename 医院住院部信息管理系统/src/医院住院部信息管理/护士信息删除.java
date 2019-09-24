package 医院住院部信息管理;

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
public class 护士信息删除 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public 护士信息删除() {
		setTitle("护士信息删除");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// 居中显示
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label = new JLabel("护士信息删除");
		label.setFont(new Font("宋体", Font.BOLD, 26));
		label.setBounds(125, 27, 162, 73);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("请输入护士工号");
		label_1.setFont(new Font("宋体", Font.BOLD, 12));
		label_1.setBounds(43, 123, 101, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 120, 146, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("确认");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del();
			}

			private void del() {
				// TODO Auto-generated method stub
             String id=textField_1.getText();
				
				try{
					String driver = "com.mysql.jdbc.Driver";
		        // 数据库连接串
		        String url = "jdbc:mysql://localhost:3306/课程设计数据库";
		        // 用户名
		        String username = "root";
		        // 密码
		        String password = "zw19980309";
					 Class.forName(driver);
					    Connection conn = DriverManager.getConnection(url, username, password); 
					    Statement state=conn.createStatement();
					    String sql="DELETE  FROM 护士 WHERE 护士工号='"+id+"'";
					    state.executeUpdate(sql);
					    conn.close();
					    JOptionPane.showMessageDialog(护士信息删除.this, "删除成功！");
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(143, 190, 93, 23);
		contentPane.add(btnNewButton);
				
			}
	}
