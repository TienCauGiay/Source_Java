package shapes.bai_03;

public class Point implements ShapesBienDoi, ShapesTinhToan {
	private double x;
	private double y;

	public Point(double x, double y) {
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
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return 0;
	}

	@Override
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
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
		return this;
	}

	// Method

	public double distance(Point d) {
		double dx = this.x - d.x;
		double dy = this.y - d.y;
		return Math.sqrt(dx * dx - dy * dy);
	}

	public void zoom(double ratio, Point center) {
		this.x = (this.x - center.x) * ratio + center.x;
		this.y = (this.y - center.y) * ratio + center.y;
	}

	public void rotate(double alpha, Point center) {
		double x = (this.x - center.x) * Math.cos(alpha) - (this.y - center.y) * Math.sin(alpha) + center.x;
		double y = (this.x - center.x) * Math.sin(alpha) + (this.y - center.y) * Math.cos(alpha) + center.y;
		this.x = x;
		this.y = y;
	}

}
