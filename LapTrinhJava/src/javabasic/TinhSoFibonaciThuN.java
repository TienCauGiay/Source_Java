package javabasic;

import java.util.Scanner;

public class TinhSoFibonaciThuN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Tính số Fibonaci thứ n của dãy với n nhập từ bàn phím
		System.out.print("Nhập n = ");
		int n = sc.nextInt();
		System.out.println("Số fibonaci thứ " + n + " là: " + fibonaci(n));

		// Tìm một phần tử trong dãy Fibonaci gần nhất với số m nhập từ bàn phím
		System.out.print("Nhập một số bất kì từ bàn phím: ");
		int m = sc.nextInt();
		int dem = 1;
		while (fibonaci(dem) <= m) {
			dem++;
		}
		if ((m - fibonaci(dem - 1)) <= (fibonaci(dem) - m)) {
			System.out.println("Phần tử trong dãy Fibonaci gần " + m + " nhất là: " + fibonaci(dem - 1));
		} else {
			System.out.println("Phần tử trong dãy Fibonaci gần " + m + " nhất là: " + fibonaci(dem));
		}
		
		// viết chương trình tính tổng n phần tử chẵn đầu tiên
		
		int m1 = 5;
		System.out.println("Tổng " + Tong(m1));
		
	}
	
	public static int Tong(int n) {
		int dem = 0, tong = 0, i = 1;
		while(dem < 3) {
			if(fibonaci(i) % 2 == 0)
			{
				tong += fibonaci(i);
				dem++;
			}
			i++;
		}
		return tong;
	}

	public static int fibonaci(int n) {
		
		if(n == 1 || n == 2)
			return 1;
		return fibonaci(n-1) + fibonaci(n-2);
//		int f0 = 1, f1 = 1, fn = 2;
//		if (n < 0)
//			return -1;
//		else if (n == 0 || n == 1)
//			return n;
//		else {
//			for (int i = 2; i < n; i++) {
//				f0 = f1;
//				f1 = fn;
//				fn = f0 + f1;
//			}
//		}
//		return fn;
	}
}
