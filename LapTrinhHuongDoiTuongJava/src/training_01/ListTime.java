package training_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTime {
	private List<Task> list;

	public static final String FILE_NAME = "C:\\Users\\DELL\\workspace\\Input_Output_Flie\\data.txt";

	public ListTime() {
		super();
		list = new ArrayList<Task>();
	}

	public void readFile() {
		File file = new File(FILE_NAME);

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line = "";
			while ((line = br.readLine()) != null) {
				String[] lFile = line.split(" ");
				int count = 0;
				Task t = new Task();
				t.setMaCV(Integer.parseInt(lFile[count++]));
				t.setTenCV(lFile[count++]);
				t.setTimeBD(lFile[count++]);
				t.setTimeKT(lFile[count++]);
				list.add(t);
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
	}

	public void showList() {
		for (Task task : list) {
			System.out.println(task.toString());
		}
	}

	public void timeTreMax() {
		long maxDelay = 0;
		int size = list.size();
		for (int i = 0; i < size - 1; i++) {
			long delay = list.get(i).timeTre(list.get(i + 1));
			if (delay > maxDelay) {
				maxDelay = delay;
			}
		}
		System.out.println("Max delay : " + maxDelay);
	}

	public void sortList() {
		list.sort(new Task());
	}

	public static void main(String[] args) {
		ListTime lt = new ListTime();
		lt.readFile();
		lt.showList();
		lt.sortList();
		lt.timeTreMax();
	}

}
