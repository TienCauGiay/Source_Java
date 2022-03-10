package oop.bai_03;

public class Triangle implements ShapesBienDoi, ShapesTinhToan {
	private Point pA;
	private Point pB;
	private Point pC;

	public Triangle(Point pA, Point pB, Point pC) {
		super();
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
	}

	public Point getpA() {
		return pA;
	}

	public void setpA(Point pA) {
		this.pA = pA;
	}

	public Point getpB() {
		return pB;
	}

	public void setpB(Point pB) {
		this.pB = pB;
	}

	public Point getpC() {
		return pC;
	}

	public void setpC(Point pC) {
		this.pC = pC;
	}

	@Override
	public String toString() {
		return "Triangle [pA=" + pA + ", pB=" + pB + ", pC=" + pC + "]";
	}

	@Override
	public double area() {
		double dx = this.pA.distance(this.pB);
		double dy = this.pB.distance(this.pC);
		double dz = this.pA.distance(this.pC);
		double ncv = (dx + dy + dz) / 2.0;
		double res = Math.sqrt(ncv * (ncv - dx) * (ncv - dy) * (ncv - dz));
		return res;
	}

	@Override
	public double perimeter() {
		double dx = this.pA.distance(this.pB);
		double dy = this.pB.distance(this.pC);
		double dz = this.pA.distance(this.pC);

		return dx + dy + dz;
	}

	@Override
	public void move(double dx, double dy) {
		this.pA.move(dx, dy);
		this.pB.move(dx, dy);
		this.pC.move(dx, dy);
	}

	@Override
	public void rotate(double alpha) {
		double dx = (this.pA.getX() + this.pB.getX() + this.pC.getX()) / 3.0;
		double dy = (this.pA.getY() + this.pB.getY() + this.pC.getY()) / 3.0;
		Point center = new Point(dx, dy);

		pA.rotate(alpha, center);
		pB.rotate(alpha, center);
		pC.rotate(alpha, center);
	}

	@Override
	public void zoom(double ratio) {
		double dx = (this.pA.getX() + this.pB.getX() + this.pC.getX()) / 3.0;
		double dy = (this.pA.getY() + this.pB.getY() + this.pC.getY()) / 3.0;
		Point center = new Point(dx, dy);

		pA.zoom(ratio, center);
		pB.zoom(ratio, center);
		pC.zoom(ratio, center);
	}

	@Override
	public Point center() {
		double dx = (this.pA.getX() + this.pB.getX() + this.pC.getX()) / 3.0;
		double dy = (this.pA.getY() + this.pB.getY() + this.pC.getY()) / 3.0;
		return new Point(dx, dy);
	}

}
