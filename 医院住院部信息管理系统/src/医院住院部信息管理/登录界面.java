package 医院住院部信息管理;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class 登录界面 extends JFrame {

	private JPanel contentPane;
	private JTextField text;
	private JTextField text_1;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					登录界面 frame = new 登录界面();
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
	public 登录界面() {
		setTitle("管理员登录");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8D26\u53F7");
		label.setBounds(100, 88, 75, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(100, 146, 54, 15);
		contentPane.add(label_1);
		
		text = new JTextField();
		text.setBounds(158, 85, 158, 21);
		contentPane.add(text);
		text.setColumns(10);
		
		text_1 = new JTextField();
		text_1.setBounds(158, 143, 158, 21);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		label_2 = new JLabel("\u7BA1\u7406\u5458\u767B\u5F55");
		label_2.setFont(new Font("宋体", Font.BOLD, 24));
		label_2.setBounds(144, 10, 231, 55);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String driver = "com.mysql.jdbc.Driver";
		        // 数据库连接串
		        String url = "jdbc:mysql://localhost:3306/课程设计数据库";
		        // 用户名
		        String username = "root";
		        // 密码
		        String password = "zw19980309";
		
		try {
			
			  
					try {
						Class.forName(driver);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    Connection conn = DriverManager.getConnection(url, username, password);
			    Statement stmt = (Statement) conn.createStatement();
			    String sql = "select * from 管理员信息";
			    ResultSet result = stmt.executeQuery(sql);
			                
			    while(result.next())
			    {
			                     String managerName = result.getString("账号");
			                     String managerPassword = result.getString("密码");
			                          //此方法是采用SWT做的，以下的text和text_1,是输入用户名和密码的框
			                          //相当与JAVA中的JTextField和JPasswordField类型的变量
			                      if(text.getText().toString().equals(managerName))
			                      {
			                                 if(text_1.getText().toString().equals(managerPassword))
			                            {
			                                       
			                                       new 主界面_();
			                                    
			                             }
			                            else
			                             {
			                                       JOptionPane.showMessageDialog(null,"请输入正确的密码！！！");
			                                       text_1.setText("");
			                              }
			                    
			                      }
			                      else
			                      {
			                                    JOptionPane.showMessageDialog(null,"请输入正确的用户名！！！");
			                                    text.setText("");
			                      }
			          }//end while
			                
			}catch(SQLException ee)
			{
			    System.out.println(ee);
			}
		}
		});
		btnNewButton.setBounds(169, 206, 93, 23);
		contentPane.add(btnNewButton);		
	}
}


