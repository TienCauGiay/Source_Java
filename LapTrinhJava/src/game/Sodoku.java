package game;

import java.util.Scanner;

public class Sodoku {
	
	public static int N = 3;
	
	public static int N_2 = N *N;
	
	public static int game_sodoku[][] = { 
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
	
	// Hien thi ma tran (in ma tran ra man hinh)
	public static void hienThiMaTran(int game[][]) {
		System.out.println();
		for(int i = 0; i < N_2; i++)
		{
			for(int j = 0; j < N_2; j++)
			{
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// Kiem tra phan tu tai vi tri i + j co bang 0 hay khong
	public static int checkBangKhong(int game[][], int row, int col) {
		if(game[row][col] != 0) {
			return 0;
		}
		return 1;
	}
	
	// Kiem tra phan tu co thoa man dieu kien tro choi hay k
	public static int checkPhanTu(int game[][], int row, int col, int gtri) {
		
		// check cot co phan tu vua nhap chua
		for(int j = 0; j < N_2; j++) {
			if(game[row][j] == gtri){
				return 1;
			}
		}
		
		// check hang co phan tu vua nhap chua
		for(int i = 0; i < N_2; i++) {
			if(game[i][col] == gtri) {
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
				if(game[i + r][j + c] == gtri)
					return 3;
			}
		}
		return 0;
	}
	
	// Nhap mot phan tu vao game va kiem tra
	public static void Nhap(int game[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chi so hang: ");
		int row = sc.nextInt();
		System.out.println("Nhap chi so cot: ");
		int col = sc.nextInt();
		System.out.println("Gia tri can nhap: ");
		int gtri = sc.nextInt();
		if(checkBangKhong(game, row - 1, col - 1) == 0)
		{
			System.out.println("Phan tu nay k the bi thay the");
		}
		if(checkBangKhong(game, row - 1, col - 1) == 1)
		{
			if(checkPhanTu(game, row - 1, col - 1, gtri) != 0)
			{
				System.out.println("Phan tu k hop le");
			}
			else
			{
				game[row - 1][col - 1] = gtri;
				System.out.println("Nhap thanh cong");
			}
		}
	}
	
	// Dem so phan tu bang 0 hien tai trong game
	public static int demSoPhanTuBangKhong(int game[][]) {
		int dem = 0;
		for(int i = 0; i < N_2; i++)
		{
			for(int j = 0; j < N_2; j++)
			{
				if(game[i][j] == 0)
					dem++;
			}
		}
		return dem;
	}

	public static void main(String[] args) {
		while(demSoPhanTuBangKhong(game_sodoku) != 0) {
			hienThiMaTran(game_sodoku);
			Nhap(game_sodoku);
		}
		System.out.println("YOU WIN");
	}
		
}
