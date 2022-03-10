package oop.quanlichuyenxe;

import java.util.Scanner;

public class ChuyenXe {
	private String maSoChuyen;
	private String hoTenTaiXe;
	private String soXe;
	private double doanhThu;

	Scanner sc = new Scanner(System.in);

	public ChuyenXe() {
		super();
		this.maSoChuyen = "";
		this.hoTenTaiXe = "";
		this.soXe = "";
		this.doanhThu = 0;
	}

	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	@Override
	public String toString() {
		return "ChuyenXe [maSoChuyen=" + maSoChuyen + ", hoTenTaiXe=" + hoTenTaiXe + ", soXe=" + soXe + ", doanhThu="
				+ doanhThu + "]";
	}

	public void nhapThongTinChuyenXe() {
		System.out.println("Nhap ma so chuyen xe: ");
		this.maSoChuyen = sc.nextLine();
		System.out.println("Nhap so ten tai xe: ");
		this.hoTenTaiXe = sc.nextLine();
		System.out.println("Nhap so xe: ");
		this.soXe = sc.nextLine();
		System.out.println("Nhap daonh thu: ");
		this.doanhThu = sc.nextDouble();
	}

}
