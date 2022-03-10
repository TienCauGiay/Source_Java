package baitapclass.student;

import java.util.Scanner;

//Tạo lớp Student, lưu trữ các thông tin một sinh viên:

//- Mã sinh viên: chứa 8 kí tự 
//- Điểm trung bình: từ 0.0 – 10.0 
//- Tuổi: Phải lớn hơn hoặc bằng 18 
//- Lớp: Phải bắt đầu bởi kí tự 'A' hoặc kí tự 'C' 
//Constructor không tham số. Constructor đầy đủ tham số. 
//Các hàm get/set a. 
//phương thức inputlnfo(), nhập thông tin Student từ bàn phím b. 
//phương thức showInfo(), hiển thị tất cả thông tin Student c. 
//Viết phương thức xét xem Student có được học bổng không? Điểm trung bình trên 8.0 là được học bổng

public class Student {
	// Attributes
	private String maST;
	private double dTB;
	private int age;
	private String clazz;

	Scanner sc = new Scanner(System.in);

	// Constructor
	public Student() {
		super();
	}

	public Student(String maNV, double dTB, int age, String clazz) {
		super();
		this.maST = maNV;
		this.dTB = dTB;
		this.age = age;
		this.clazz = clazz;
	}

	// Setter and getter
	public String getMaNV() {
		return maST;
	}

	public void setMaNV(String maNV) {
		this.maST = maNV;
	}

	public double getdTB() {
		return dTB;
	}

	public void setdTB(double dTB) {
		this.dTB = dTB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	// Method
	public void inputInfo() {
		do {
			System.out.println("Enter maSt: ");
			this.maST = sc.nextLine();
			if(this.maST.length() != 8) {
				System.out.println("Mã student phải có 8 kí tự");
			}
		} while(this.maST.length() != 8);
		System.out.println("Enter điểm trung bình: ");
		this.dTB = sc.nextDouble();
		System.out.println("Enter age: ");
		this.age = sc.nextInt();
		System.out.println("Enter class: ");
		sc.nextLine();
		this.clazz = sc.nextLine();
	}

	public void showInfo() {
		System.out.println("Mã student: " + this.maST);
		System.out.println("Mark trung bình: " + this.dTB);
		System.out.println("Age: " + this.age);
		System.out.println("Class: " + this.clazz);
	}

	public void xetHocBong() {
		if (this.dTB > 8) {
			System.out.println("Được học bổng");
		} else {
			System.out.println("Không được học bổng");
		}
	}

}
