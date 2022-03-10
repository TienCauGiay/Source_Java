package oop.quanlinhanvien;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Student st = new Student();
		Teacher tc = new Teacher();

		input(st);
		info(st);

		input(tc);
		info(tc);

	}

	public static void input(Person p) {
		System.out.println("Enter name: ");
		p.setName(new Scanner(System.in).nextLine());

		System.out.println("Enter address: ");
		p.setAddress(new Scanner(System.in).nextLine());

		if (p instanceof Student) {
			Student st = (Student) p;
			System.out.println("Enter class: ");
			st.setClazz(new Scanner(System.in).nextLine());
		}

		if (p instanceof Teacher) {
			Teacher tc = (Teacher) p;
			System.out.println("Enter khoa: ");
			tc.setKhoa(new Scanner(System.in).nextLine());
		}
	}

	public static void info(Person p) {
		System.out.println("Name: " + p.getName());
		System.out.println("Address: " + p.getAddress());

		if (p instanceof Student) {
			Student st = (Student) p;
			System.out.println("Class: " + st.getClazz());
		}

		if (p instanceof Teacher) {
			Teacher tc = (Teacher) p;
			System.out.println("Khoa: " + tc.getKhoa());
		}
	}
}
