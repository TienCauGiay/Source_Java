package oop.persons_student;

import java.util.Scanner;

// I. Tạo lớp Person chứa các thông tin sau:
// - Tên
// - Giới tính
// - Ngày sinh
// - Địa chỉ
// 1. Lớp Person bao gồm đầy đủ các phương thức getter, setter, constructor
// không tham số, constructor đầy đủ tham số.
// 2. Viết phương thức inputlnfo() để nhập thông tin Person từ bàn phím.
// 3. Viết phương thức showInfo() để hiển thị tất cả thông tin Person.

public class Person {
	// Attributes
	private String name;
	private String gender;
	private NgaySinh ngaySinh;
	private String address;

	// Constructor
	public Person() {
		super();
	}

	public Person(String name, String gender, NgaySinh ngaySinh, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.ngaySinh = ngaySinh;
		this.address = address;
	}

	// Getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Methods
	public void inputInfo() {
		System.out.println("Enter name: ");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
		System.out.println("Enter gender: ");
		this.gender = scanner.nextLine();
		System.out.println("Enter birthday: ");
		NgaySinh n = new NgaySinh();
		System.out.print("Day: ");
		n.setDay(scanner.nextInt());
		System.out.print("Month: ");
		scanner.nextLine();
		n.setMonth(scanner.nextInt());
		System.out.print("Year: ");
		scanner.nextLine();
		n.setYear(scanner.nextInt());
		this.setNgaySinh(n);
		System.out.println("Enter address: ");
		scanner.nextLine();
		this.address = scanner.nextLine();
	}

	public void showInfo() {
		System.out.printf("%20s %10s %10s %20s \n", this.name, this.gender, this.ngaySinh, this.address);
	}

}
