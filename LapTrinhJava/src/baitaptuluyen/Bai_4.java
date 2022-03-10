package baitaptuluyen;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai_4 {

	public static void main(String[] args) {
		// Viết chương trình cho phép người dùng nhập vào mã số sinh viên
		// Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
		// Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9.
		// (Sử dụng biểu thức chính quy để ràng buộc định dạng)
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên: ");
		String maSinhVien = sc.nextLine();
		String regex = "^B[1-9]{7}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(maSinhVien);
		if (matcher.find()) {
			System.out.println("Mã sinh viên đã đúng định dạng");
		} else {
			System.out.println("Mã sinh viên chưa đúng định dạng");
		}
		sc.close();
	}
}
