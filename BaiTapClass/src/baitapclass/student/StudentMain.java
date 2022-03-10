package baitapclass.student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println("Nhập thông tin student: ");
		s1.inputInfo();
		
		Student s2 = new Student("thuylinh", 6.9, 21, "Y tá");
		
		s1.xetHocBong();
		s2.xetHocBong();
	}
}
