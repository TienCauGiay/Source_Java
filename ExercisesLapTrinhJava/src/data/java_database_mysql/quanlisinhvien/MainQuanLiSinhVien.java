package data.java_database_mysql.quanlisinhvien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainQuanLiSinhVien {

	public static void main(String[] args) {
		List<SinhVien> list_sv = new ArrayList<SinhVien>();
		list_sv = QuanLiSinhVien.listSinhVien();

		for (SinhVien sinhVien : list_sv) {
			System.out.println(sinhVien);
		}
		
		QuanLiSinhVien.svNhomTruong(list_sv);
	}
}
