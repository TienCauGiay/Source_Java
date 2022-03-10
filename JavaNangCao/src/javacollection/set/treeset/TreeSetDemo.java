package javacollection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

// Cách dùng tương tự hashset, nhưng treeset sắp thứ tự các phần tử và đảm bảo thứ các phần tử
// khi thêm hoặc xóa phần tử nào đó
public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> setTree = new TreeSet<>();

		setTree.add("a");
		setTree.add("c");
		setTree.add("d");
		setTree.add("b");
		setTree.add("f");

		for (String string : setTree) {
			System.out.println(string);
		}

		setTree.add("e");
		System.out.println("Sau khi thêm phần tử: ");

		for (String string : setTree) {
			System.out.println(string);
		}

	}
}
