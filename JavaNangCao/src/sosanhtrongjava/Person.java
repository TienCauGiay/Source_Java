package sosanhtrongjava;

public class Person {
	private int age;
	private String name;

	public Person() {

	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Ghi đè hàm equals để so sánh 2 đối tượng Person theo tuổi
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.getName() == this.name) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
