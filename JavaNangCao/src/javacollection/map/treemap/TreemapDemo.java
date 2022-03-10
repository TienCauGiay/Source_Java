package javacollection.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

// Cách dùng tương tự hashmap,
// nhưng các phần tử trong treemap được săp xếp tăng dần theo giá trị key
public class TreemapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "a");
		map.put(3, "b");
		map.put(2, "c");
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
