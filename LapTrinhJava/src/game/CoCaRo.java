package game;

import java.util.Scanner;

public class CoCaRo {

	public static int N = 10;

	public static int game_cocaro[][] = { { 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 }, { 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 },
			{ 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 }, { 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 },
			{ 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 }, { 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 },
			{ 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 }, { 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 },
			{ 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 }, { 1, 0, -1, 1, 0, -1, 1, 0, -1, 1 }, };

	// Khoi tao gia tri ban dau cho game bang -1
	public static void khoiTao(int game[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				game[i][j] = -1;
		}
	}

	// Ham kiem tra vi tri (i,j) da duoc dien vao hay chua
	public static boolean checkNull(int game[][], int row, int col) {
		if (game[row][col] == -1)
			return true;
		return false;
	}

	// Hàm kiểm tra hòa: xem còn ô nào chưa được điền hay k
	public static boolean checkO_Trong(int game[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (game[i][j] == -1)
					return false;
			}
		}
		return true;
	}

	// Ham kiem tra 5 ô liên tiếp trên 1 hàng có giá trị bằng nhau hay k
	public static boolean checkHang(int game[][], int row, int col) {
		int start = col - 4 < 0 ? 0 : col - 4;
		int end = col + 4 < N ? col + 4 : N;
		int count = 0;
		for (int j = start; j < end; j++) {
			if (game[row][j] == game[row][col])
				count++;
			if (count == 5)
				return true;
		}
		return false;
	}

	// Hàm kiểm tra 5 ô liên tiếp trên 1 cột có giá trị bằng nhau hay k
	public static boolean checkCot(int[][] game, int row, int col) {
		int start = row - 4 < 0 ? 0 : row - 4;
		int end = row + 4 < N ? row + 4 : N;
		int count = 0;
		for (int i = start; i < end; i++) {
			if (game[i][col] == game[row][col])
				count++;
			if (count == 5)
				return true;
		}
		return false;
	}

	// Hàm kiểm tra theo đường chéo chính có 5 ô liên tiếp hay k
	public static boolean checkDuongCheoChinh(int[][] game, int row, int col) {

		return false;
	}

	// Hàm kiểm tra theo đường chéo phụ có 5 ô liên tiếp hay k
	public static boolean checkDuongCheoPhu(int[][] game, int row, int col) {
		
		return false;
	}

	// Hàm hiển thị game
	public static void showGame(int[][] game) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(game[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		int isPerson1 = 1;
		khoiTao(game_cocaro);
		while (true) {
			// B1: Hiển thị game
			showGame(game_cocaro);

			// B2: Kiểm tra tính dừng: xem có hòa k
			if (checkO_Trong(game_cocaro)) {
				System.out.println("Hòa, game mới");
				sc.close();
				return;
			}

			// B3: Cho phép người chơi input game
			System.out.println("Nhập chỉ số hàng");
			row = sc.nextInt() - 1;
			System.out.println("Nhập chỉ số cột");
			col = sc.nextInt() - 1;
			System.out.println("Nhập giá trị: ");
			// B4: Kiểm tra xem ô cần điền có rỗng hay k, nếu rỗng thì điền k
			// thì continue
			if (!checkNull(game_cocaro, row, col))
				continue;
			game_cocaro[row][col] = isPerson1;

			// B5: Kiểm tra win
			if (checkHang(game_cocaro, row, col) || checkCot(game_cocaro, row, col) || checkDuongCheoChinh(game_cocaro, row, col) ) {
				System.out.println("Bạn đã chiến thắng");
				sc.close();
				return;
			}
			// B6: Chuyển người chơi
			isPerson1 = 1 - isPerson1;
		}

	}

}
