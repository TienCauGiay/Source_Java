package sosanhtrongjava;

public class EqualsAndHashcode {
	// Trả về true/false
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return true;
		} else {
			return false;
		}
	}

	// Trả về một giá trị nguyên
	@Override
	public int hashCode() {
		return 17;
	}

	public static void main(String[] args) {
		int s = 10;

		Person p1 = new Person();

		Person p2 = new Person();

		// gọi hàm equal đã override
		System.out.println(p1.equals(p2));
	}
}
