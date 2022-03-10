package data.java_io_file.point;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PointMain {

	public static final String FILE_NAME = "C:\\Users\\DELL\\workspace\\Input_Output_Flie\\Point.txt";

	public static List<Point> readPoint() {
		List<Point> list_point = new ArrayList<Point>();

		File file = new File(FILE_NAME);

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				String[] list_line = line.split(";");
				double x = Double.parseDouble(list_line[0]);
				double y = Double.parseDouble(list_line[1]);
				Point p = new Point(x, y);
				list_point.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return list_point;
	}

	public static void main(String[] args) {
		List<Point> list_point = new ArrayList<Point>();

		list_point = readPoint();

		for (Point point : list_point) {
			System.out.println(point);
		}

		int n = list_point.size();
		double sum = 0.0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				sum += list_point.get(i).distance(list_point.get(j));
			}
		}
		System.out.println("Number of Point: " + n);
		System.out.println("Total distance: " + sum);
	}
}
