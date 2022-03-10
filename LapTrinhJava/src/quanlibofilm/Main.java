package quanlibofilm;

public class Main {

	/*
	 * Xay dung chuong trinh Java quan li cac bo film tai mot rap chieu film.
	 * Mot bo film bao gom: ten film, nam san xuat, hang san xuat, gia ve, ngay
	 * chieu Hang san xuat bao gom: ten hang san xuat, quoc gia Ngay chieu bao
	 * gom: ngay, thang, nam Xay dung lop va thuc hien cac phuong thuc sau: a.
	 * Kiem tra xem gia ve cua mot phim bat ki co re hon gia ve cua mot phim
	 * khac hay k? b. Cho biet ten cua hang san xuat phim c. Cho biet gia ve cua
	 * phim khi co khuyen mai (vi du nhu sau khi khuyen mai 10%, 20%, ...), So
	 * tien khuyen mai duoc giam tru theo % gia ban
	 */
	public static void main(String[] args) {
		NgayChieu ngayChieu1 = new NgayChieu(17, 5, 2020);
		NgayChieu ngayChieu2 = new NgayChieu(19, 8, 2021);

		HangSanXuat hang1 = new HangSanXuat("Disney", "Viet Nam");
		HangSanXuat hang2 = new HangSanXuat("Marvel", "My");

		BoFilm phim1 = new BoFilm("Ben thuong hai", 2021, hang1, 1000000, ngayChieu1);
		BoFilm phim2 = new BoFilm("Tinh yeu tuoi hoc tro", 2018, hang2, 2000000, ngayChieu2);

		if (phim1.getGiaVe() < phim2.getGiaVe()) {
			System.out.println("Phim " + phim1.getTenFilm() + " co gia ve re hon phim " + phim2.getTenFilm());
		} else {
			System.out.println("Phim " + phim2.getTenFilm() + " co gia ve re hon phim " + phim1.getTenFilm());
		}

		System.out
				.println("Ten cua hang san xuat phim " + phim1.getTenFilm() + " la: " + phim1.getTenHangSanXuatFilm());
		System.out
				.println("Ten cua hang san xuat phim " + phim2.getTenFilm() + " la: " + phim2.getTenHangSanXuatFilm());

		int x = 15;
		System.out.println("Gia ve cua phim " + phim1.getTenFilm() + " khi co khuyen mai la: "
				+ (phim1.getGiaVe() - (phim1.getGiaVe() * x / 100)));
		System.out.println("Gia ve cua phim " + phim2.getTenFilm() + " khi co khuyen mai la: "
				+ (phim2.getGiaVe() - (phim2.getGiaVe() * x / 100)));
	}

}
