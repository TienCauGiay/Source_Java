package docghifile.object;

import java.io.Serializable;

public class Point implements Serializable{
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
		return "[" + this.x + ";" + this.y + "]";
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(-1, 2);
		System.out.println(p1.toString());
	}
}
