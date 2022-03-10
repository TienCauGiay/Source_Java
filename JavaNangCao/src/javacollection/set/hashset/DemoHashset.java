package javacollection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set dùng để lưu trữ các các phần tử duy nhất đã (không được trùng nhau)
// Không thể dùng for trong set mà phải dùng foreach hoặc Iterator
// Set tự động sặp thứ tự cho các phần tử mà nó lưu trữ theo alphab hoặc dãy số tăng dần
// Hiệu năng tốt nhất
public class DemoHashset {

	public static void main(String[] args) {
		
		Set<String> setString = new HashSet<>();
		
		setString.add("a");
		setString.add("c");
		setString.add("b");
		setString.add("d");
		setString.add("f");
		
		for(String s : setString) {
			System.out.println(s);
		}
		
		Iterator<String> itr = setString.iterator();
		
		// Xóa đối tượng trong set k truy cập được bằng chỉ số
		while(itr.hasNext()) {
			String s = itr.next();
			if(s.equals("a"))
				itr.remove();
		}
		
		System.out.println("------------------------");
		for (String string : setString) {
			System.out.println(string);
		}
		
		setString.add("e");
		
		System.out.println("------------------------");
		for (String string : setString) {
			System.out.println(string);
		}
	}

}
