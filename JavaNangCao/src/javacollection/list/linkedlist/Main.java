package javacollection.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

import javacollection.list.arraylist.Person;;

public class Main {
	// Nếu thường xuyên thêm sửa xóa thì dùng linkedlist, cách dùng các hàm
	// tương tự như Arraylist
	public static void main(String[] args) {
		List<Person> listPerson = new LinkedList<>();

		Person p1 = new Person(1);
		listPerson.add(p1);

		for (Person person : listPerson) {
			System.out.println(person.getId());
		}
		listPerson.remove(0);
	}
}
