package baitap.try_catch_finally;

import java.util.Scanner;

//Viết chương trình nhập chuỗi String là các số cách nhau bởi dấu cách
//và kiểm tra xem có thỏa mãn không, nếu đúng thì có bao nhiêu số.
//◼ S_input = “2 34.5 -12.9 0 12 1.98” ➔ Output: true, có 6 số.
//◼ S_input = “2 34.5 -12a.9 0 12 1b.98” ➔ Output: false.
public class Bai_02 {

	public static void check(String[] a) {
		String isNum = "[\\-]?[0-9]+[\\.]?[0-9]*";
		int dem = 0;
		for (String string : a) {
			if (!string.matches(isNum))
				dem++;
		}

		if (dem == 0)
			System.out.println("true, có " + a.length + " số");

		if (dem != 0)
			System.out.println("false");
	}

	public static void main(String[] args) {
		String S_input1 = "2 34.5 -12.9 0 12 1.98";
		String S_input2 = "2 34.5 -12a.9 0 12 1b.98";
		String[] tachChuoi1 = S_input1.split("\\s");
		String[] tachChuoi2 = S_input2.split("\\s");

		check(tachChuoi1);
		check(tachChuoi2);
	}

}
