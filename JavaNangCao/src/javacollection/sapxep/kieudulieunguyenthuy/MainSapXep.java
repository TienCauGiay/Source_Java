package javacollection.sapxep.kieudulieunguyenthuy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Dùng thư việc collections.sort();
public class MainSapXep {
	public static void main(String[] args) {
		// Sắp xếp theo kiểu String
		List<String> listString = new ArrayList<String>();

		listString.add("a");
		listString.add("c");
		listString.add("d");
		listString.add("b");

		System.out.println("Trước khi sắp xếp: ");
		for (String string : listString) {
			System.out.println(string);
		}

		Collections.sort(listString);

		System.out.println("Sau khi sắp xếp: ");
		for (String string : listString) {
			System.out.println(string);
		}

		// Sắp xếp theo kiểu Interger
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(4);
		listInteger.add(2);
		listInteger.add(3);
		listInteger.add(5);

		System.out.println("Trước khi sắp xếp: ");
		for (Integer integer : listInteger) {
			System.out.println(integer);
		}

		Collections.sort(listInteger);

		System.out.println("Sau khi sắp xếp: ");
		for (Integer integer : listInteger) {
			System.out.println(integer);
		}
		
	}
}
