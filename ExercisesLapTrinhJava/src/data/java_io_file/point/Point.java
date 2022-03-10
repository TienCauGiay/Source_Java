package data.java_io_file.point;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Cấu trúc các Point [đã học] được lưu trữ vào file dưới dạng
//như sau:
//[12.3;-12.9]-[23;0.12]-[-15;32.01]…
//◼ Viết đoạn chương trình thực hiện công việc:
//◼ Đọc các Point từ file vào trong một danh sách.
//◼ Tính tổng khoảng cách các Points.
//◼ Ghi giá trị tổng và số Point ra file kết quả với cấu trúc
//Number of Points: 3
//Total distance: 234.9081

public class Point {
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

	// Methods
	public double distance(Point p2) {
		double dx = this.x - p2.x;
		double dy = this.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}
