package pxu.edu.vn.nhapsinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentView {
	static Scanner sc = new Scanner(System.in);

	public Student nhapSV() throws ParseException {
		Student student = new Student();

		System.out.println("Nhap ho ten sinh vien: ");
		String hotenSV = sc.next();
		student.setHoten(hotenSV);

		System.out.println("Nhap ngay sinh: ");
		String ngaysinhSV = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date ngaySinh = dateFormat.parse(ngaysinhSV);
		student.setNgaysinh(ngaySinh);

		System.out.println("Nhap gioi tinh: ");
		String gioitinhSV = sc.next();
		student.setGioitinh(gioitinhSV);

		System.out.println("Nhap sdt: ");
		String sdtSV = sc.next();
		student.setSdt(sdtSV);
		return student;

	}

	public void hienThiThongBao(String msg) {
		System.out.println(msg);
	}
}