package baitaptuluyen;

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi
		// chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
		// VD: 1 -> Một, 2 -> Hai, …
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào 1 số nguyên bất kì (từ 0 - 9): ");
		int soBatKi = sc.nextInt();
		switch (soBatKi) {
		case 1:
			System.out.println("Một");
			break;
		case 2:
			System.out.println("Hai");
			break;
		case 3:
			System.out.println("Ba");
			break;
		case 4:
			System.out.println("Bốn");
			break;
		case 5:
			System.out.println("Năm");
			break;
		case 6:
			System.out.println("Sáu");
			break;
		case 7:
			System.out.println("Bảy");
			break;
		case 8:
			System.out.println("Tám");
			break;
		case 9:
			System.out.println("Chín");
			break;
		default:
			break;
		}
		sc.close();
	}

}
