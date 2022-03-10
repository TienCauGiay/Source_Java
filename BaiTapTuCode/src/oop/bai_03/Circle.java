package oop.bai_03;

//Thông qua trừu tượng hóa: lớp Rectangle và lớp Circle => quan hệ anh em.
//Xây dựng một họ các đối tượng có cùng các phương thức => xây dựng bộ khung
//cho họ các đối tượng.

//Với abstract class: chúng ta sử dụng kế thừa [extends]
//Với interface: chúng ta sử dụng cài đặt [implements]

public class Circle implements ShapesBienDoi, ShapesTinhToan {
	private Point tam;
	private double r;

	public Circle(Point tam, double r) {
		super();
		this.tam = tam;
		this.r = r;
	}

	public Point getTam() {
		return tam;
	}

	public void setTam(Point tam) {
		this.tam = tam;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [tam=" + tam + ", r=" + r + "]";
	}

	@Override
	public double area() {
		return Math.PI * r * r;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * r;
	}

	@Override
	public void move(double dx, double dy) {
		this.tam.move(dx, dy);
	}

	@Override
	public void rotate(double alpha) {
		// N.A (Đường tròn xoay bao nhiêu độ thì vẫn giữ nguyên)

	}

	@Override
	public void zoom(double ratio) {
		this.r *= ratio;
	}

	@Override
	public Point center() {
		return this.tam;
	}

}
