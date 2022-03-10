package quanlisinhvien;

public class NhapSinhVien {
	private int maSV;
	private String hoTen;
	private String diaChi;
	private String soDienThoai;

	// Khởi tạo constructor mặc định
	public NhapSinhVien() {

	}

	public NhapSinhVien(int maSV, String hoTen, String diaChi, String soDienThoai) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public void hienThiThongTin() {
		System.out.printf("%5s %20s %20s %15s \n", maSV, hoTen, diaChi, soDienThoai);
	}
}
