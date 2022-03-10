package oop.quanlichuyenxe;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private String soTuyen;
	private double soKmDiDuoc;

	public ChuyenXeNoiThanh() {
		super();
	}

	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen,
			double soKmDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}

	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}

	public void setSoKmDiDuoc(double soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}

	@Override
	public String toString() {
		return super.toString() + "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKmDiDuoc=" + soKmDiDuoc + "]";
	}

	@Override
	public void nhapThongTinChuyenXe() {
		super.nhapThongTinChuyenXe();
		System.out.println("Nhap so tuyen: ");
		sc.nextLine();
		this.soTuyen = sc.nextLine();
		System.out.println("Nhap soKM di duoc: ");
		this.soKmDiDuoc = sc.nextDouble();
	}

}
