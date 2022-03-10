package baitapdiem2D_3D;

/*
2. Hoàn thành lớp điểm 3D kế thừa từ lớp điểm 2D:
◼ Tính khoảng cách giữa 2 điểm 3D.
◼ Định nghĩa lại hàm xác định điểm đối xứng qua gốc tọa độ.
◼ Tịnh tiến điểm đi một vị trí với độ lệch x, y và z.
 */

public class Point_3D extends Point_2D {
	private int z;

	public Point_3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public Point_3D() {
		super();
		this.z = 0;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point_3D [ x = " + this.getX() + " y = " + this.getY() + " z = " + z + "]";
	}

	public double kc(Point_3D b) {
		double res = super.kc(b) * super.kc(b) + (this.z - b.z) * (this.z - b.z);
		return Math.sqrt(res);
	}

	public Point_3D diemDoiXung() {
		super.diemDoiXung();
		this.z *= -1;
		return this;
	}

	public void tinhTien(int dx, int dy, int dz) {
		super.tinhTien(dx, dy);
		this.z += dz;
	}

//	public static void main(String[] args) {
//		Point_3D point_3d1 = new Point_3D(1, -2, 5);
//		Point_3D point_3d2 = new Point_3D(3, 4, -4);
//		Point_3D point_3d3 = new Point_3D(6, -5, 9);
//
//		Point_3D[] point_3d = { point_3d1, point_3d2, point_3d3 };
//
//		// Tính khoảng cách giữa 2 điểm
//		System.out.println(point_3d[0].kc(point_3d[1]));
//
//		// Tìm điểm đối xứng
//		System.out.println("============================");
//		for (Point_3D point_2d4 : point_3d) {
//			point_2d4.diemDoiXung();
//		}
//
//		for (Point_3D point_2d4 : point_3d) {
//			System.out.println(point_2d4.toString());
//		}
//
//		// Tịnh tiến điểm đi 1 đoạn(dx, dy, dz)
//		System.out.println("============================");
//		for (Point_3D point_2d4 : point_3d) {
//			point_2d4.tinhTien(6, 6, 6);
//		}
//
//		for (Point_3D point_2d4 : point_3d) {
//			System.out.println(point_2d4.toString());
//		}
//	}
}
