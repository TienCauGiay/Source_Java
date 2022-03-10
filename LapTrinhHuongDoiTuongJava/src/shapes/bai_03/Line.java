package shapes.bai_03;

public class Line implements ShapesBienDoi, ShapesTinhToan {
	private Point dau;
	private Point cuoi;

	@Override
	public String toString() {
		return "Line [dau=" + dau + ", cuoi=" + cuoi + "]";
	}

	public Point getDau() {
		return dau;
	}

	public void setDau(Point dau) {
		this.dau = dau;
	}

	public Point getCuoi() {
		return cuoi;
	}

	public void setCuoi(Point cuoi) {
		this.cuoi = cuoi;
	}

	public Line(Point dau, Point cuoi) {
		super();
		this.dau = dau;
		this.cuoi = cuoi;
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return this.dau.distance(this.cuoi);
	}

	@Override
	public void move(double dx, double dy) {
		this.dau.move(dx, dy);
		this.cuoi.move(dx, dy);
	}

	@Override
	public void rotate(double alpha) {
		this.dau.rotate(alpha, this.dau.center());
		this.cuoi.rotate(alpha, this.cuoi.center());
	}

	@Override
	public void zoom(double ratio) {
		this.dau.zoom(ratio, this.dau.center());
		this.cuoi.zoom(ratio, this.cuoi.center());
	}

	@Override
	public Point center() {
		double x = (this.dau.getX() + this.cuoi.getX()) / 2.0;
		double y = (this.dau.getX() + this.cuoi.getX()) / 2.0;
		return new Point(x, y);
	}
}
