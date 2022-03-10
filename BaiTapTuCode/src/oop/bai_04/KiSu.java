package oop.bai_04;

public class KiSu extends CanBo {
	private String nganhDaoTao;

	public KiSu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		return super.toString() + "KiSu [nganhDaoTao=" + nganhDaoTao + "]";
	}

}
