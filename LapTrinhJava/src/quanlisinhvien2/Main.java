package quanlisinhvien2;

public class Main {

	/*
	 * Xay dung chuong trinh Java ho tro quan li thong tinh Sinh vien,Sinh vien
	 * bao gom: ma sinh vien, ho ten, ngay sinh, diem trung binh, lop Ngay sinh
	 * bao gom ngay thang nam Lop bao gom ten lop va ten khoa
	 * 
	 * a. Cho biet ten khoa ma sinh vien dang theo hoc b. Cho biet hoc sinh co
	 * dau hay k(Diem trung binh >=5.0) c. Kiem tra sinh vien co ngay sinh giong
	 * voi ngay sinh cua mot sinh vien khac khong
	 */

	public static void main(String[] args) {

		Lop lop1 = new Lop("CNTT3", "CNTT");
		Lop lop2 = new Lop("CT1", "Cong Trinh");

		NgaySinh ngay1 = new NgaySinh(17, 5, 2001);
		NgaySinh ngay2 = new NgaySinh(19, 8, 2001);

		SinhVien sv1 = new SinhVien(1, "Bui Ngoc Tien", ngay1, 9.6, lop1);
		SinhVien sv2 = new SinhVien(2, "Nguyen Thuy Linh", ngay2, 6.9, lop2);

		System.out.println(
				"Ten khoa ma sinh vien " + sv1.tenSinhVien() + " dang theo hoc la: " + sv1.getTenKhoaSinhVien());
		System.out.println(
				"Ten khoa ma sinh vien " + sv2.tenSinhVien() + " dang theo hoc la: " + sv2.getTenKhoaSinhVien());

		if (sv1.checkDiemTB() == 1)
			System.out.println("Dau roi");
		else
			System.out.println("Truot roi");

		if (sv1.checkNgaySinh(sv2) == 1)
			System.out.println(
					"Sinh vien " + sv1.tenSinhVien() + " co cung ngay sinh voi sinh vien " + sv2.tenSinhVien());
		else
			System.out.println(
					"Sinh vien " + sv1.tenSinhVien() + " khong cung ngay sinh voi sinh vien " + sv2.tenSinhVien());
	}

}
