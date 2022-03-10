package baitapdiem2D_3D;

/*
Hoàn thành lớp điểm 2D với các phương thức:
◼ Tính khoảng cách giữa 2 điểm.
◼ Xác định điểm đối xứng qua gốc tọa độ.
◼ Tịnh tiến điểm đi một vị trí với độ lệch x, y
*/
public class Point_2D {
	private int x;
	private int y;

	public Point_2D() {
		super();
	}

	public Point_2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point_2D [x=" + x + ", y=" + y + "]";
	}

	// Tính khoảng cách 2 điểm
	public double kc(Point_2D b) {
		Point_2D a = new Point_2D();
		a.x = this.x - b.x;
		a.y = this.y - b.y;
		return Math.sqrt(a.x * a.x + a.y * a.y);
	}

	// Tìm điểm đối xứng
	public Point_2D diemDoiXung() {
		this.x *= -1;
		this.y *= -1;
		return this;
	}

	// Tịnh tiến điểm đi 1 khoảng cách (dx, dy)
	public void tinhTien(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

//	public static void main(String[] args) {
//		Point_2D point_2d1 = new Point_2D(1, -2);
//		Point_2D point_2d2 = new Point_2D(3, 4);
//		Point_2D point_2d3 = new Point_2D(6, -5);
//
//		Point_2D[] point_2d = { point_2d1, point_2d2, point_2d3 };
//
//		// Tính khoảng cách giữa 2 điểm
//		System.out.println(point_2d[0].kc(point_2d[1]));
//
//		// Tìm điểm đối xứng
//		System.out.println("============================");
//		for (Point_2D point_2d4 : point_2d) {
//			point_2d4.diemDoiXung();
//		}
//
//		for (Point_2D point_2d4 : point_2d) {
//			System.out.println(point_2d4.toString());
//		}
//
//		// Tịnh tiến điểm đi 1 đoạn(dx, dy)
//		System.out.println("============================");
//		for (Point_2D point_2d4 : point_2d) {
//			point_2d4.tinhTien(6, 6);
//		}
//
//		for (Point_2D point_2d4 : point_2d) {
//			System.out.println(point_2d4.toString());
//		}
//	}
}
