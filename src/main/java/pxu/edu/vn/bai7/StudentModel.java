package pxu.edu.vn.bai7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class StudentModel {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public StudentModel() {
	}

	public boolean addStudent(Student input, Connection dbConnection) {
		boolean flag = true;
		try {

			String sql = "insert into student(hoten,ngaysinh,gioitinh,sdt) values(?,?,?,?)";

			PreparedStatement statement = dbConnection.prepareStatement(sql);
			statement.setString(1, input.getHoten());
			statement.setString(2, dateFormat.format(input.getNgaysinh()));
			statement.setString(3, input.getGioitinh());
			if (input.getSdt() != null) {
				statement.setString(4, input.getSdt());
			}
			
			// Step 6: Process the results
			statement.execute();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
}