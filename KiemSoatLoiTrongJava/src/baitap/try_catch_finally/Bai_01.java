package baitap.try_catch_finally;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Xây dựng chương trình cho phép từ một tập số nguyên được sinh ra
//ngẫu nhiên (randomize), cho phép người dùng lựa chọn một giá trị n
//bất kỳ và kiểm tra thông qua cơ chế try … catch … finally.
//◼ Nếu người dùng không nhập số nguyên ➔ đưa ra Exception.
//◼ Nếu giá trị n vượt quá kích thước của tập số nguyên ➔ đưa ra Exception.
//◼ Nếu giá trị n thỏa mãn, hiển thị giá trị của phần tử thứ n.
public class Bai_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(10);
		}

		try {
			System.out.println("Nguoi dung nhap lua chon: ");
			int n = sc.nextInt();
			System.out.println("Hiển thị tập radom: ");
			for (int i : a) {
				System.out.printf(i + " ");
			}
			System.out.println("\nGiá trị của phần tử thứ " + n + " là: " + a[n - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nGiá trị vừa nhập vượt quá kích thước của tập số nguyên");
		} catch (InputMismatchException e) {
			System.out.println("Giá trị vừa nhập k phải số nguyên");
		} finally {
			sc.close();
			System.out.println("Kết thúc ở đây");
		}
	}
}
