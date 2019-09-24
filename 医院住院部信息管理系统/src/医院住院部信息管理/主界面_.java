package 医院住院部信息管理;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings({ "unused", "serial" })
public class 主界面_ extends JFrame {

	private JPanel contentPane;
	public ImageIcon image;
	JMenu menu_3,menu_1,menu_2,menu_4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					主界面_ frame = new 主界面_();
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
	public 主界面_() {
		setTitle("医院住院部信息系统");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 717, 457);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu_3 = new JMenu("医生信息");
		menuBar.add(menu_3);

		JMenuItem menuItem_9 = new JMenuItem("科室");
		menu_3.add(menuItem_9);
        menuItem_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new 科室();
				
			}
		});
		
		JMenuItem menuItem_10 = new JMenuItem("医生信息添加");
		menu_3.add(menuItem_10);
        menuItem_10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new 医生信息添加();
				
			}
		});
		
		JMenuItem menuItem_11 = new JMenuItem("医生信息修改");
		menu_3.add(menuItem_11);
        menuItem_11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new 医生信息修改();
				
			}
		});
		
		JMenuItem menuItem_12 = new JMenuItem("医生信息删除");
		menu_3.add(menuItem_12);
		menuItem_12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new 医生信息删除();
				
			}
		});
		
		JMenuItem menuItem_13 = new JMenuItem("医生信息检索");
		menuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = JOptionPane.showInputDialog("输入要查询的医生工号");
				new 医生信息检索(key); //
			}
		});
		menu_3.add(menuItem_13);
		JMenuItem menuItem_14 = new JMenuItem("查看所有医生信息");
		menu_3.add(menuItem_14);
		 menuItem_14.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 查看所有医生信息();
					
				}
			});
		
		
		 menu_1 = new JMenu("护士信息");
			menuBar.add(menu_1);
			
			JMenuItem menuItem_2 = new JMenuItem("手术室");
			menu_1.add(menuItem_2);
			 menuItem_2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new 手术室();
						
					}
				});
			
			JMenuItem menuItem = new JMenuItem("护士信息添加");
			menu_1.add(menuItem);
			 menuItem.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new 护士信息添加();
						
					}
				});
			
			JMenuItem mntmNewMenuItem = new JMenuItem("护士信息修改");
			menu_1.add(mntmNewMenuItem);
			mntmNewMenuItem.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new 护士信息修改();
						
					}
				});
			
			JMenuItem menuItem_1 = new JMenuItem("护士信息删除");
			menu_1.add(menuItem_1);
			menuItem_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 护士信息删除();
					
				}
			});
			
			JMenuItem mmenuItem_1 = new JMenuItem("护士信息检索");
			mmenuItem_1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					String key_1 = JOptionPane.showInputDialog("输入要查询的护士工号");
					new 护士信息检索(key_1); //
				}
			});
			menu_1.add(mmenuItem_1);
			JMenuItem mmenuItem_2 = new JMenuItem("查看所有护士信息");
			menu_1.add(mmenuItem_2);
			 mmenuItem_2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new 查看所有护士信息();
						
					}
				});
			
			
			JMenu menu = new JMenu("病人信息");
			menuBar.add(menu);
			
			
			
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("账单查询");
			menu.add(mntmNewMenuItem_2);
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 账单查询();
					
				}
			});
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("病人信息添加");
			menu.add(mntmNewMenuItem_3);
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 病人信息添加();
					
				}
			});
			
			JMenuItem mntmNewMenuItem_5 = new JMenuItem("病人信息修改");
			menu.add(mntmNewMenuItem_5);
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 病人信息修改();
					
				}
			});
			
			JMenuItem ntmNewMenuItem_5 = new JMenuItem("病人信息删除");
			menu.add(ntmNewMenuItem_5);
			ntmNewMenuItem_5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 病人信息删除();
					
				}
			});
			
			JMenuItem ntmNewMenuItem_6 = new JMenuItem("病人信息检索");
			menu.add(ntmNewMenuItem_6);
			ntmNewMenuItem_6.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					String key_1 = JOptionPane.showInputDialog("输入要查询的病人编号");
					new 病人信息检索(key_1); //
				}
			});
			
			JMenuItem ntmNewMenuItem_7 = new JMenuItem("查看所有病人信息");
			menu.add(ntmNewMenuItem_7);
			ntmNewMenuItem_7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new 查看所有病人信息();
						
					}
				});
			
			
			
			
			menu_2 = new JMenu("手术");
			menuBar.add(menu_2);
			JMenuItem menuItem_16 = new JMenuItem("手术查询");
			menu_2.add(menuItem_16);
	        menuItem_16.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 手术查询();
					
				}
			});
			
			
			menu_4= new JMenu("病房");
			menuBar.add(menu_4);
			JMenuItem menuItem_17 = new JMenuItem("病房查询");
			menu_4.add(menuItem_17);
	        menuItem_17.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new 病房查询();
					
				}
			});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// 居中显示
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u533B\u9662\u4F4F\u9662\u90E8\u4FE1\u606F\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 26));
		lblNewLabel.setBounds(213, 144, 243, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u6B22\u8FCE\u5149\u4E34!");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 26));
		lblNewLabel_1.setBounds(279, 209, 122, 31);
		contentPane.add(lblNewLabel_1);
	}

}
