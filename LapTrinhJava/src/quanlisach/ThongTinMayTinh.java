package quanlisach;

import quanlithongtinmaytinh.HangSanXuat;
import quanlithongtinmaytinh.NgaySanXuat;

public class ThongTinMayTinh {
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	long giaBan;
	int thoiGianBaoHanh;

	public ThongTinMayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, long giaBan, int thoiGianBaoHanh) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public NgaySanXuat getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public long getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public void kiemTraGiaBan(ThongTinMayTinh s) {
		if(this.getGiaBan() < s.getGiaBan()) {
			System.out.println("May tinh hang " + this.hangSanXuat.getTenHang() + " co gia ban thap hon may tinh hang  " + s.hangSanXuat.getTenHang());
		}
		else
		{
			System.out.println("May tinh hang " + s.hangSanXuat.getTenHang() + " co gia ban thap hon may tinh hang  " + this.hangSanXuat.getTenHang());
		}
	}
	
	public String getTenHang() {
		return this.hangSanXuat.getTenHang();
	}
	
	public String getQuocGia() {
		return this.hangSanXuat.getTenQuocGia();
	}

	public void hienThiThongTinMayTinh() {
		System.out.println(hangSanXuat.toString());
		System.out.println("Ngay san xuat: " + ngaySanXuat.toString());
		System.out.println("Gia ban: " + giaBan);
		System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
	}
}
