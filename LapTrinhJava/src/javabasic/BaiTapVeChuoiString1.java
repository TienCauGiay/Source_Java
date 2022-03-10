package javabasic;

public class BaiTapVeChuoiString1 {

	/*
	 * Viết chương trình cho phép loại bỏ các ký tự ‘a’ và đảo ngược chuỗi sau
	 * khi đã loại bỏ. ◼ S_input = “Lap trinh Java khong don gian” ◼ S_output =
	 * “nig nod gnohk vJ hnirt pL”
	 */

	public static void main(String[] args) {
		String s = "Lap trinh Java khong don gian";
		System.out.println("Chuỗi ban đầu là: " + s);
		s = s.replace("a", "");
		System.out.println("Chuỗi sau khi xóa kí tự a là: " + s);
		System.out.println("Chuỗi sau khi đảo ngược là: " + Reverse(s));

	}

	public static String Reverse(String text) {
		String daoNguoc = "";
		for (int i = 0; i < text.length(); i++) {
			daoNguoc = text.charAt(i) + daoNguoc;
		}
		return daoNguoc;
	}

}
