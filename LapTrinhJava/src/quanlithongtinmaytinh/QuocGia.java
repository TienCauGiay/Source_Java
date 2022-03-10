package quanlithongtinmaytinh;

public class QuocGia {
	private String maQuocGia;
	private String tenQuocGia;

	public QuocGia(String maQuocGia, String tenQuocGia) {
		this.maQuocGia = maQuocGia;
		this.tenQuocGia = tenQuocGia;
	}

	public void setMaQuocGia(String maQuocGia) {
		this.maQuocGia = maQuocGia;
	}

	public String getMaQuocGia() {
		return maQuocGia;
	}

	public String getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}

	@Override
	public String toString() {
		return "QuocGia [maQuocGia=" + maQuocGia + ", tenQuocGia=" + tenQuocGia + "]";
	}
}
