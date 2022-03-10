package baitaptuluyen;

import java.util.Scanner;

public class Bai_9 {

	public static void main(String[] args) {
		// Viết chương trình cho phép người dùng nhập vào 5 mã số, lưu 5 mã số này vào một mảng.
		// Chương trình sẽ kiểm tra xem trong 5 mã số này có mã số nào sai định dạng hay không
		// (định dạng là “00yLxxxx” với y là số nguyên từ 2 - 5, x là số nguyên từ 0-9).
		// Nếu có bất kỳ mã số nào sai định dạng thì chương trình in ra “Sai rồi” rồi kết thúc chương trình,
		// ngược lại thì in ra “Đúng rồi”. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

		Scanner sc = new Scanner(System.in);
		String[] maSo = new String[5];
		System.out.println("Nhập 5 mã số: ");
		for(int i = 0; i < 5; i++)
		{
			maSo[i] = sc.nextLine();
			if(!maSo[i].matches("00[2-5]{1}L[0-9]{4}"))
			{
				System.out.println("Bạn đã nhập sai");
				return;
			}
		}
		System.out.println("Bạn đã nhập đúng");
		sc.close();
	}

}
