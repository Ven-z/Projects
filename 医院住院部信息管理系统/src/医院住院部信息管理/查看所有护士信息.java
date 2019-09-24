package 医院住院部信息管理;

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
public class 查看所有护士信息 extends JFrame {

	private JPanel contentPane;
	private JTable table_6;
	/**
	 * Create the frame.
	 */
	public 查看所有护士信息() {
		setTitle("护士信息列表");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 567, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// 居中显示
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel  tablemodel = new DefaultTableModel(){
			  public boolean isCellEditable(int row,int column){return false;}
		};
		tablemodel.addColumn("护士工号");tablemodel.addColumn("护士姓名");tablemodel.addColumn("年龄");
		tablemodel.addColumn("手术室编号");
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 13, 535, 316);
		contentPane.add(scrollPane_1);
		table_6 = new JTable();
		table_6.setModel(tablemodel);
		table_6.getTableHeader().setReorderingAllowed(false);//不可拖动表格
		table_6.getTableHeader().setResizingAllowed(false); //不可改动表格大小
		
		scrollPane_1.setViewportView(table_6);
		getData_3();

}

	private void getData_3() {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
        // 数据库连接串
        String url = "jdbc:mysql://localhost:3306/课程设计数据库";
        // 用户名
        String username = "root";
        // 密码
        String password = "zw19980309";

try {
	
	    Class.forName(driver);
	    Connection conn = DriverManager.getConnection(url, username, password);
	    Statement stmt = conn.createStatement();

	    String sql = "select * from 护士";
	ResultSet result = stmt.executeQuery(sql);
	DefaultTableModel model = (DefaultTableModel) table_6.getModel();
	while(result.next()) {
		LinkedList<String> list = new LinkedList<>();
		list.add(result.getString("护士工号"));
		list.add(result.getString("护士姓名"));
		list.add(result.getString("年龄"));
		list.add(result.getString("手术室编号"));
		model.addRow(list.toArray());
	}
} catch(Exception e) {

	e.printStackTrace();
}
}

		
	}
