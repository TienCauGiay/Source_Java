package game;

public class Main_Game_Sodoku {

	public static void main(String[] args) {
		game_Sodoku a = new game_Sodoku();
		while(a.demSoPhanTuBangKhong() != 0){
			a.hienThiGame();
			a.Nhap();
		}
		System.out.println("YOU WINNNNNNNNNNNN");
	}
}
