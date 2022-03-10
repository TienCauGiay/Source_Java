package javabasic;

import java.util.ArrayList;
import java.util.List;

public class BaiTapMangMotChieu {

	// ◼ Đếm số phần tử dương không chia hết cho 3 trong dãy.
	public static int count(int[] a) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] % 3 != 0)
				dem++;
		}
		return dem;
	}

	// ◼ Tính tổng các phần tử nằm trong khoảng [-5, 25] và trung bình cộng của
	// chúng.
	public static int tong(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= -5 && a[i] <= 25) {
				sum += a[i];
			}
		}
		return sum;
	}

	// Sap xep mang tang dan
	public static void sapXepTang(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
	}

	// ◼ Xác định phần tử lớn nhất trong dãy chia hết cho 3.
	public static int maxChiaHetCho_3(int[] a) {
		sapXepTang(a);
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0)
				min = a[i];
		}
		return min;
	}

	// In mang ra man hinh
	public static void xuatMang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// ◼ Sắp xếp dãy số để các phần tử có giá trị tuyệt đối tăng dần.
	public static void sapXepabs(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (Math.abs(a[i]) > Math.abs(a[j])) {
					int tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
		System.out.println("Cac phan tu cua mang duoc sap xep thep chieu tang dan tri tuyet doi la: ");
		xuatMang(a);
	}

	// ◼ Loại bỏ các phần tử chia hết cho 5 nhưng không chia hết cho 3 khỏi dãy
	// số.
	public static void xoaPhanTu(int[] a) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 5 == 0 && a[i] % 3 != 0) {
				dem++;
			}
		}

		System.out.println(dem);

		int[] b = new int[a.length - dem];
		int dem1 = 0, dem2 = 0;
		while (dem1 < a.length) {
			if (!(a[dem1] % 5 == 0 && a[dem1] % 3 != 0)) {
				b[dem2] = a[dem1];
				dem2++;
			}
			dem1++;
		}
		System.out.println("Mang sau khi xoa cac phan tu ");
		xuatMang(b);

	}

	public static void main(String[] args) {
		int[] a = { -7, 5, -9, 2, 10, 50, 21, -15, -43 };

		System.out.println("So phan tu duong cua mang k chia het cho 3 la: " + count(a));

		System.out.println("Tong cac phan tu trong khoang [-5, 25] la: " + tong(a));

		System.out.println("Phan tu lon nhat chia het cho 3 trong mang la: " + maxChiaHetCho_3(a));

		sapXepabs(a);

		xoaPhanTu(a);

		// Cach 2 y xoa phan tu
		// List<Integer> l = new ArrayList<Integer>();
		//
		// for(int i = 0; i < a.length; i++)
		// {
		// l.add(a[i]);
		// }
		//
		// System.out.println("Xuat danh sach: ");
		// for(int i : l)
		// {
		// System.out.print(i + " ");
		// }
		//
		// for(int i = 0; i < l.size();)
		// {
		// if(l.get(i) % 5 == 0 && l.get(i) % 3 != 0)
		// l.remove(i);
		// else
		// {
		// i++;
		// }
		// }
		//
		// System.out.println("Xuat danh sach sau khi xoa: ");
		// for(int i : l)
		// {
		// System.out.print(i + " ");
		// }
	}

}
