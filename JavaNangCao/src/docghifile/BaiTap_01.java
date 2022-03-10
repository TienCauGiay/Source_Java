package docghifile;

import java.io.File;

public class BaiTap_01 {
	
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
