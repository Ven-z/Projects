package ҽԺסԺ����Ϣ����;

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
public class ������_ extends JFrame {

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
					������_ frame = new ������_();
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
	public ������_() {
		setTitle("ҽԺסԺ����Ϣϵͳ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 717, 457);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu_3 = new JMenu("ҽ����Ϣ");
		menuBar.add(menu_3);

		JMenuItem menuItem_9 = new JMenuItem("����");
		menu_3.add(menuItem_9);
        menuItem_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ����();
				
			}
		});
		
		JMenuItem menuItem_10 = new JMenuItem("ҽ����Ϣ���");
		menu_3.add(menuItem_10);
        menuItem_10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ҽ����Ϣ���();
				
			}
		});
		
		JMenuItem menuItem_11 = new JMenuItem("ҽ����Ϣ�޸�");
		menu_3.add(menuItem_11);
        menuItem_11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ҽ����Ϣ�޸�();
				
			}
		});
		
		JMenuItem menuItem_12 = new JMenuItem("ҽ����Ϣɾ��");
		menu_3.add(menuItem_12);
		menuItem_12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ҽ����Ϣɾ��();
				
			}
		});
		
		JMenuItem menuItem_13 = new JMenuItem("ҽ����Ϣ����");
		menuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = JOptionPane.showInputDialog("����Ҫ��ѯ��ҽ������");
				new ҽ����Ϣ����(key); //
			}
		});
		menu_3.add(menuItem_13);
		JMenuItem menuItem_14 = new JMenuItem("�鿴����ҽ����Ϣ");
		menu_3.add(menuItem_14);
		 menuItem_14.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new �鿴����ҽ����Ϣ();
					
				}
			});
		
		
		 menu_1 = new JMenu("��ʿ��Ϣ");
			menuBar.add(menu_1);
			
			JMenuItem menuItem_2 = new JMenuItem("������");
			menu_1.add(menuItem_2);
			 menuItem_2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new ������();
						
					}
				});
			
			JMenuItem menuItem = new JMenuItem("��ʿ��Ϣ���");
			menu_1.add(menuItem);
			 menuItem.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new ��ʿ��Ϣ���();
						
					}
				});
			
			JMenuItem mntmNewMenuItem = new JMenuItem("��ʿ��Ϣ�޸�");
			menu_1.add(mntmNewMenuItem);
			mntmNewMenuItem.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new ��ʿ��Ϣ�޸�();
						
					}
				});
			
			JMenuItem menuItem_1 = new JMenuItem("��ʿ��Ϣɾ��");
			menu_1.add(menuItem_1);
			menuItem_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new ��ʿ��Ϣɾ��();
					
				}
			});
			
			JMenuItem mmenuItem_1 = new JMenuItem("��ʿ��Ϣ����");
			mmenuItem_1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					String key_1 = JOptionPane.showInputDialog("����Ҫ��ѯ�Ļ�ʿ����");
					new ��ʿ��Ϣ����(key_1); //
				}
			});
			menu_1.add(mmenuItem_1);
			JMenuItem mmenuItem_2 = new JMenuItem("�鿴���л�ʿ��Ϣ");
			menu_1.add(mmenuItem_2);
			 mmenuItem_2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new �鿴���л�ʿ��Ϣ();
						
					}
				});
			
			
			JMenu menu = new JMenu("������Ϣ");
			menuBar.add(menu);
			
			
			
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("�˵���ѯ");
			menu.add(mntmNewMenuItem_2);
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new �˵���ѯ();
					
				}
			});
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("������Ϣ���");
			menu.add(mntmNewMenuItem_3);
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new ������Ϣ���();
					
				}
			});
			
			JMenuItem mntmNewMenuItem_5 = new JMenuItem("������Ϣ�޸�");
			menu.add(mntmNewMenuItem_5);
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new ������Ϣ�޸�();
					
				}
			});
			
			JMenuItem ntmNewMenuItem_5 = new JMenuItem("������Ϣɾ��");
			menu.add(ntmNewMenuItem_5);
			ntmNewMenuItem_5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new ������Ϣɾ��();
					
				}
			});
			
			JMenuItem ntmNewMenuItem_6 = new JMenuItem("������Ϣ����");
			menu.add(ntmNewMenuItem_6);
			ntmNewMenuItem_6.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					String key_1 = JOptionPane.showInputDialog("����Ҫ��ѯ�Ĳ��˱��");
					new ������Ϣ����(key_1); //
				}
			});
			
			JMenuItem ntmNewMenuItem_7 = new JMenuItem("�鿴���в�����Ϣ");
			menu.add(ntmNewMenuItem_7);
			ntmNewMenuItem_7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new �鿴���в�����Ϣ();
						
					}
				});
			
			
			
			
			menu_2 = new JMenu("����");
			menuBar.add(menu_2);
			JMenuItem menuItem_16 = new JMenuItem("������ѯ");
			menu_2.add(menuItem_16);
	        menuItem_16.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new ������ѯ();
					
				}
			});
			
			
			menu_4= new JMenu("����");
			menuBar.add(menu_4);
			JMenuItem menuItem_17 = new JMenuItem("������ѯ");
			menu_4.add(menuItem_17);
	        menuItem_17.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new ������ѯ();
					
				}
			});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// ������ʾ
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u533B\u9662\u4F4F\u9662\u90E8\u4FE1\u606F\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 26));
		lblNewLabel.setBounds(213, 144, 243, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u6B22\u8FCE\u5149\u4E34!");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 26));
		lblNewLabel_1.setBounds(279, 209, 122, 31);
		contentPane.add(lblNewLabel_1);
	}

}
