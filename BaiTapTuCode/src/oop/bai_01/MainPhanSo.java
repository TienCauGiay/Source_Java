package oop.bai_01;

public class MainPhanSo {

	public static void main(String[] args) {
		PhanSo a1 = new PhanSo(1, 2);
		PhanSo a2 = new PhanSo(4, 4);

		PhanSo a3 = a1.sum(a2);
		a3.rutGon();
		PhanSo a4 = a1.sub(a2);
		a4.rutGon();
		PhanSo a5 = a1.multi(a2);
		a5.rutGon();
		PhanSo a6 = a1.div(a2);
		a6.rutGon();

		System.out.println("Tong: " + a3.toString() + "\nHieu: " + a4.toString() + "\nTich: " + a5.toString()
				+ "\nThuong: " + a6.toString());

		a2.soSanh(a1);

		// Tạo một tập hợp các phân số. Hãy thực hiện chương trình:
		// ◼ Tìm phân số lớn nhất trong tập phân số.
		// ◼ Tính tổng các phân số.
		// ◼ Xác định số phân số không phải số nguyên

		PhanSo[] ps = { a1, a2, a3, a4, a5, a6 };

		System.out.println("Phan so lon nhat la: " + ps[0].phanSoMax(ps));

		System.out.println("Tong cua cac phan so la: " + ps[0].tongPhanSo(ps));

		for (PhanSo phanSo : ps) {
			phanSo.checkPhanSoNguyen();
		}

	}

}
