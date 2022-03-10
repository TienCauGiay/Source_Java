package data.java_io_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Đọc dữ liệu từ file/folder
public class FileReaderDemo {

	public static final String FILE_NAME = "C:\\Users\\DELL\\workspace\\Input_Output_Flie\\Input.txt";

	public static void main(String[] args) {
		// Step 1: tạo một liên kết với tệp tin/thư mục cần làm việc
		File file = new File(FILE_NAME);

		// Step 2: tạo một input stream để đọc dữ liệu
		FileReader fileReader = null;

		// Strep 3: tạo một buffered để lưu dữ liệu đọc
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			// Step 4: Đọc dữ liệu từ bộ đệm và xử lí

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				double sum = 0.0;
				System.out.println(line);

				String[] lFile = line.split(" ");
				for (String string : lFile) {
					sum += Double.parseDouble(string);
				}
				System.out.println("Sum of row: " + sum);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Đã hoàn thành đọc file và xử lí dữ liệu trong file");
			// Step 5: Đóng các kết nối
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
