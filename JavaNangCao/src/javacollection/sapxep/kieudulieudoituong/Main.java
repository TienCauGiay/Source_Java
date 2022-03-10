package javacollection.sapxep.kieudulieudoituong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// So sánh đối tượng sử dụng comparable
public class Main {
	public static void main(String[] args) {
		List<Person> listPerson = new ArrayList<Person>();

		listPerson.add(new Person(1, "A"));
		listPerson.add(new Person(2, "D"));
		listPerson.add(new Person(5, "C"));
		listPerson.add(new Person(3, "E"));
		listPerson.add(new Person(4, "B"));

		System.out.println("Danh sách Person trước khi sắp xếp theo id: ");
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}

		Collections.sort(listPerson);
		System.out.println("Danh sách Person sau khi sắp xếp theo id: ");
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}

	}
}
