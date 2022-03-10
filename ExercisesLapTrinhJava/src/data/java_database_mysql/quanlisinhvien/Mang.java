package data.java_database_mysql.quanlisinhvien;

public class Mang {

	// initialize array
	public static void init_array(int A[], int n, int x) {
		int i;
		for (i = 0; i < n; i++) {
			A[i] = x;
		}
	}

	// Find elements appear most
	public static int find_elmnt_appear_most(int A[], int B[], int n) {
		int i, j;
		int res_max;
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if (B[i] == -1)
					continue;
				if (A[i] == A[j]) {
					(B[i])++;
					B[j] = -1;
				}
			}
		}
		// get the maximum appearance of element
		res_max = max_arr(B, n);
		System.out.println("\nThe elements appear most time is: ");
		int catim = 0;
		for (i = 0; i < n; i++) {
			if (B[i] == res_max)
				catim = A[i];
		}
		return catim;
	}

	// Find maximum element
	public static int max_arr(int A[], int n) {
		int i;
		int max = A[0];
		for (i = 1; i < n; i++)
			if (max < A[i])
				max = A[i];

		return max;
	}

	public static void main(String[] args) {
		int A[] = { 5, 10, 6, 1, 5, 4, 6, 5, 6, 1, 6, 1, 1 };
		int n = A.length;

		// using array B to store the number of appearance time of the element.
		int B[] = new int[n];
		init_array(B, n, 1);
		find_elmnt_appear_most(A, B, n);

	}

}
