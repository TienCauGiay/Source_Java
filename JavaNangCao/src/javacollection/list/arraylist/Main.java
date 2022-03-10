package javacollection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

	//  Nếu chỉ truy xuất và lưu trữ dữ liệu thì dùng Arraylist
	public static void main(String[] args) {
		// Khởi tạo các đối tượng
		Person p1 = new Person(1);
		Person p2 = new Person(2);
		Person p3 = new Person(3);
		
		// Khởi tạo list
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);
		listPerson.add(p1);
		
		// Truy cập đến phần tử của mảng qua chỉ số index, bắt đầu từ chỉ số 0
		Person p = listPerson.get(1);
		System.out.println(p.getId());
		
		// Duyệt các phần tử trong list bằng for Each
		for (Person person : listPerson) {
			System.out.println(person.getId());
		}
		
		// Duyệt bằng for
		for(int i = 0; i < listPerson.size(); i++) {
			System.out.println(listPerson.get(i).getId());
		}
		
		// Xóa phần tử ở vị trí thứ index
		
		listPerson.remove(3);
		for (Person person : listPerson) {
			System.out.println(person.getId());
		}

	}

}
