package oop.bai_03;

public class Rectangle implements ShapesBienDoi, ShapesTinhToan {
	private Point pA;
	private Point pB;

	public Rectangle(Point pA, Point pB) {
		super();
		this.pA = pA;
		this.pB = pB;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate(double alpha) {
		// TODO Auto-generated method stub

	}

	@Override
	public void zoom(double ratio) {
		// TODO Auto-generated method stub

	}

	@Override
	public Point center() {
		// TODO Auto-generated method stub
		return null;
	}

}
