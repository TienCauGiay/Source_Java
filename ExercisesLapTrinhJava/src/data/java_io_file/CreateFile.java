package data.java_io_file;

import java.io.File;

//Tạo một file có tên là example.txt trong máy tính
//◼ Viết chương trình kiểm tra các thuộc tính của file example.txt
//(đọc, ghi, kích thước, đường dẫn, tên file …)
//◼ Viết đoạn chương trình thay đổi các thuộc tính đọc/ghi và kiểm
//tra xem file có thay đổi thuộc tính không

public class CreateFile {

	public static final String FILE_NAME = "C:\\Users\\DELL\\workspace\\Input_Output_Flie\\Example";

	public static void main(String[] args) {
		File f = new File(FILE_NAME);

		System.out.println("Tên file/folder: " + f.getName());
		System.out.println("Tên đường dẫn: " + f.getAbsolutePath());
		System.out.println("Kiểm tra xem có phải thư mục k: " + f.isDirectory());
		System.out.println("Kích thước file: " + f.length());
		System.out.println("Có phải file ghi k: " + f.canRead());
		System.out.println("Có phải file đọc k: " + f.canWrite());
		System.out.println("Tổng không gian file: " + f.getTotalSpace());
	}
}
