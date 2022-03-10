package oop.quanlichuyenxe;

import java.util.ArrayList;
import java.util.Scanner;

public class MainQuanLiChuyenXe {

	public static void main(String[] args) {
		ArrayList<ChuyenXeNoiThanh> noi = new ArrayList<>();
		ArrayList<ChuyenXeNgoaiThanh> ngoai = new ArrayList<>();

		int soChuyenNoiThanh = 0;
		int soChuyenNgoaiThanh = 0;
		double doanhThuNoiThanh = 0.0;
		double doanhThuNgoaiThanh = 0.0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so chuyen xe noi thanh: ");
		soChuyenNoiThanh = sc.nextInt();

		for (int i = 0; i < soChuyenNoiThanh; i++) {
			System.out.println("Nhap thong tin chuyen xe noi thanh thu " + (i + 1) + " : ");
			ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
			chuyenXeNoiThanh.nhapThongTinChuyenXe();
			doanhThuNoiThanh += chuyenXeNoiThanh.getDoanhThu();
			noi.add(chuyenXeNoiThanh);
		}

		System.out.println("Nhap so chuyen xe ngoai thanh: ");
		soChuyenNgoaiThanh = sc.nextInt();

		for (int i = 0; i < soChuyenNgoaiThanh; i++) {
			System.out.println("Nhap thong tin chuyen xe ngoai thanh thu " + (i + 1) + " : ");
			ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
			chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
			doanhThuNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
			ngoai.add(chuyenXeNgoaiThanh);
		}

		// Hiển thi thông tin chuyến xe nội thành
		for (ChuyenXeNoiThanh chuyenXeNoiThanh : noi) {
			System.out.println(chuyenXeNoiThanh.toString());
		}
		System.out.println("Doanh thu chuyen xe noi thanh: " + doanhThuNoiThanh);

		for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : ngoai) {
			System.out.println(chuyenXeNgoaiThanh.toString());
		}
		System.out.println("Doanh thu chuyen xe noi thanh: " + doanhThuNgoaiThanh);
	}

}
