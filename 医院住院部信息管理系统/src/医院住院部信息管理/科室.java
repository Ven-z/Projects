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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;
import com.mysql.*;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@SuppressWarnings({ "unused", "serial" })
public class ���� extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	
	public ����() {
		setTitle("����");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 567, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// ������ʾ
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel  tablemodel = new DefaultTableModel(){
			  public boolean isCellEditable(int row,int column){return false;}
		};
		tablemodel.addColumn("���ұ��");tablemodel.addColumn("��������");tablemodel.addColumn("���ҵ�ַ");
		tablemodel.addColumn("��ϵ�绰");
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 13, 535, 316);
		contentPane.add(scrollPane_1);
		table_1 = new JTable();
		table_1.setModel(tablemodel);
		table_1.getTableHeader().setReorderingAllowed(false);//�����϶����
		table_1.getTableHeader().setResizingAllowed(false); //���ɸĶ�����С
		
		scrollPane_1.setViewportView(table_1);
		
		getData();
	}
	
	private void getData() {
		
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
			DefaultTableModel model = (DefaultTableModel) table_1.getModel();
			while(result.next()) {
				LinkedList<String> list = new LinkedList<>();
				list.add(result.getString("���ұ��"));
				list.add(result.getString("��������"));
				list.add(result.getString("���ҵ�ַ"));
				list.add(result.getString("��ϵ�绰"));
				model.addRow(list.toArray());
			}
		} catch(Exception e) {

			e.printStackTrace();
		}
	}

}
