package pxu.edu.vn.nhapsinhvien;

import java.text.ParseException;

public class StudentController {
	private StudentView myView;
	private StudentModel myModel;

	public StudentController() {
		super();
		myView = new StudentView();
		myModel = new StudentModel();
	}

	public void goiNhapSV() {
		try {
			Student sv = myView.nhapSV();
			boolean kq = myModel.addStudent(sv);
			if (kq) {
				myView.hienThiThongBao("CAP NHAT THANH CONG");
			} else {
				myView.hienThiThongBao("CO LOI TRONG QUA TRINH CAP NHAT");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
