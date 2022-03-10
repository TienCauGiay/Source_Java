package quanlibofilm;

public class BoFilm {
	private String tenFilm;
	private int namSanXuat;
	private HangSanXuat hang;
	private long giaVe;
	private NgayChieu ngayChieuFilm;

	public BoFilm(String tenFilm, int namSanXuat, HangSanXuat hang, long giaVe, NgayChieu ngayChieuFilm) {
		super();
		this.tenFilm = tenFilm;
		this.namSanXuat = namSanXuat;
		this.hang = hang;
		this.giaVe = giaVe;
		this.ngayChieuFilm = ngayChieuFilm;
	}

	public String getTenFilm() {
		return tenFilm;
	}

	public void setTenFilm(String tenFilm) {
		this.tenFilm = tenFilm;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public HangSanXuat getHang() {
		return hang;
	}

	public void setHang(HangSanXuat hang) {
		this.hang = hang;
	}

	public long getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(long giaVe) {
		this.giaVe = giaVe;
	}

	public NgayChieu getNgayChieuFilm() {
		return ngayChieuFilm;
	}

	public void setNgayChieuFilm(NgayChieu ngayChieuFilm) {
		this.ngayChieuFilm = ngayChieuFilm;
	}

	public String getTenHangSanXuatFilm() {
		return this.hang.getTenHangSanXuat();
	}

	public void xuatThongTinFilm() {
		System.out.println("Ten phim: " + tenFilm);
		System.out.println("Nam san xuat: " + namSanXuat);
		System.out.println("Hang san xuat: " + hang);
		System.out.println("Gia ve: " + giaVe);
		System.out.println("Ngay chieu: " + ngayChieuFilm);
	}

}
