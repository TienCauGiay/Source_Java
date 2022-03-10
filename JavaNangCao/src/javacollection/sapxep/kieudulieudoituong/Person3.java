package javacollection.sapxep.kieudulieudoituong;

public class Person3 extends Person2 {

	private int age;

	public Person3(int id, String name, int age) {
		super(id, name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
