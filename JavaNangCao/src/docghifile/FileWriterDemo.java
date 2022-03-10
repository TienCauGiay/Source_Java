package docghifile;

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
		FileWriter fileWriter = null;

		// Step 3: tạo một buffered để lưu dữ liệu ghi
		BufferedWriter bufferedWriter = null;

		try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);

			// Step 4: Xử lí và ghi dữ liệu ra file
			double sum = 0.0;
			for (String s : data_out) {
				bufferedWriter.write(s);
				bufferedWriter.newLine();
				String[] strs = s.split(" ");
				for (String string : strs) {
					sum += Double.parseDouble(string);
				}
				bufferedWriter.write("Sum of elements: " + sum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Step 5: Đóng các kết nối
			System.out.println("Đã xử lí dữ liệu và ghi dữ liệu vào file thành công");

			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
