package oop.quanlinhanvien;

import java.util.Scanner;

public class NhanVien {
	private String ten;
	private String diaChi;
	
	public NhanVien() {
		
	}

	public NhanVien(String ten, String diaChi) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.ten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
	}

	public void xuat() {
		System.out.println("Ten nhan vien: " + this.ten);
		System.out.println("Dia chi nhan vien: " + this.diaChi);
	}
}
