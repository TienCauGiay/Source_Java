package baitaptuluyen;

import java.util.Scanner;

public class Bai_10 {

	public static void main(String[] args) {
		// Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập
		// vào một ký tự.
		// Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không?
		// Nếu có in ra “Có”, ngược lại in ra “Không”.
		// kiểm tra xem kí tự đó nằm ở vị trí bao nhiêu trong chuỗi
		// Kiểm tra xem chuỗi có số hay k

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi: ");
		String s = sc.nextLine();
		System.out.println("Nhập vào một kí tự: ");
		String kiTu = sc.nextLine();
		if (s.contains(kiTu)) {
			System.out.println("Kí tự " + kiTu + " có trong chuỗi");
			System.out.println("Vị trí của kí tự " + kiTu + " la " + s.indexOf(kiTu));
		} else
			System.out.println("Kí tự " + kiTu + " không có trong chuỗi");
		if (s.matches(".*[0-9]{1,}.*"))
			System.out.println("Chuỗi có số");
		else
			System.out.println("Chuỗi k có số");

		// Kiểm tra xem chữ "a" xuất hiện bao nhiêu lần trong chuỗi, in ra số
		// lần

		int dem1 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				dem1++;
		}
		System.out.println("Chữ a xuất hiện " + dem1 + " lần trong chuỗi");
		sc.close();
	}

}
