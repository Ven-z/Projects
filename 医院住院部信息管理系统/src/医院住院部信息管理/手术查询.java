package ҽԺסԺ����Ϣ����;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings({ "unused", "serial" })
public class ������ѯ extends JFrame {

	private JPanel contentPane;
	private JTable table_2;

	
	public ������ѯ() {
		setTitle("������ѯ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 567, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// ������ʾ
		setContentPane(contentPane);
		
		DefaultTableModel  tablemodel = new DefaultTableModel(){
			  public boolean isCellEditable(int row,int column){return false;}
		};
		tablemodel.addColumn("�������");tablemodel.addColumn("��������");tablemodel.addColumn("��������");
		tablemodel.addColumn("�����ұ�� ");tablemodel.addColumn("���˱�� ");
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 13, 535, 316);
		contentPane.add(scrollPane_1);
		table_2 = new JTable();
		table_2.setModel(tablemodel);
		table_2.getTableHeader().setReorderingAllowed(false);//�����϶����
		table_2.getTableHeader().setResizingAllowed(false); //���ɸĶ�����С
		
		scrollPane_1.setViewportView(table_2);
		getData_1();
	}
private void getData_1() {
		
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
			    Statement stmt = conn.createStatement();
	
			    String sql = "select * from ����";
			ResultSet result = stmt.executeQuery(sql);
			DefaultTableModel model = (DefaultTableModel) table_2.getModel();
			while(result.next()) {
				LinkedList<String> list = new LinkedList<>();
				list.add(result.getString("�������"));
				list.add(result.getString("��������"));
				list.add(result.getString("��������"));
				list.add(result.getString("�����ұ��"));
				list.add(result.getString("���˱��"));
				model.addRow(list.toArray());
			}
		} catch(Exception e) {

			e.printStackTrace();
		}
	}

}
