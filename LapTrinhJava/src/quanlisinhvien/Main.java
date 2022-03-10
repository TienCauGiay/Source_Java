package quanlisinhvien;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		run();
	}

	static Scanner sc = new Scanner(System.in);

	static void Nhap(NhapSinhVien sv) {
		System.out.println("Nhập mã số sinh viên: ");
		sv.setMaSV(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập họ tên sinh viên: ");
		sv.setHoTen(sc.nextLine());
		System.out.println("Nhập địa chỉ sinh viên: ");
		sv.setDiaChi(sc.nextLine());
		do {
			System.out.println("Nhập số điện thoại (7 số): ");
			sv.setSoDienThoai(sc.nextLine());

		} while (sv.getSoDienThoai().length() != 7);
	}

	public static void run() {
		NhapSinhVien sv[] = null;
		while (true) {
			System.out.println("=============== Menu ==========");
			System.out.println("1. Nhập danh sách sinh viên");
			System.out.println("2. Xuất danh sách sinh viên theo tứ tự tăng dần mã sinh viên");
			System.out.println("0. Kết thúc");
			System.out.println("=============== Menu ==========");
			System.out.println("Nhập lựa chọn: ");
			int luaChon = sc.nextInt();
			int n = 0;


			if (luaChon < 0 || luaChon > 2) {
				System.out.println("Lựa chọn không hợp lệ");
			} else if (luaChon == 1) {
				System.out.println("Số sinh viên cần nhập n = ");
				n = sc.nextInt();
				sv = new NhapSinhVien[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Sinh viên thứ " + (i + 1) + " :");
					sv[i] = new NhapSinhVien();
					Nhap(sv[i]);
				}
			} else if (luaChon == 2) {
				NhapSinhVien tg = sv[0];
				for (int i = 0; i < sv.length - 1; i++) {
					for (int j = i + 1; j < sv.length; j++) {
						if (sv[i].getMaSV() > sv[j].getMaSV()) {
							tg = sv[i];
							sv[i] = sv[j];
							sv[j] = tg;
						}
					}
				}
				System.out.printf("%5s %20s %20s %15s \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
				for (int i = 0; i < sv.length; i++) {
					sv[i].hienThiThongTin();
				}
			} else {
				break;
			}
		}
		return;
	}

}
