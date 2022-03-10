package baitapclass.employee;

import java.util.Scanner;

// Viết class nhân viên gồm các thuộc tính : 
// tên, tuổi, địa chỉ, ti�?n lương(double), tổng số gi�? làm(int)
// Constructor không tham số. Constructor đầy đủ tham số. Các hàm get/set
// Và các phương thức: 
//	- Void inputInfo() : Nhập các thông tin cho nhân viên từ bàn phím 
//	- void printlnfo() : in ra tất cả các thông tin của nhân viên
//	- double tinhThuong(): Tính toán và trả v�? số ti�?n thưởng của nhân viên theo công thức sau:
//		Nếu tổng số gi�? làm của nhân viên >=200 thì thưởng = lương * 20% 
//		Nếu tổng số gi�? làm của nhân viên <200 và >=100 thì thưởng = lương * 10% 
//		Nếu tổng số gi�? làm của nhân viên <100 thì thưởng = 0

public class NhanVien {
	// Attributes
	private String name;
	private int age;
	private String address;
	private double salary;
	private int totalTime;

	// Constructor
	public NhanVien() {
		super();
	}

	public NhanVien(String name, int age, String address, double salary, int totalTime) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.totalTime = totalTime;
	}

	// Getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	// Method
	public void inputInfo() {
		System.out.println("Enter name: ");
		this.name = new Scanner(System.in).nextLine();
		System.out.println("Enter age: ");
		this.age = new Scanner(System.in).nextInt();
		System.out.println("Enter address: ");
		this.address = new Scanner(System.in).nextLine();
		System.out.println("Enter salary: ");
		this.salary = new Scanner(System.in).nextDouble();
		System.out.println("Enter total time: ");
		this.totalTime = new Scanner(System.in).nextInt();
	}

	public void outputInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Address: " + this.address);
		System.out.println("Salary: " + this.salary);
		System.out.println("Total time: " + this.totalTime);
	}

	public double bonus() {
		if (this.totalTime >= 200) {
			return this.salary * 0.2;
		} else if (this.totalTime < 200 && this.totalTime >= 100) {
			return this.salary * 0.1;
		} else {
			return 0.0;
		}
	}

}
