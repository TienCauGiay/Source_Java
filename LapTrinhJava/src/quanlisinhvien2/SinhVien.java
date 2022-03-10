package quanlisinhvien2;

public class SinhVien {
	private int maSo;
	private String hoTen;
	private NgaySinh ngaySinh;
	private double diemTB;
	private Lop lop;

	public SinhVien(int maSo, String hoTen, NgaySinh ngaySinh, double diemTB, Lop lop) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	
	public String tenSinhVien() {
		return hoTen;
	}

	public String getTenKhoaSinhVien() {
		return this.lop.getTenKhoa();
	}

	public int checkDiemTB() {
		if (this.diemTB >= 5)
			return 1;
		return 0;
	}

	public int checkNgaySinh(SinhVien a) {
		if (this.ngaySinh.getNgay() == a.ngaySinh.getNgay() && this.ngaySinh.getThang() == a.ngaySinh.getThang() && this.ngaySinh.getNam() == a.ngaySinh.getNam())
			return 1;
		return 0;
	}
}
