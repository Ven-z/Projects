package 医院住院部信息管理;

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
public class 手术查询 extends JFrame {

	private JPanel contentPane;
	private JTable table_2;

	
	public 手术查询() {
		setTitle("手术查询");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 567, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null);// 居中显示
		setContentPane(contentPane);
		
		DefaultTableModel  tablemodel = new DefaultTableModel(){
			  public boolean isCellEditable(int row,int column){return false;}
		};
		tablemodel.addColumn("手术编号");tablemodel.addColumn("手术名称");tablemodel.addColumn("手术费用");
		tablemodel.addColumn("手术室编号 ");tablemodel.addColumn("病人编号 ");
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 13, 535, 316);
		contentPane.add(scrollPane_1);
		table_2 = new JTable();
		table_2.setModel(tablemodel);
		table_2.getTableHeader().setReorderingAllowed(false);//不可拖动表格
		table_2.getTableHeader().setResizingAllowed(false); //不可改动表格大小
		
		scrollPane_1.setViewportView(table_2);
		getData_1();
	}
private void getData_1() {
		
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
	
			    String sql = "select * from 手术";
			ResultSet result = stmt.executeQuery(sql);
			DefaultTableModel model = (DefaultTableModel) table_2.getModel();
			while(result.next()) {
				LinkedList<String> list = new LinkedList<>();
				list.add(result.getString("手术编号"));
				list.add(result.getString("手术名称"));
				list.add(result.getString("手术费用"));
				list.add(result.getString("手术室编号"));
				list.add(result.getString("病人编号"));
				model.addRow(list.toArray());
			}
		} catch(Exception e) {

			e.printStackTrace();
		}
	}

}
