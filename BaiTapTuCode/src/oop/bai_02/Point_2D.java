package oop.bai_02;

public class Point_2D {
	private double x;
	private double y;

	public Point_2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point_2D [x=" + x + ", y=" + y + "]";
	}

	public double distance(Point_2D d2) {
		double dx = Math.abs(this.x - d2.x);
		double dy = Math.abs(this.y - d2.y);
		return Math.sqrt(dx * dx + dy * dy);
	}

	public Point_2D diemDoiXung() {
		this.x *= -1.0;
		this.y *= -1.0;
		return new Point_2D(this.x, this.y);
	}

	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

}
