package quanlisach;

public class Main {

	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(17, 5, 2001);
		Ngay ngay2 = new Ngay(19, 8, 2001);

		TacGia tacGia1 = new TacGia("Tien", ngay1);
		TacGia tacGia2 = new TacGia("Linh", ngay2);

		Sach sach1 = new Sach(200000, 2020, "Tinh yeu nam 17 tuoi", tacGia1);
		Sach sach2 = new Sach(250000, 2020, "Ngay quay lai", tacGia2);

		System.out.println("Thong tin quyen sach: ");
		sach1.inRaManHinh();

		if (sach1.checkSachCungNam(sach2) == true) {
			System.out.println(
					"Quyen sach " + sach1.getTenSach() + " cung nam xuat ban voi quyen sach " + sach2.getNamXuatBan());
		} else {
			System.out.println("Quyen sach " + sach1.getTenSach() + " khong cung nam xuat ban voi quyen sach "
					+ sach2.getNamXuatBan());
		}
		
		int x = 20;
		System.out.println("Gia cua quyen sach " + sach1.getTenSach() + " sau khi giam xuong " + x + "% la: " + (sach1.getGiaBan() - sach1.giaSachSauKhiGiam(x)));
		System.out.println("Gia cua quyen sach " + sach2.getTenSach() + " sau khi giam xuong " + x + "% la: " + (sach2.getGiaBan() - sach2.giaSachSauKhiGiam(x)));
	}

}
