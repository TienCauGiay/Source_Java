package javabasic;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Bước 1: Nhập hệ số

		System.out.println("Nhập hệ số a, b, c");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		// Bước 2: Thuật toán

		double delta, x1, x2;
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình có vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				System.out.println("Phương trình có nghiệm x = " + -c / b);
			}
		} else {
			delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép x = " + -b / (2 * a));
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt x1 = " + x1 + " , x2 = " + x2);
			}
		}
		sc.close();
	}
}
