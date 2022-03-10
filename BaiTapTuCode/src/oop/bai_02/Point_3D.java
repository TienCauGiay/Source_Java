package oop.bai_02;

public class Point_3D extends Point_2D {
	private double z;

	public Point_3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point_3D " + "[x=" + this.getX() + ", y=" + this.getY() + ", z=" + z + "]";
	}

	public double distance(Point_3D d2) {
		double dx = this.getX() - d2.getX();
		double dy = this.getY() - d2.getY();
		double dz = this.z - d2.z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	@Override
	public Point_3D diemDoiXung() {
		super.diemDoiXung();
		this.z *= -1.0;
		return this;
	}

	public void move(double dx, double dy, double dz) {
		super.move(dx, dy);
		this.z += dz;
	}

}
