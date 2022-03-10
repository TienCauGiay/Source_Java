package data.java_exception;

//Viết chương trình nhập chuỗi String là các số cách nhau bởi dấu cách
//và kiểm tra xem có thỏa mãn không, nếu đúng thì có bao nhiêu số.
//◼ S_input = “2 34.5 -12.9 0 12 1.98” ➔ Output: true, có 6 số.
//◼ S_input = “2 34.5 -12a.9 0 12 1b.98” ➔ Output: false

public class Demo2 {

	public static void check(String[] chuoi) {
		String isNumber = "[\\-]{0,1}[0-9]{1,}[\\.]{0,1}[0-9]*";
		int count = 0;
		for (String s : chuoi) {
			if(!s.matches(isNumber)) {
				count++;
			}
		}
		if(count != 0) {
			System.out.println("false");
		}
		if(count == 0) {
			System.out.println("true\nCó " + chuoi.length + " số");
		}
	}
	
	public static void main(String[] args) {
		String S_input_1 = "2 34.5 -12.9 0 12 1.98";
		String S_input_2 = "2 34.5 -12a.9 0 12 1b.98";
		String S_input_3 = "1.2 3 4 -5.67890";
		
		String[] chuoi_1 = S_input_1.split(" ");
		String[] chuoi_2 = S_input_2.split(" ");

		check(chuoi_1);
		check(chuoi_2);
	}
}
