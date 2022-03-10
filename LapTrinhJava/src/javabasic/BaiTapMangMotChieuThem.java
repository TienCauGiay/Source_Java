package javabasic;

import java.util.Map;
import java.util.TreeMap;

public class BaiTapMangMotChieuThem {

	public static void addElement(Map<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}

	// Liet ke cac phan tu xuat hien trong mang dung mot lan: dung Map, Treemap
	public static void lietKePhanTu(int[] a) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			addElement(map, a[i]);
		}
		System.out.println("Cac phan tu xuat hien mot lan: ");
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1)
				System.out.print(key + " ");
		}
	}
	
	public static int Kiem_Tra_SNT(int x){
		int dem = 0;
		for(int i = 1; i<=x; i++)
		{
			if(x%i == 0)
			{
				dem++;
			}
		}	
		if(dem == 2)
		{
			return 1;	
		}
		return 0;
	}
	
	public static int kiemTraSoChinhPhuong(int x) {
		int cbh = (int)Math.sqrt(x);
		if(Math.pow(cbh, 2) == x) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
//		int[] a = { 1, 3, 9, 2, 5, 4, 10, 2, 15, 20, 17, -4, -10, 1, 3, 9 };
//		lietKePhanTu(a);
		
//		int dem1 = 1;
//		int n = 0;
//		while(n < 10) {
//			if(Kiem_Tra_SNT(dem1) == 1)
//			{
//				System.out.print(dem1 + " ");
//				n++;
//			}
//			dem1++;
//		}
		
		if(kiemTraSoChinhPhuong(24) == 1)
			System.out.println("La so cp");
		else
			System.out.println("Khong la so sp");
		
		int dem = 0;
		int n = 0;
		
		while(dem < 10) {
			if(kiemTraSoChinhPhuong(n) == 1)
			{
				System.out.print(n + " ");
				dem++;
			}
			n++;
		}
	}

}
