package pxu.edu.vn.bai6;

import java.util.Date;

public class Student {
	private int idstudent;
	private String hoten;
	private Date ngaysinh;
	private String gioitinh;
	private String sdt;
	public Student() {
		super();
	}
	public Student(int idstudent, String hoten, Date ngaysinh, String gioitinh, String sdt) {
		super();
		this.idstudent = idstudent;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
	}
	public int getIdstudent() {
		return idstudent;
	}
	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "Student [idstudent=" + idstudent + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh="
				+ gioitinh + ", sdt=" + sdt + "]";
	}
}
