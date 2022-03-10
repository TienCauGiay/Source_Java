package javabasic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTapVeChuoiString2 {
	
	/*
	 * Viết chương trình nhập chuỗi String là các số cách nhau bởi dấu cách 
	 * và kiểm tra xem có thỏa mãn không, nếu đúng thì có bao nhiêu số.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi là các số cách nhau bởi dấu cách: ");
		String s = sc.nextLine();
		String regex = "^[0-9]{1,}[\\s]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		if(matcher.find())
		{
			System.out.println("Thỏa mãn");
			int dem = -1;
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) != ' ')
					dem++;
			}
			System.out.println("Có " + dem + " số");
		}
		else
		{
			System.out.println("Không thỏa mãn");
		}
		sc.close();
	}

}
