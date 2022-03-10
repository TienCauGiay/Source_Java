package javacollection.sapxep.kieudulieudoituong;

import java.util.ArrayList;
import java.util.List;

// Sắp xếp các đối tượng sử sụng nhiều thuộc tính
public class Main3 {
	public static void main(String[] args) {
		List<Person3> list = new ArrayList<Person3>();

		list.add(new Person3(1, "a", 20));
		list.add(new Person3(1, "a", 18));
		list.add(new Person3(2, "b", 25));
		list.add(new Person3(2, "a", 30));
		list.add(new Person3(7, "s", 21));
		list.add(new Person3(6, "s", 21));

		System.out.println("Trước khi sắp xếp: ");
		for (Person3 person3 : list) {
			System.out.println(person3.getId() + " " + person3.getName() + " " + person3.getAge());
		}

		list.sort((p1, p2) -> {
			if (p1.getId() > p2.getId()) {
				return 1;
			} else if (p1.getId() < p2.getId()) {
				return -1;
			} else {
				if (p1.getName().compareTo(p2.getName()) > 0) {
					return 1;
				} else if (p1.getName().compareTo(p2.getName()) < 0) {
					return -1;
				} else {
					return p1.getAge() - p2.getAge();
				}
			}
		});

		System.out.println("Sau khi sắp xếp: ");
		for (Person3 person3 : list) {
			System.out.println(person3.getId() + " " + person3.getName() + " " + person3.getAge());
		}
	}
}
