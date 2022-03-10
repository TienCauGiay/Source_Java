package quanlithongtinmaytinh;

public class HangSanXuat {
	private String tenHang;
	private QuocGia quocGia;

	public HangSanXuat(String tenHang, QuocGia quocGia) {
		super();
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public String getTenQuocGia() {
		return this.quocGia.getTenQuocGia();
	}

	@Override
	public String toString() {
		return "HangSanXuat [tenHang=" + tenHang + ", quocGia=" + quocGia + "]";
	}
}
