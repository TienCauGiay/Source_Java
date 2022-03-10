package javacollection.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

// Linkedhashset cách sử dụng giống như set, nhưng các phần tử k được sắp thứ tự,
// nghĩa là phần tử nào được thêm vào trước thì đứng trước
// So sánh 2 đối tượng bằng nhau trong linkeshashset phải override đồng thời cả equals và hashcode
public class LinkedHashsetDemo {

	public static void main(String[] args) {
		Set<Person> set = new LinkedHashSet<Person>();

		set.add(new Person(1));
		set.add(new Person(3));
		set.add(new Person(4));
		set.add(new Person(2));
		set.add(new Person(5));

		for (Person p : set) {
			System.out.println(p.getId());
		}

		set.remove(new Person(4));

		System.out.println("Sau khi xóa: ");
		for (Person p : set) {
			System.out.println(p.getId());
		}

	}
}
