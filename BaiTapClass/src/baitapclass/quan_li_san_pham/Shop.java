package baitapclass.quan_li_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 2. Tạo lớp Shop gồm các thuộc tính và phương thức sau:
// ArrayList ProductList // lưu danh sách các sản phẩm của shop
// void addProduct() // yêu cầu người dùng nhập thông tin của sản phẩm rồi
// lưu vào Product List
// void removeProduct() // yêu cầu người dùng nhập vào tên sản phẩm sau đó
// tìm và xóa sản phẩm có tên tương ứng trong ProductList
// void iterateProductList() // hiển thị các sản phẩm trong ProductList, gọi
// phương thức viewInfo) của lớp Product,
// tính trung bình cộng đánh giá cho từng sản phẩm và hiển thị thông tin ra
// màn hình.
// void searchProduct() // yêu cầu người dùng nhập vào 2 số, sau đó tìm và
// hiển thị thông tin của những sản phẩm có giá nằm giữa hai số đó.

public class Shop {
	// Attributes
	private List<Product> list;

	// Constructors
	public Shop() {
		super();
		list = new ArrayList<Product>();
	}

	// Setter and getter
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	// Methods
	// Nhập thông tin sản phẩm rồi lưu vào list
	public void addProduct() {
		Product p = new Product();
		System.out.println("Nhập thông tin sản phẩm: ");
		System.out.println("Enter product name: ");
		p.setName(new Scanner(System.in).nextLine());
		System.out.println("Enter description: ");
		p.setDescription(new Scanner(System.in).nextLine());
		System.out.println("Enter price: ");
		p.setPrice(new Scanner(System.in).nextDouble());
		list.add(p);
	}

	// Tìm sản phẩm theo tên và xóa sản phẩm có tên tương ứng trong list
	public void removeProduct() {
		System.out.println("Nhập tên sản phẩm cần tìm: ");
		String tenSP = new Scanner(System.in).nextLine();
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			if (p.getName().equals(tenSP)) {
				itr.remove();
			}
		}
	}

	// Hiển thị list Product
	public void showInfo() {
		int count = 1;
		System.out.println("List product: ");
		for (Product product : list) {
			System.out.println("Sản phẩm thứ: " + count);
			product.viewInfo();
			count++;
		}
	}

	// Tìm kiểm sản phẩm theo giá ở giữa khoảng 2 số mà người dùng nhập vào
	public void searchProduct() {
		System.out.println("Nhập 2 số: ");
		double so1 = new Scanner(System.in).nextDouble();
		double so2 = new Scanner(System.in).nextDouble();
		System.out.println("Danh sách sản phẩm có giá nằm trong khoảng (" + so1 + "," + so2 + ") là: ");
		for (Product product : list) {
			if (product.getPrice() > so1 && product.getPrice() < so2) {
				product.viewInfo();
			}
		}
	}

	// Sắp xếp các sản phẩm theo giá
	public void sortProduct() {
		Collections.sort(list, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else if (o1.getPrice() < o2.getPrice()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	// Tạo menu
	public void menu() {
		while (true) {
			System.out.println("-------------------- Menu --------------------");
			System.out.println("1. Thêm 1 sản phẩm vào list product");
			System.out.println("2. Hiển thị danh sách sản phẩm");
			System.out.println("3. Tìm kiếm sản phẩm theo tên và xóa sản phẩm đó");
			System.out.println("4. Hiển thị thông tin các sản phẩm có giá nằm trong khoảng (a, b)");
			System.out.println("5. Sắp xếp các sản phẩm theo giá");
			System.out.println("0. Exit");
			System.out.println("-------------------- Menu --------------------");

			System.out.println("Nhập lựa chọn: ");
			int lc = new Scanner(System.in).nextInt();
			if (lc < 0 || lc > 5) {
				System.out.println("Nhập lựa chọn (từ 0-5) !");
			} else if (lc == 1) {
				addProduct();
			} else if (lc == 2) {
				showInfo();
			} else if (lc == 3) {
				removeProduct();
			} else if (lc == 4) {
				searchProduct();
			} else if (lc == 5) {
				sortProduct();
			} else {
				break;
			}
		}
	}

}
