package quanlisach;

// Xay dung mot ung dung Java quan li nhung quyen sach coi cac thong tin sau: 
// gia ban, nam xuat ban, ten sach va tac gia. Tac gia bao gom cac thong tin la ten va ngay sinh. Ngay bao gom cac thong tin la ngay thang nam
// Viet cac phuong thuc: In ra ma hinh mot quyen sach
// Cho biet quyen sach bat ki co duoc xuat ban cung nam voi mot quyen sach nao do hay k?
// Cho biet gia sach sau khi giam xuong x%, x duoc truyen vao nhu la mot tham so
public class Sach {
	private long giaBan;
	private int namXuatBan;
	private String tenSach;
	private TacGia tacGia;

	public Sach(long giaBan, int namXuatban, String tenSach, TacGia tacGia) {
		this.giaBan = giaBan;
		this.namXuatBan = namXuatban;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
	}

	public long getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

	public void inRaManHinh() {
		System.out.println("Gia ban: " + getGiaBan());
		System.out.println("Nam xuat ban: " + getNamXuatBan());
		System.out.println("Ten sach: " + getTenSach());
		System.out.println("Tac gia: " + getTacGia());
	}

	public boolean checkSachCungNam(Sach a) {
		if (this.getNamXuatBan() == a.getNamXuatBan())
			return true;
		return false;
	}

	public long giaSachSauKhiGiam(int x) {
		long gia = this.getGiaBan() * x / 100;
		return gia;
	}
}
