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
public class ������ extends JFrame {

	private JPanel contentPane;
	private JTable table_8;

	
	public ������() {
		setTitle("������");
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
		tablemodel.addColumn("�����ұ��");tablemodel.addColumn("����������");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 13, 535, 316);
		contentPane.add(scrollPane_1);
		table_8 = new JTable();
		table_8.setModel(tablemodel);
		table_8.getTableHeader().setReorderingAllowed(false);//�����϶����
		table_8.getTableHeader().setResizingAllowed(false); //���ɸĶ�����С
		
		scrollPane_1.setViewportView(table_8);
		
		getData_4();
	}

	private void getData_4() {
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

	    String sql = "select * from ������";
	ResultSet result = stmt.executeQuery(sql);
	DefaultTableModel model = (DefaultTableModel) table_8.getModel();
	while(result.next()) {
		LinkedList<String> list = new LinkedList<>();
		list.add(result.getString("�����ұ��"));
		list.add(result.getString("����������"));
		model.addRow(list.toArray());
	}
} catch(Exception e) {

	e.printStackTrace();
}
}
		
	}
