package javacollection.sapxep.kieudulieudoituong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// So sánh đối tượng sử dụng comparator
public class Main2 {

	public static void main(String[] args) {
		List<Person2> list = new ArrayList<Person2>();

		list.add(new Person2(1, "a"));
		list.add(new Person2(4, "b"));
		list.add(new Person2(2, "c"));
		list.add(new Person2(5, "e"));
		list.add(new Person2(3, "d"));

		System.out.println("Trước khi sắp xếp: ");
		for (Person2 person2 : list) {
			System.out.println(person2.getId() + " " + person2.getName());
		}

		Collections.sort(list, new Comparator<Person2>() {

			@Override
			public int compare(Person2 o1, Person2 o2) {
				if (o1.getId() > o2.getId()) {
					return 1;
				} else if (o1.getId() < o2.getId()) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		System.out.println("Sau khi sắp xếp theo id: ");
		for (Person2 person2 : list) {
			System.out.println(person2.getId() + " " + person2.getName());
		}

		Collections.sort(list, new Comparator<Person2>() {

			@Override
			public int compare(Person2 o1, Person2 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("Sau khi sắp xếp theo tên: ");
		for (Person2 person2 : list) {
			System.out.println(person2.getId() + " " + person2.getName());
		}
	}

}
