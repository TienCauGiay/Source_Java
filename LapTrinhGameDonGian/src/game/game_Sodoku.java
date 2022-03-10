  package game;

import java.util.Arrays;
import java.util.Scanner;

public class game_Sodoku {
	private int game_sodoku[][] = {
			{0, 0, 0, 0, 5, 0, 1, 0, 7},
			{9, 0, 0, 0, 8, 6, 3, 4, 0},
			{4, 2, 7, 0, 0, 9, 0, 6, 8},
			{0, 0, 8, 2, 6, 0, 0, 0, 0},
			{7, 6, 4, 0, 3, 0, 2, 0, 9},
			{0, 3, 2, 0, 0, 4, 6, 8, 0},
			{8, 7, 1, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 5, 1},
			{2, 0, 0, 0, 0, 8, 4, 7, 3}	
	};
	private int N = 3;
	private int N_2 = N * N;
	public static Scanner sc = new Scanner(System.in);
	
	// Hàm hiển thị game
	public void hienThiGame() {
		System.out.println();
		for(int i = 0; i < this.N_2; i++){
			for(int j = 0; j < this.N_2; j++){
				System.out.print(game_sodoku[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// Hàm kiểm tra phẩn tử tại vị trí hàng i cột j có bằng 0 hay k
	public int checkBangKhong(int row, int col){
		if(game_sodoku[row][col] != 0)
			return 0;
		return 1;
	}
	
	// Hàm kiểm tra phần tử nhập vào có thoả mãn hay k
	public int checkPhanTu(int row, int col, int gtri){
		
		// check cot co phan tu vua nhap chua
		for(int j = 0; j < N_2; j++) {
			if(game_sodoku[row][j] == gtri){
				return 1;
			}
		}
		
		// check hang co phan tu vua nhap chua
		for(int i = 0; i < N_2; i++) {
			if(game_sodoku[i][col] == gtri) {
				return 2;
			}
		}
		
		// check vung co phan tu vua nhap chua
		int r = row/3; int c = col/3;
		r = r * 3; c = c * 3;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(game_sodoku[i + r][j + c] == gtri)
					return 3;
			}
		}
		return 0;
	}
	
	// Nhap mot phan tu vao game va kiem tra
	public void Nhap() {
		System.out.println("Nhap chi so hang: ");
		int row = sc.nextInt();
		System.out.println("Nhap chi so cot: ");
		int col = sc.nextInt();
		System.out.println("Gia tri can nhap: ");
		int gtri = sc.nextInt();
		if(this.checkBangKhong(row - 1, col - 1) == 0)
		{
			System.out.println("Phan tu nay k the bi thay the");
		}
		if(this.checkBangKhong(row - 1, col - 1) == 1)
		{
			if(this.checkPhanTu(row - 1, col - 1, gtri) != 0)
			{
				System.out.println("Phan tu k hop le");
			}
			else
			{
				game_sodoku[row - 1][col - 1] = gtri;
				System.out.println("Nhap thanh cong");
			}
		}
	}
	
	// Dem so phan tu bang 0 hien tai trong game
	public int demSoPhanTuBangKhong() {
		int dem = 0;
		for(int i = 0; i < this.N_2; i++)
		{
			for(int j = 0; j < this.N_2; j++)
			{
				if(game_sodoku[i][j] == 0)
					dem++;
			}
		}
		return dem;
	}
	
}
