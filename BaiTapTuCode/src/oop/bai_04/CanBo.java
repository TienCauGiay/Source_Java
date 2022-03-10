package oop.bai_04;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;
	
	Scanner sc = new Scanner(System.in);
	
	public CanBo() {
		
	}

	public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}
	
	public void nhap() {
		System.out.println("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		this.tuoi = sc.nextInt();
		System.out.println("Nhap gioi tinh: ");
		sc.nextLine();
		this.gioiTinh = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
	}

}
