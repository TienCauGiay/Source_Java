package baitapclass.quan_li_san_pham;

// 1. Tạo một lớp có tên Product bao gồm các thuộc tính và phương thức sau:
// String Name
// String Description
// double Price // 0 < Price <= 100
// int[] rate // lưu các đánh giá của người dùng cho sản phẩm, giá trị từ 1 - 5
// Void viewInfo) // hiển thị tên, giá và mô tả về sản phẩm

public class Product {
	// Attributes
	private String name; // tên sản phẩm
	private String description; // mô tả sản phẩm
	private double price; // giá sản phẩm
	int rate; // đánh giá của người dùng

	// Constructors
	public Product() {
		super();
	}

	public Product(String name, String description, double price, int rate) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.rate = rate;
	}

	// Getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	// Methods
	public void viewInfo() {
		System.out.println("Product name: " + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Description: " + this.description);
	}

}
