package sosanhtrongjava;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person(20, "Tien");
		Person p2 = new Person(20, "Tien");

		System.out.println(p1.equals(p2));
	}
}
