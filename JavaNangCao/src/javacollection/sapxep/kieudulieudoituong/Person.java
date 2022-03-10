package javacollection.sapxep.kieudulieudoituong;

public class Person implements Comparable<Person> {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	// Sắp xếp theo id
	// @Override
	// public int compareTo(Person o) {
	// if (this.id > o.getId()) {
	// return 1;
	// } else if (this.id < o.getId()) {
	// return -1;
	// } else {
	// return 0;
	// }
	// }

	// Sắp xếp tên theo thứ tự a-z, nếu muốn theo thứ tự z-a thì thêm dấu trừ
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.getName());
	}
}
