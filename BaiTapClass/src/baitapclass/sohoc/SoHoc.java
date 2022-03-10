package baitapclass.sohoc;

import java.util.Scanner;

//Tạo class có tên SoHoc gồm có các thuộc tính và phương thức sau:
//+ Thuộc tính private: number1, number2
//+ Phương thức: 
//	- Các hàm tạo không đối số, đầy đủ đối số
//	- Các phương thức get, set cho tất cả các thuộc tính 
//	- inputInfo(): dùng để nhập 2 số number1, number2 
//	- printlnfo(): dùng để hiển thị number1, number2 
//	- addition(): dùng để cộng number1, number2
//	- subtract(): trừ number1, number2 
//	- multi): dùng để nhân number1, number2
//	- division(): dùng để chia number1, number2.

public class SoHoc {
	// Attributes
	private double number1;
	private double number2;

	// constructor
	public SoHoc(double number1, double number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public SoHoc() {
		super();
	}

	// getter and setter
	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	// Method
	public void inputInfo() {
		System.out.println("Enter number1 : ");
		this.number1 = new Scanner(System.in).nextDouble();
		System.out.println("Enter sumber2 : ");
		this.number2 = new Scanner(System.in).nextDouble();
	}
	
	public void outputInfo() {
		System.out.println("Number1 : " + this.number1);
		System.out.println("Number2 : " + this.number2);
	}
	
	public double addition() {
		return this.number1 + this.number2;
	}
	
	public double subtract() {
		return this.number1 - this.number2;
	}
	
	public double multi() {
		return this.number1 * this.number2;
	}
	
	public double division() {
		return this.number1 / this.number2;
	}

}
