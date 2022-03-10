package baitaptuluyen;

import java.util.Scanner;

public class Bai_8 {

	public static void main(String[] args) {
		// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
		// Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
		// Chương trình sẽ xuất ra phần tử có giá trị lớn nhất và nhỏ nhất.
		// Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n = ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhập " + n + " phần tử số nguyên: ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int tong = 0;
		for(int i = 0; i < n; i++)
		{
			tong += arr[i];
		}
		float tbc = (float)tong/n;
		System.out.println("Trung bình cộng của dãy là: " + tbc);
		int max = arr[0];
		for(int i = 1; i < n; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("Phần tử có giá trị lớn nhất trong mảng là: " + max);
		int min = arr[0];
		for(int i = 1; i < n; i++)
		{
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println("Phần tử có giá trị nhỏ nhất trong mảng là: " + min);
		System.out.println();
		System.out.println("Các phần tử được sắp xếp theo thứ tự ngượi lại là: ");
		for(int i = n - 1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
