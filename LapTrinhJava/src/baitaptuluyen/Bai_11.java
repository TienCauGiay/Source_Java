package baitaptuluyen;

import java.util.Scanner;

public class Bai_11 {

	public static void main(String[] args) {
		// Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem có hợp yêu cầu hay k
		// Yêu cầu về chuỗi là: Có độ dài không quá 20 ký tự, không được chứa ký tự khoảng trắng, bắt đầu bằng một ký tự chữ viết hoa (A - Z),
		// kết thúc bằng một số (0 - 9). (Sử dụng biểu thức chính quy để ràng buộc định dạng)

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi: ");
		String chuoi = sc.nextLine();
		if(chuoi.matches("^[A-Z]{1}[^\\s]{1,18}[0-9]{1}$"))
			System.out.println("Thỏa mãn yêu cầu");
		else
			System.out.println("Không thỏa mãn yêu cầu");
		sc.close();
	}

}
