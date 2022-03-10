package sodoku.constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import sodoku.datagame.DataGame;

public class Constants {

	public static int ZONE_SIZE = 3;

	public static int GAME_SIZE = 9;

	public static int DEMO_GAME[][] = { { 0, 0, 0, 0, 5, 0, 1, 0, 7 }, { 9, 0, 0, 0, 8, 6, 3, 4, 0 },
			{ 4, 2, 7, 0, 0, 9, 0, 6, 8 }, { 0, 0, 8, 2, 6, 0, 0, 0, 0 }, { 7, 6, 4, 0, 3, 0, 2, 0, 9 },
			{ 0, 3, 2, 0, 0, 4, 6, 8, 0 }, { 8, 7, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 5, 1 },
			{ 2, 0, 0, 0, 0, 8, 4, 7, 3 } };

	// public static void inputDemoGame() {
	// DataGame dtg = new DataGame();
	// try {
	// FileReader fr = new FileReader(dtg.FILE_DATAGAME);
	// BufferedReader br = new BufferedReader(fr);
	//
	// String line;
	// while ((line = br.readLine()) != null) {
	// String[] s = line.split(" ");
	// int count = 0;
	// for (int i = 0; i < GAME_SIZE; i++) {
	// DEMO_GAME[count][i] = Integer.parseInt(s[i]);
	// count++;
	// }
	// }
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }

	// public static void out() {
	// for (int i = 0; i < GAME_SIZE; i++) {
	// for (int j = 0; j < GAME_SIZE; j++) {
	// System.out.print(DEMO_GAME[i][j] + " | ");
	// }
	// System.out.println();
	// }
	// }
	//
	// public static void main(String[] args) {
	// inputDemoGame();
	// out();
	// }
}
