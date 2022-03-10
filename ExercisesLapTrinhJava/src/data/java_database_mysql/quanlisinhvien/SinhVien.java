package data.java_database_mysql.quanlisinhvien;

import java.util.Date;

public class SinhVien {
	private int id;
	private String name;
	private String address;
	private Date ngaySinh;
	private int idNhomTruong;

	public SinhVien(int id, String name, String address, Date ngaySinh, int idNhomTruong) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.ngaySinh = ngaySinh;
		this.idNhomTruong = idNhomTruong;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getIdNhomTruong() {
		return idNhomTruong;
	}

	public void setIdNhomTruong(int idNhomTruong) {
		this.idNhomTruong = idNhomTruong;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", address=" + address + ", ngaySinh=" + ngaySinh
				+ ", idNhomTruong=" + idNhomTruong + "]";
	}

}
