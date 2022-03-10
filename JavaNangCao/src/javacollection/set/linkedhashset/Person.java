package javacollection.set.linkedhashset;

public class Person {
	private int id;

	public Person(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Person) ? (((Person) obj).getId() == this.id) : false;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}
