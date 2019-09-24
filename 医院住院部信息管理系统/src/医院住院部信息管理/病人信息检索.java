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
public class 病人信息检索 extends JFrame {

	private JPanel contentPane;
	private JTable table_7;

	/**
	 * Create the frame.
	 */
	public 病人信息检索(String key_2) {
		setTitle("病人信息检索");
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
		tablemodel.addColumn("病人编号");tablemodel.addColumn("病人姓名");tablemodel.addColumn("地址");
		tablemodel.addColumn("医生工号");tablemodel.addColumn("病房编号");tablemodel.addColumn("账单编号");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 13, 535, 316);
		contentPane.add(scrollPane_1);
		table_7 = new JTable();
		table_7.setModel(tablemodel);
		table_7.getTableHeader().setReorderingAllowed(false);//不可拖动表格
		table_7.getTableHeader().setResizingAllowed(false); //不可改动表格大小
		
		scrollPane_1.setViewportView(table_7);
		
		getData_3(key_2);	
	}

	private void getData_3(String key_2) {
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

	    String sql = "select * from 病人 WHERE 病人编号 ='"+ key_2 +"'";
	    ResultSet result = stmt.executeQuery(sql);
		DefaultTableModel model = (DefaultTableModel) table_7.getModel();
		while(result.next()) {
			LinkedList<String> list = new LinkedList<>();
			list.add(result.getString("病人编号"));
			list.add(result.getString("病人姓名"));
			list.add(result.getString("地址"));
			list.add(result.getString("医生工号"));
			list.add(result.getString("病房编号"));
			list.add(result.getString("账单编号"));
			model.addRow(list.toArray());
		}
	} catch(Exception e) {
		e.printStackTrace();
	}

		
	}

}
