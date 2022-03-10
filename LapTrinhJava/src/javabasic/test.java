package javabasic;

public class test {

	public static void demSoLanXuatHien(int[] a) {
		int[] b = a;
		for(int i = 0; i < a.length; i++) {
			int count = 1;
			if( b[i] != 0) {
				b[i] = 0;
				for(int j = i + 1; j < a.length; j++) {
					if(a[j] == a[i]) {
						count++;
						b[j] = 0;
					}
				}
				System.out.println(a[i] + " xuất hiện " + count + " lần");
			}
			
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 10, 9, 8, 2, 9, 5, 4, 12, 15 };
		demSoLanXuatHien(a);
	}

}
