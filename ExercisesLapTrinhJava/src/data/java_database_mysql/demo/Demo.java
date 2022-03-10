package data.java_database_mysql.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	// Static methods: kết nối và làm việc với database
	// database

	public static void dbExample() {
		Connection con = null;
		Statement st = null;
		try {
			// Step 1 : load driver
			Class.forName(DRIVER_PATH);

			System.out.println("Ok Driver is loaded");
			// Step 2: create connection
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);

			System.out.println("Ok Connection is created " + con);

			// Step 3: create statement
			st = con.createStatement();

			System.out.println("Ok Statement is created " + st);

			// Step 4 : comunication mtssql

			String sql = "Select * from student";
			ResultSet rs = st.executeQuery(sql);

			// Thực hiện các tính toán với dữ liệu

			while (rs.next()) {
				int id = rs.getInt(1); // lấy kết quả theo chỉ số cột
				String name = rs.getString("name"); // lấy kết quả theo tên cột
				String address = rs.getString(3);

				Student s = new Student(id, name, address);
				System.out.println(s);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Step 5 : close connection
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
