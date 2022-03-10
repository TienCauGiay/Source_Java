package data.java_database_mysql.quanlisinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuanLiSinhVien {

	public static final String url = "jdbc:mysql://localhost:3306/quanlisinhvien";
	public static final String user = "root";
	public static final String password = "";

	public static List<SinhVien> listSinhVien() {
		List<SinhVien> list_sv = new ArrayList<SinhVien>();

		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, password);

			st = conn.createStatement();
			String sql = "Select * from sinhvien";

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				list_sv.add(
						new SinhVien(rs.getInt(1), rs.getNString(2), rs.getNString(3), rs.getDate(4), rs.getInt(5)));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list_sv;
	}

	public static void insertSinhVien(int id, String name, String address, Date date, int idNhomTruong) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, password);

			st = conn.createStatement();
			String sql = "INSERT INTO sinhvien(id, name, address, ngaySinh, idNhomTruong) VALUES(" + id + ",'" + name
					+ "','" + address + "'," + date + "," + idNhomTruong + ")";
			int rs = st.executeUpdate(sql);
			System.out.println("Đã insert");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void updateSinhVien(int id, String newname) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, password);

			st = conn.createStatement();
			String sql = "UPDATE SinhVien set name = '" + newname + "' where id = " + id;
			int rs = st.executeUpdate(sql);
			System.out.println("Đã update");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void deleteSinhVien(int id) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, password);

			st = conn.createStatement();
			String sql = "delete from SinhVien where id = " + id;
			int rs = st.executeUpdate(sql);
			System.out.println("Đã delete");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void svNhomTruong(List<SinhVien> list_sv) {
		int n = list_sv.size();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = list_sv.get(i).getIdNhomTruong();
		}
		Mang.init_array(b, n, 1);
		int idMax = Mang.find_elmnt_appear_most(a, b, n);
		System.out.println("Sinh viên quản lí nhiều sinh viên khác nhất là: ");
		for (SinhVien i : list_sv) {
			if (i.getId() == idMax) {
				System.out.println(i);
			}
		}
	}
}
