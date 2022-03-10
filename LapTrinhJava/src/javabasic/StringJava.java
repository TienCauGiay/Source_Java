package javabasic;

public class StringJava {

	public static void main(String[] args) {
		// Cách tạo đối tượng String:

		// Cách 1: tạo chuỗi bằng java literal

		String s1 = "Welcome";

		// Cách 2:
		char[] ch = { 'j', 'a', 'v', 'a' };
		String s2 = new String(ch);// convert mảng char thành chuỗi
		String s3 = new String("Ngoc Tien"); // Tạo chuỗi bằng từ khóa new
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// charAt(index) : trả về giá trị char cho chỉ số cụ thể, bắt đầu từ chỉ
		// số 0
		char t1 = s3.charAt(2);
		System.out.println(t1);

		// int lengh() : trả về độ dài chuỗi
		System.out.println(ch.length);

		// String substring(int beginindex) : trả về chuỗi bắt đầu từ chỉ số
		// index
		System.out.println(s1.substring(1, 4)); // trả về chuỗi từ chỉ số 1-3,
												// bỏ 4
		System.out.println(s1.substring(2)); // trả về chuỗi từ chỉ số 2 đến hết

		// boolean contains(CharSequence s) : kiểm tra chuỗi có chứa chuỗi hay k
		// nếu đúng trả về true, sai trả về false
		System.out.println(s3.contains("Ngoc"));
		System.out.println(s3.contains("Bui Tien"));

		// static String join(CharSequence delimiter, CharSequence... elements)
		// trả về chuỗi được nối từ nhiều chuỗi
		String s4 = String.join(s1, s2, s3);
		System.out.println(s4);

		// boolean equals(Object another) : Kiểm tra sự tương đương của chuỗi
		// với đối tượng
		// Trả về true / false
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals("Ngoc Tien"));

		// boolean isEmpty() : Kiểm tra chuỗi rỗng
		String s6 = "";
		System.out.println(s6.isEmpty());
		System.out.println(s1.isEmpty());

		// String concat(String str) : Nối chuỗi cụ thể
		s3 = s3.concat(" Bui yeu NTL");
		System.out.println(s3);

		// String replace(char old, char new) : thay thế giá trị char cũ bằng
		// char mới trong một chuỗi
		String s1Replace = s3.replace("NTL", "Linh");
		System.out.println(s1Replace);

		// static String equalsIgnoreCase(String another)
		// So sánh chuỗi k phân biệt chữ hoa chữ thường
		System.out.println(s1.equalsIgnoreCase("WELCOME"));
		System.out.println(s1.equalsIgnoreCase("Good bye"));

		// String[] split(String regex, int limit) : trả về mảng các chuỗi được
		// tách ra theo giá trị regex và có giới hạn
		String[] words = s3.split("\\s"); // tách chuỗi dựa trên khoảng trắng
		for (String w : words) {
			System.out.println(w);
		}

		// int indexOf(int ch) //Trả về vị trị của giá trị Char đã cho.
		// int indexOf(int ch, int fromIndex) //Trả về vị trị của giá trị Char
		// đã cho tính từ vị trí fromIndex.
		// int indexOf(String substring) //Trả về vị trị của chuỗi con.
		// int indexOf(String substring, int fromIndex) //Trả về vị trị của
		// chuỗi con đã cho tính từ vị trí fromIndex.

		// String toLowerCase() : trả về chuỗi chữ thường
		System.out.println(s1.toLowerCase());

		// String toUpperCase() : trả về chuỗi chữ hoa
		System.out.println(s1.toUpperCase());

		// String trim() : xóa khoảng trắng ở đầu và cuỗi của chuỗi
		String tien = "    Bui Ngoc Tien     ";
		System.out.println(tien.trim());

		// static String valueOf(int value) : chuyển đổi kiểu dữ liệu đã cho
		// thành chuỗi
		int gt = 17;
		String gtt = String.valueOf(gt);
		System.out.println(gtt + "/05/2001");
	}

}
