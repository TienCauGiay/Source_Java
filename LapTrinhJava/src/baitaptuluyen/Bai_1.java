package baitaptuluyen;

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta
		// nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
		// Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra
		// “Đây là số nguyên âm”.
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số nguyên bất kì: ");
		int soNguyen = sc.nextInt();
		if (soNguyen > 0) {
			System.out.println("Đây là số nguyên dương");
		} else if (soNguyen == 0) {
			System.out.println("Đây là số 0");
		} else {
			System.out.println("Đây là số nguyên âm");
		}
		sc.close();
	}
}
