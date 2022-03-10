package baitaptuluyen;

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		// Viết chương trình cho phép nhập vào 3 số thực
		// Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam
		// giác hay không.
		// Kiểm tra xem tam giác đó có phải là tam giác vuông hay không

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào ba số thực");

		float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat();
		if (a + b > c && b + c > a && c + a > b) {
			System.out.println("Ba số " + a + ", " + b + ", " + c + " là ba cạnh của một tam giác");
		} else {
			System.out.println("Ba số " + a + ", " + b + ", " + c + " không là ba cạnh của một tam giác");
		}
		KiemTraTamGiacVuong(a, b, c);
		sc.close();
	}

	public static void KiemTraTamGiacVuong(float a, float b, float c) {
		if ((a * a + b * b) == c * c || (b * b + c * c) == a * a || (a * a + c * c) == b * b) {
			System.out.println("Tam giác có ba cạnh " + a + ", " + b + ", " + c + " là tam giác vuông");
		} else {
			System.out.println("Tam giác có ba cạnh " + a + ", " + b + ", " + c + " không phải là tam giác vuông");
		}
	}

}
