package data.java_io_file;

import java.io.File;

//Xây dựng chương trình giả lập chương trình diệt virus
//◼ Xuất phát từ một thư mục hoặc ổ đĩa.
//◼ Đọc các thư mục và các tệp tin bên trong thư mục (đệ quy)
//◼ Với các tệp tin, kiểm tra xem tệp tin có đuôi .exe, .bat thì hiển thị
//trên màn hình.
//◼ Đếm số file .exe, .bat đã duyệt và thông báo

public class ProgramAntiVirut {

	public static final String FILE_NAME = "E:\\ĐHGTVT";

	public static int count = 0;

	public static void listFile(File file, boolean isDir) {
		if (isDir) {
			File[] lFile = file.listFiles();
			for (File file2 : lFile) {
				if (file2.getName().matches(".*\\.exe$") || file2.getName().matches(".*\\.bat$")) {
					System.out.println(file2.getName());
					count++;
				}
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (file2.isDirectory()) {
					listFile(file2, isDir);
				}
			}
		}
	}

	public static void main(String[] args) {
		File file = new File(FILE_NAME);

		boolean isDir = file.isDirectory();
		System.out.println("Danh sách các tệp/thư mục con có đuôi .exe hoặc .bat: ");

		listFile(file, isDir);
		System.out.println("Số file .exe hoặc .bat là: " + count);
	}

}
