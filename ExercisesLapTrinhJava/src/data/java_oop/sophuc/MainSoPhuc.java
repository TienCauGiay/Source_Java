package data.java_oop.sophuc;

import java.util.ArrayList;
import java.util.List;

public class MainSoPhuc {

	public static void main(String[] args) {
		// Khởi tạo số phức
		SoPhuc sp1 = new SoPhuc();
		SoPhuc sp2 = new SoPhuc(1, 2);
		SoPhuc sp3 = new SoPhuc(1, -2);
		SoPhuc sp4 = new SoPhuc(7, 5);
		SoPhuc sp5 = new SoPhuc(-10, 8);
		SoPhuc sp6 = new SoPhuc(3, 0);
		SoPhuc sp7 = new SoPhuc(2, 4);
		SoPhuc sp8 = new SoPhuc(1, 0);

		List<SoPhuc> list = new ArrayList<SoPhuc>();
		list.add(sp1);
		list.add(sp2);
		list.add(sp3);
		list.add(sp4);
		list.add(sp5);
		list.add(sp6);
		list.add(sp7);
		list.add(sp8);

		// Hiển thị danh sách các số phức
		for (SoPhuc soPhuc : list) {
			System.out.println(soPhuc.toString());
		}

		// Trung bình cộng các số phức
		double thuc = 0;
		double ao = 0;
		for (SoPhuc soPhuc : list) {
			thuc += soPhuc.getA();
			ao += soPhuc.getB();
		}
		int n = list.size();
		thuc /= n;
		ao /= n;
		SoPhuc tbc = new SoPhuc(thuc, ao);
		System.out.println("Trung bình cộng các số phức trong dãy là: " + tbc.toString());

		// Xác định số thức có modulus lớn nhất
		double max = list.get(0).modulus();
		SoPhuc s_max = new SoPhuc();
		for (SoPhuc soPhuc : list) {
			if (max < soPhuc.modulus()) {
				max = soPhuc.modulus();
				s_max = soPhuc;
			}
		}
		System.out.println("Số phức có modulus lớn nhất là: " + s_max.toString() + ". Giá trị đó là: " + max);

		// Đếm số phức không có phần ảo
		int count = 0;
		for (SoPhuc soPhuc : list) {
			if (soPhuc.demSoPhucKhongCoPhanAo() == true) {
				count++;
			}
		}
		System.out.println("Có " + count + " số phức không có phần ảo");
	}
}
