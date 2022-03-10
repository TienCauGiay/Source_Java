package oop.persons_student;

public class DeBai {

	// I. Tạo lớp Person chứa các thông tin sau:
	// - Tên
	// - Giới tính
	// - Ngày sinh
	// - Địa chỉ
	// 1. Lớp Person bao gồm đầy đủ các phương thức getter, setter, constructor
	// không tham số, constructor đầy đủ tham số.
	// 2. Viết phương thức inputlnfo() để nhập thông tin Person từ bàn phím.
	// 3. Viết phương thức showInfo() để hiển thị tất cả thông tin Person.

	// II. Tạo lớp Student thừa kế lớp Person, lưu trữ các thông tin sinh viên:
	// - Mã sinh viên: chứa 8 kí tự
	// - Điểm trung bình: từ 0.0 – 10.0
	// - Email: phải chứa kí tự @ và không tồn tại khoảng trắng
	// 1. Override phương thức inputInfo(), nhập thông tin Student từ bàn phím.
	// 2. Override phương thức showInfo(), hiển thị tất cả thông tin Student.
	// 3. Viết phương thức xét xem Student có được học bổng không? Điểm trung
	// bình trên 8.0 là được học bổng.

	// III. Tạo lớp StudentTest chứa phương thức main() và thực thi các công
	// việc
	// sau:
	// Tạo Menu chọn với yêu cầu cụ thể như sau:
	// a. Chọn 1: Nhập vào N sinh viên (N là số lượng sinh viên, được nhập từ
	// bàn phím)
	// b. Chọn 2: Hiển thị thông tin tất cả các sinh viên ra màn hình
	// c. Chọn 3: Hiển thị sinh viên có điểm trung bình cao nhất và sinh viên có
	// điểm trung bình thấp nhất
	// d. Chọn 4: Tìm kiếm sinh viên theo mã sinh viên. Nhập vào mã sinh viên,
	// nếu tồn tại sinh viên có mã đó thì in ra màn hình thông tin sinh viên,
	// nếu không tồn tại thì in ra: Không có sinh viên nào có mã là <giá trị của
	// mã sinh viên>
	// e. Chọn 5: Hiển thị tất cả các sinh viên theo thứ tự tên trong bảng chữ
	// cái (A - Z)
	// f. Chọn 6: Hiển thị tất cả các sinh viên được học bổng, và sắp xếp theo
	// thứ tự điểm cao xuống thấp
	// g. Chọn 7: Thoát

}
