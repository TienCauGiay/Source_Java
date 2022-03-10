package data.java_exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Xây dựng chương trình cho phép từ một tập số nguyên được sinh ra
//ngẫu nhiên (randomize), cho phép người dùng lựa chọn một giá trị n
//bất kỳ và kiểm tra thông qua cơ chế try … catch … finally.
//◼ Nếu người dùng không nhập số nguyên ➔ đưa ra Exception.
//◼ Nếu giá trị n vượt quá kích thước của tập số nguyên ➔ đưa ra Exception.
//◼ Nếu giá trị n thỏa mãn, hiển thị giá trị của phần tử thứ n

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = rd.nextInt(10);
		}

		for (int i : arr) {
			System.out.printf(i + " ");
		}
		try {
			System.out.println("\nNhập 1 số bất kì: ");
			int index = sc.nextInt();
			System.out.println("Giá trị của mảng ở vị trí " + index + " là: " + arr[index]);
		} catch (InputMismatchException e) {
			System.out.println("Bạn đã nhập giá trị k phải số nguyên");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Giá trị vừa nhập vượt quá giới hạn của mảng");
		} finally {
			sc.close();
			System.out.println("Kết thúc chương trình");
		}
	}

}
