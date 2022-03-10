package quanlisinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	static Scanner sc = new Scanner(System.in);

	static void Nhap(SinhVien sv) {
		System.out.println("Enter id: ");
		sv.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Emter name: ");
		sv.setName(sc.nextLine());
		System.out.println("Enter age: ");
		sv.setAge(sc.nextInt());
	}

	public static void main(String[] args) {
		Main2 main = new Main2();
		main.run();
		sc.close();
	}

	public void run() {
		List<SinhVien> lsv = new ArrayList<SinhVien>();
		while (true) {
			System.out.println("=============== Menu ==========");
			System.out.println("1. Nhập danh sách sinh viên");
			System.out.println("2. Hiển thị danh sách sinh viên");
			System.out.println("3. Sắp xếp danh sách sinh viên theo tứ tự tăng dần mã sinh viên");
			System.out.println("4. Tìm kiếm sinh viên theo tên: ");
			System.out.println("5. Sửa thông tin sinh viên theo id");
			System.out.println("6. Xóa một sinh viên theo id");
			System.out.println("0. Kết thúc");
			System.out.println("=============== Menu ==========");
			System.out.println("Nhập lựa chọn: ");
			int luaChon = sc.nextInt();
			int n = 0;

			if (luaChon < 0 || luaChon > 6) {
				System.out.println("Lựa chọn không hợp lệ");
			} else if (luaChon == 1) {
				System.out.println("Số sinh viên cần nhập: ");
				sc.nextLine();
				int n1 = sc.nextInt();

				for (int i = 0; i < n1; i++) {
					SinhVien sv = new SinhVien();
					Nhap(sv);
					lsv.add(sv);
				}
			} else if (luaChon == 2) {
				System.out.println("Danh sách sinh viên vừa nhập là: ");
				for (SinhVien sinhVien : lsv) {
					sinhVien.hienThiThongTin();
				}
			} else if (luaChon == 3) {
				Collections.sort(lsv, new Comparator<SinhVien>() {
					@Override
					public int compare(SinhVien o1, SinhVien o2) {
						if (o1.getId() > o2.getId()) {
							return 1;
						} else if (o1.getId() < o2.getId()) {
							return -1;
						} else {
							return 0;
						}
					}
				});
			} else if (luaChon == 4) {
				System.out.println("Nhập tên sinh viên cần tìm: ");
				sc.nextLine();
				String stk = sc.nextLine();
				for (SinhVien sinhVien : lsv) {
					if (sinhVien.getName().equals(stk)) {
						System.out.println("Tìm thấy sinh viên có tên " + stk + " trong danh sách");
						System.out.println("Thông tin sinh viên: ");
						sinhVien.hienThiThongTin();
					}
				}
			} else if (luaChon == 5) {
				System.out.println("Nhập id sinh viên cần sửa: ");
				int sid = sc.nextInt();
				for (SinhVien sinhVien : lsv) {
					if (sinhVien.getId() == sid) {
						System.out.println("Sửa tên thành: ");
						sc.nextLine();
						sinhVien.setName(sc.nextLine());
						System.out.println("Sửa tuổi thành: ");
						sinhVien.setAge(sc.nextInt());
						System.out.println("Sửa thông tin sinh viên thành công");
					} 
				}
			} else if (luaChon == 6) {
				System.out.println("Nhập id sinh viên cần xóa: ");
				int xid = sc.nextInt();
				Iterator<SinhVien> itr = lsv.iterator();
				while (itr.hasNext()) {
					SinhVien s = itr.next();
					if (s.getId() == xid) {
						itr.remove();
					}
				}
			} else {
				break;
			}
		}
	}
}
