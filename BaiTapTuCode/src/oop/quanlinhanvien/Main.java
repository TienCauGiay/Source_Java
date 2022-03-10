package oop.quanlinhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Cách 1:
//		List<NhanVien> lnv = new ArrayList<NhanVien>();
//
//		int soLuongNhanVien = 5;
//
//		for (int i = 0; i < soLuongNhanVien; i++) {
//			NhanVien nv = new NhanVien();
//			nv.nhap();
//			lnv.add(nv);
//		}
//
//		for (NhanVien nhanVien : lnv) {
//			nhanVien.xuat();
//		}

		// Cách 2:
		
		NhanVien[] nhanvien = new NhanVien[3];
		for(int i = 0; i < nhanvien.length; i++) {
			nhanvien[i] = new NhanVien();
			nhanvien[i].nhap();
		}
		
		for (NhanVien nhanVien2 : nhanvien) {
			nhanVien2.xuat();
		}

	}
}
