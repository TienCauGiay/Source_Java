package quanlisach;

public class TacGia {
	private String name;
	private Ngay date;

	public TacGia(String name, Ngay date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ngay getDate() {
		return date;
	}

	public void setDate(Ngay date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TacGia [name = " + name + ", date = " + date + "]";
	}
}
