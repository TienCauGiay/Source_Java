package docghifile;

import java.io.File;

public class BaiTap_02 {

	public static final String FILE_NAME = "E:\\ĐHGTVT";

	public static int count = 0;

	public static void main(String[] args) {

		// Step 1: tạo một liên kết với thư mục/tập tin cần làm việc
		File file = new File(FILE_NAME);

		boolean isDir = file.isDirectory();
		System.out.println("Dir: " + isDir);
		// long size = file.length();
		// System.out.println("Size: " + size);
		// boolean isHiden = file.isHidden();
		// System.out.println("Hiden: " + isHiden);

		listFile(file, isDir);
		System.out.println("Số file .exe, .bat đã duyệt: " + count);
	}

	public static void listFile(File file, boolean isDir) {
		if (isDir) {
			System.out.println("Danh sách các tệp/thư mục con có đuôi .exe hoặc .bat: ");
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
}
