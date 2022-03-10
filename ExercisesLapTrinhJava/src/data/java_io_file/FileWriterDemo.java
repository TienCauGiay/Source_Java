package data.java_io_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static final String FILE_NAME = "C:\\Users\\DELL\\workspace\\Input_Output_Flie\\Output.txt";

	public static String[] data_out = { "12 23 34.5 56", "175 392 1", "22" };

	public static void main(String[] args) {
		// Step 1: tạo một liên kết với tập tin/thư mục cần làm việc
		File file = new File(FILE_NAME);
		// Step 2: tạo một file writer để ghi dữ liệu
		FileWriter fw = null;
		// Step 3: tạo một buffered để lưu dữ liệu ghi
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			// Step 4: Xử lí và ghi dữ liệu ra file
			double sum = 0.0;
			for (String s : data_out) {
				bw.write(s);
				bw.newLine();
				String[] list_s = s.split(" ");
				for (String string : list_s) {
					sum += Double.parseDouble(string);
				}
			}
			bw.write("Sum: " + sum);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// Step 5: Đóng các kết nối
				bw.close();
				fw.close();
				System.out.println("Complete write file");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
