package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// iterator dùng để lặp các phần tử trong mảng
// Có thể xóa 1 phần tử ngay trong vòng lặp
public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("e");
		list.add("c");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {			// itr.hasNext() : Kiểm tra xem có phần tử trong mảng k
			String s = itr.next(); 		// itr.next() : lấy giá trị phần tử
			System.out.println(s);
		}
	}
}
