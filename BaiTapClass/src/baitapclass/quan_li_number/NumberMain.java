package baitapclass.quan_li_number;

import java.util.Scanner;

public class NumberMain {

	public static void main(String[] args) {
		Number nb = new Number();
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1. Input number");
			System.out.println("2. Output number");
			System.out.println("3. Kiểm tra nguyên");
			System.out.println("4. Kiểm tra chẵn lẻ");
			System.out.println("5. Kiểm tra âm dương");
			System.out.println("6. Kiểm tra chẵn dương");
			System.out.println("7. Kiểm tra lẻ âm");
			System.out.println("8. Kiểm tra chính phương");
			System.out.println("9. Kiểm tra nguyên tố");
			System.out.println("10. Kiểm tra hoàn hảo");
			System.out.println("0. Exit");
			System.out.println("------------------------------------");

			System.out.println("Nhập lựa chon: ");
			int lc = new Scanner(System.in).nextInt();

			if (lc < 0 || lc > 10) {
				System.out.println("Vui lòng chọn từ 0 - 10!!!");
			} else if (lc == 1) {
				nb.intputNumber();
			} else if (lc == 2) {
				nb.showNumber();
			} else if (lc == 3) {
				nb.checkInt();
			} else if (lc == 4) {
				nb.checkChanLe();
			} else if (lc == 5) {
				nb.checkAmDuong();
			} else if (lc == 6) {
				nb.checkChanDuong();
			} else if (lc == 7) {
				nb.checkLeAm();
			} else if (lc == 8) {
				nb.checkChinhPhuong();
			} else if (lc == 9) {
				nb.checkNguyenTo();
			} else if (lc == 10) {
				nb.checkHoanHao();
			} else if (lc == 0) {
				break;
			}
		}
	}
}
