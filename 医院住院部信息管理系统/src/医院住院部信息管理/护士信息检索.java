package ҽԺסԺ����Ϣ����;

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

@SuppressWarnings("serial")
public class ��ʿ��Ϣ���� extends JFrame {

	private JPanel contentPane;
	private JTable table_7;
	
	/**
	 * Create the frame.
	 */
	public ��ʿ��Ϣ����(String key_1) {
		setTitle("��ʿ��Ϣ����");
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
		tablemodel.addColumn("��ʿ����");tablemodel.addColumn("��ʿ����");tablemodel.addColumn("����");
		tablemodel.addColumn("�����ұ��");
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 13, 535, 316);
		contentPane.add(scrollPane_1);
		table_7 = new JTable();
		table_7.setModel(tablemodel);
		table_7.getTableHeader().setReorderingAllowed(false);//�����϶����
		table_7.getTableHeader().setResizingAllowed(false); //���ɸĶ�����С
		
		scrollPane_1.setViewportView(table_7);
		
		getData_3(key_1);	
	}

	private void getData_3(String key_1) {
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
	    Statement stmt = conn.createStatement();

	    String sql = "select * from ��ʿ WHERE ��ʿ���� ='"+ key_1 +"'";
	    ResultSet result = stmt.executeQuery(sql);
		DefaultTableModel model = (DefaultTableModel) table_7.getModel();
		while(result.next()) {
			LinkedList<String> list = new LinkedList<>();
			list.add(result.getString("��ʿ����"));
			list.add(result.getString("��ʿ����"));
			list.add(result.getString("����"));
			list.add(result.getString("�����ұ��"));
			model.addRow(list.toArray());
		}
	} catch(Exception e) {
		e.printStackTrace();
	}

		
	}

}
