package baitapclass.employee;

public class NhanVienMain {

	public static void main(String[] args) {
		NhanVien nv = new NhanVien();
		
		System.out.println("Nhâp thông tin nhân viên: ");
		nv.inputInfo();
		
		System.out.println("Thông tin nhân viên vừa nhập: ");
		nv.outputInfo();
		
		System.out.println("Số ti�?n thưởng của nhân viên là: " + nv.bonus());
	}

}
