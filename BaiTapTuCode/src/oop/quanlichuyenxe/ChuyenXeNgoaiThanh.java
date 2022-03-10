package oop.quanlichuyenxe;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;

	public ChuyenXeNgoaiThanh() {
		super();
	}

	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	@Override
	public String toString() {
		return super.toString() + "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDiDuoc=" + soNgayDiDuoc + "]";
	}

	@Override
	public void nhapThongTinChuyenXe() {
		super.nhapThongTinChuyenXe();
		System.out.println("Nhap noi den: ");
		sc.nextLine();
		this.noiDen = sc.nextLine();
		System.out.println("Nhap so ngay di duoc: ");
		this.soNgayDiDuoc = sc.nextInt();
	}

}
