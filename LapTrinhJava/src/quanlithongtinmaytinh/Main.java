package quanlithongtinmaytinh;

import quanlisach.Ngay;
import quanlisach.ThongTinMayTinh;

public class Main {

	/*
	 * Xay dung mot chuong trinh Java ho tro quan li thong tin may tinh cua mot
	 * cua hang dien may May tinh bao gom: hang san xuat, ngay san xuat, gia
	 * ban, thoi gian bao hanh. Ngay san xuat gom: ngay, thang, nam Hang san
	 * xuat gom: ten hang va quoc gia Quoc gia gom: ma quoc gia va ten quoc gia
	 * a. Viet phuong thuc kiem tra xem mot may tinh co gia ban thap hon mot may
	 * tinh khac hay k
	 *  b. Viet phuong thuc cho biet ten quoc gia san xuat may
	 * tinh
	 */

	public static void main(String[] args) {
		QuocGia quocGia1 = new QuocGia("T1", "Dong Lao");
		QuocGia quocGia2 = new QuocGia("L2", "Lao");
		
		NgaySanXuat ngay1 = new NgaySanXuat(1, 2, 3);
		NgaySanXuat ngay2 = new NgaySanXuat(6, 7, 8);
		
		HangSanXuat hang1 = new HangSanXuat("Dell", quocGia1);
		HangSanXuat hang2 = new HangSanXuat("Macbook", quocGia2);
		
		ThongTinMayTinh may1 = new ThongTinMayTinh(hang1, ngay1, 20000000, 12);
		ThongTinMayTinh may2 = new ThongTinMayTinh(hang2, ngay2, 22990000, 12);
		
		may1.kiemTraGiaBan(may2);
		
		System.out.println("Ten quoc gia san xuat may tinh hang " + may1.getTenHang() + " " + may1.getQuocGia());
	}

}
