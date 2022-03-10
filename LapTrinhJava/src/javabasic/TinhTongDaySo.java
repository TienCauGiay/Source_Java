package javabasic;

import java.util.Scanner;

public class TinhTongDaySo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int n = sc.nextInt();
		System.out.print("Nhập x = ");
		int x = sc.nextInt();
		long S = 1;
		for (int i = 1; i <= n; i++) {
			S += (giaiThua(n) / giaiThua(n - i)) * (Math.pow(x, i) / giaiThua(i));
		}
		System.out.println("Tổng = " + S);
		sc.close();
	}

	public static long giaiThua(int n) {
		long gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		return gt;
	}
}
