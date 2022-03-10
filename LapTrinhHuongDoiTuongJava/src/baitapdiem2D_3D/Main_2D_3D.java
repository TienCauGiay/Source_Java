package baitapdiem2D_3D;

/*
 ◼ Tạo một danh sách điểm bao gồm 2D và 3D.
◼ Tính tổng khoảng cách các điểm 2D và tổng khoảng cách các điểm 3D.
◼ Đưa các điểm đối xứng vào danh sách và hiển thị danh sách các điểm
 */
public class Main_2D_3D {

	public static void main(String[] args) {
		Point_2D point_2d1 = new Point_2D(1, -2);
		Point_2D point_2d2 = new Point_2D(3, 4);
		Point_2D point_2d3 = new Point_2D(6, -5);
		
		Point_3D point_3d1 = new Point_3D(10, -4, 7);
		Point_3D point_3d2 = new Point_3D(1, 9, -5);
		Point_3D point_3d3 = new Point_3D(20, -1, 1);
	
		Point_2D[] lpoints = {point_2d1, point_2d2, point_2d3, point_3d1, point_3d2, point_3d3};
		
		// Hiển thị lên giao diện
		for (Point_2D point_2d : lpoints) {
			System.out.println(point_2d.toString());
		}
		
		// Tịnh tiến
		System.out.println("=======================");
		for (Point_2D point_2d : lpoints) {
			if(point_2d instanceof Point_3D){
				((Point_3D)point_2d).tinhTien(6, 6, 6);
			}else{
				point_2d.tinhTien(6, 6);
			}
		}
		for (Point_2D point_2d : lpoints) {
			System.out.println(point_2d.toString());
		}
		
		System.out.println("=======================");
		// Điểm đối xứng
		Point_2D[] lpointsdx = new Point_2D[lpoints.length];
		for (int i = 0; i < lpoints.length; i++) {
			lpointsdx[i] = lpoints[i].diemDoiXung();
		}
		
		int n = lpoints.length * 2;
		Point_2D[] a = new Point_2D[n];
		for(int i = 0;i < a.length / 2; i++) {
			a[i] = lpoints[i];
		}
		int dem = 0;
		for(int i = a.length / 2; i < a.length; i++) {
			a[i] = lpointsdx[dem];
			dem++;
		}
		
		for (Point_2D point_2d : a) {
			System.out.println(point_2d.toString());
		}
	}

}
