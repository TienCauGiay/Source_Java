package oop.bai_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLiCanBo {
	private List<CanBo> cb;

	public QuanLiCanBo() {

	}

	public QuanLiCanBo(List<CanBo> cb) {
		super();
		this.cb = new ArrayList<>();
	}

	public void themMotCanBo(CanBo a) {
		this.cb.add(a);
	}

	public void timKiemTheoHoten(String ht) {
		for (CanBo canBo : cb) {
			if (canBo.getHoTen().equals(ht))
				System.out.println(canBo.toString());
			else
				System.out.println("Không tìm thấy");
		}
	}

	public void hienThiDanhSachCanBo() {
		System.out.println("Danh sach can bo: ");
		for (CanBo canBo : cb) {
			System.out.println(canBo.toString() + "\n");
		}
	}

	public void run() {
		List<CanBo> cb1 = new ArrayList<CanBo>();
		QuanLiCanBo qlcb = new QuanLiCanBo(cb1);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=============== Lua chon ===============");
			System.out.println("1. Them can bo moi");
			System.out.println("2. Tim kiem can bo theo ten");
			System.out.println("3. Hien thi danh sach can bo hien tai");
			System.out.println("0. Thoat khoi chuong trinh");
			System.out.println("========================================");

			int lc;
			System.out.println("Nhap lua chon: ");
			lc = sc.nextInt();

			if (lc < 0 || lc > 3) {
				System.out.println("Nhap lua chon (tu 0-3)");
			} else if (lc == 1) {
				System.out.println("Nhap ho ten: ");
				sc.nextLine();
				String hoTen = sc.nextLine();
				System.out.println("Nhap tuoi: ");
				int tuoi = sc.nextInt();
				System.out.println("Nhap gioi tinh: ");
				sc.nextLine();
				String gioiTinh = sc.nextLine();
				System.out.println("Nhap dia chi: ");
				String diaChi = sc.nextLine();

				CanBo cb = new CanBo(hoTen, tuoi, gioiTinh, diaChi);
				qlcb.themMotCanBo(cb);
			} else if (lc == 2) {
				System.out.println("Nhap ten can bo can tim: ");
				sc.nextLine();
				String ht = sc.nextLine();
				qlcb.timKiemTheoHoten(ht);
			} else if (lc == 3) {
				qlcb.hienThiDanhSachCanBo();
			} else {
				break;
			}
		}
		sc.close();
	}

}
