package ҽԺסԺ����Ϣ����;

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
public class ��¼���� extends JFrame {

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
					��¼���� frame = new ��¼����();
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
	public ��¼����() {
		setTitle("����Ա��¼");
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
		label_2.setFont(new Font("����", Font.BOLD, 24));
		label_2.setBounds(144, 10, 231, 55);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String driver = "com.mysql.jdbc.Driver";
		        // ���ݿ����Ӵ�
		        String url = "jdbc:mysql://localhost:3306/�γ�������ݿ�";
		        // �û���
		        String username = "root";
		        // ����
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
			    String sql = "select * from ����Ա��Ϣ";
			    ResultSet result = stmt.executeQuery(sql);
			                
			    while(result.next())
			    {
			                     String managerName = result.getString("�˺�");
			                     String managerPassword = result.getString("����");
			                          //�˷����ǲ���SWT���ģ����µ�text��text_1,�������û���������Ŀ�
			                          //�൱��JAVA�е�JTextField��JPasswordField���͵ı���
			                      if(text.getText().toString().equals(managerName))
			                      {
			                                 if(text_1.getText().toString().equals(managerPassword))
			                            {
			                                       
			                                       new ������_();
			                                    
			                             }
			                            else
			                             {
			                                       JOptionPane.showMessageDialog(null,"��������ȷ�����룡����");
			                                       text_1.setText("");
			                              }
			                    
			                      }
			                      else
			                      {
			                                    JOptionPane.showMessageDialog(null,"��������ȷ���û���������");
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


