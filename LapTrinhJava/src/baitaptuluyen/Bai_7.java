package baitaptuluyen;

import java.util.Scanner;

public class Bai_7 {

	public static void main(String[] args) {
		// Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
		// Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
		// Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ
		// 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

		Scanner sc = new Scanner(System.in);
		String[] MSSV = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Mã sinh viên thứ " + (i + 1) + " là: ");
			MSSV[i] = sc.nextLine();
		}
		for (int i = 0; i < 5; i++) {
			if (!MSSV[i].matches("B170[1-9]{4}"))
				System.out.println("Mã sinh viên " + MSSV[i] + " chưa đúng định dạng");
		}
		for (int i = 0; i < 5; i++) {
			if (MSSV[i].matches("B170[1-9]{4}"))
				System.out.println("Mã sinh viên " + MSSV[i] + " đã đúng định dạng");
		}
		sc.close();
	}

}
