package baitaptuluyen;

import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		// Viết chương trình cho phép nhập vào một số nguyên dương n,
		// tính tổng tất cả số chẵn trong khoảng từ 0 - n.
		// tìm kết quả phép nhân của số đó với các số từ 1 - 20 ,
		// sau đó in kết quả ra màn hình.
		// in tất cả các số nguyên tố trong khoảng từ 0-n
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên dương n = ");
		int n = sc.nextInt();
		int tong = 0;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0)
				tong += i;
		}
		System.out.println("Tổng = " + tong);
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
		System.out.println("Tất cả các số nguyên tố từ 0-" + n + " là: ");
		for (int i = 1; i <= n; i++) {
			if (KiemTraSoNguyenTo(i) == 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

	public static int KiemTraSoNguyenTo(int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				dem++;
		}
		if (dem == 2)
			return 1;
		return 0;
	}
}
