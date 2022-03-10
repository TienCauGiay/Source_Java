package shapes.bai_03;

import java.util.ArrayList;
import java.util.List;

public class MainPaint {

	public static void main(String[] args) {

		List<ShapesInterface> l_point = new ArrayList<ShapesInterface>();

		// Khởi tạo các đối tượng
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(3.0, 0.0);
		Point p3 = new Point(0.0, 4.0);

		Line l1 = new Line(p1, p2);

		Circle c1 = new Circle(p1, 5.0);

		Triangle t1 = new Triangle(p1, p2, p3);

		l_point.add(p1);
		l_point.add(p2);
		l_point.add(p3);
		l_point.add(l1);
		l_point.add(c1);
		l_point.add(t1);

		// Hiển thị lên giao diện
		for (ShapesInterface shapesInterface : l_point) {
			System.out.println(shapesInterface.toString());
		}

		// Tính tổng chu vi và diện tích các đối tượng
		double C = 0.0;
		double S = 0.0;

		for (ShapesInterface a : l_point) {
			if (a instanceof ShapesTinhToan) {
				C += ((ShapesTinhToan) a).perimeter();
				S += ((ShapesTinhToan) a).area();
			}
		}
		
		System.out.println(t1.perimeter());
		System.out.println(t1.area());

		System.out.println("Tong chu vi cac hinh la: " + C + "\nTong dien tich cac hình la: " + S);
	}

}
