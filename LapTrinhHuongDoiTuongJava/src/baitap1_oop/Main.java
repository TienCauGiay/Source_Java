package baitap1_oop;

public class Main {

	public static void main(String[] args) {
		duongthang a1 = new duongthang(1, 0);
		duongthang a2 = new duongthang(3, 4);
		duongthang a3 = new duongthang(-6, 2);
		duongthang a4 = new duongthang(1, -3);
		duongthang a5 = new duongthang(0, 2);

		duongthang[] a = { a1, a2, a3, a4, a5 };

		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].checkPoint(2, 2))
				dem++;
		}

		System.out.println("Có " + dem + " duong thang di qua ");

		double tong = 0.0;

		for (int i = 0; i < a.length; i++) {
			tong += a[i].khoangCach();
		}

		System.out.println("Tong khoang cach tu cac duong thang den goc toa do la: " + tong);
		
		for (duongthang duongthang : a) {
			System.out.println(duongthang.toString());
		}
	}

}
