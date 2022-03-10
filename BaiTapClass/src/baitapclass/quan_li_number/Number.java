package baitapclass.quan_li_number;

import java.util.Scanner;

public class Number {
	// Attributes
	private double number;

	// Constructors
	public Number() {
		super();
	}

	public Number(double number) {
		super();
		this.number = number;
	}

	// Setter and getter
	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	// Methods
	// Nhập số
	public void intputNumber() {
		System.out.println("Enter number: ");
		this.number = new Scanner(System.in).nextDouble();
	}

	// Hiển thị số
	public void showNumber() {
		System.out.println("Number: " + this.number);
	}

	// Kiểm tra number có phải số nguyên hay k
	public void checkInt() {
		if (this.number - (int) this.number == 0) {
			System.out.println(this.number + " là số nguyên");
		} else {
			System.out.println(this.number + " không là số nguyên");
		}
	}

	public void checkChanLe() {
		if (this.number % 2 == 0) {
			System.out.println(this.number + " là số chẵn");
		} else {
			System.out.println(this.number + " là số lẻ");
		}
	}

	public void checkAmDuong() {
		if (this.number > 0) {
			System.out.println(this.number + " là số dương");
		} else if (this.number < 0) {
			System.out.println(this.number + " là số âm");
		} else {
			System.out.println(this.number + " là số 0");
		}
	}

	public void checkChanDuong() {
		if (this.number > 0 && this.number % 2 == 0) {
			System.out.println(this.number + " là số chẵn dương");
		} else {
			System.out.println(this.number + " không là số chẵn dương");
		}
	}

	public void checkLeAm() {
		if (this.number < 0 && this.number % 2 != 0) {
			System.out.println(this.number + " là số lẻ âm");
		} else {
			System.out.println(this.number + " không là số lẻ âm");
		}
	}

	public void checkChinhPhuong() {
		int cbh = (int) Math.sqrt(this.number);
		if (cbh * cbh == this.number) {
			System.out.println(this.number + " là số chính phương");
		} else {
			System.out.println(this.number + " không là số chính phương");
		}
	}

	public void checkNguyenTo() {
		int dem = 0;
		for (int i = 2; i <= Math.sqrt(this.number); i++) {
			if (this.number % i == 0) {
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println(this.number + " là số nguyên tố");
		} else {
			System.out.println(this.number + " không là số nguyên tố");
		}
	}

	// Số hoàn hảo là một số dương mà tổng của các ước k âm của nó bằng chính nó
	// Ví dụ: 6 = 1 + 2 + 3
	public void checkHoanHao() {
		int sum = 0;
		for (int i = 1; i < this.number; i++) {
			if (this.number % i == 0) {
				sum += i;
			}
		}
		if (sum == this.number) {
			System.out.println(this.number + " là số hoàn hảo");
		} else {
			System.out.println(this.number + " không là số hoàn hảo");
		}
	}

}
