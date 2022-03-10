package javacollection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Map dùng để lưu 1 cặp giá trị (key,value);
// mỗi giá trị key trong map là duy nhất, key có thể là null
public class HashmapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "A");
		map.put(null, "C");
		map.put(2, "B");

		// lấy giá trị các key của Map:
		Set<Integer> keySet = map.keySet();
		
		// Xuất các cặp giá trị (key,value) của Map (cách 1)
		for (Integer integer : keySet) {
			System.out.println(integer + " " + map.get(integer));
		}
		
		map.remove(2);
		// Xuất các cặp giá trị (key,value) của Map (cách 2)
		System.out.println("Sau khi xóa: ");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
