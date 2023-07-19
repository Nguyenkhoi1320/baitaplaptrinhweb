package pxu.edu.vn.bai6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class StudentModel {
	static Connection conn;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public StudentModel() {
		conn = connnectDB();
	}

	public boolean addStudent(Student input) {
		boolean flag = true;
		try {

			String sql = "insert into sinhvien(hoten,ngaysinh,gioitinh,sdt) values(?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(sql);
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

	private Connection connnectDB() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/student";
			String userName = "root";
			String password = "Mysql123";
			Class.forName("com.mysql.jdbc.Driver");
			if (conn == null) {
				conn = DriverManager.getConnection(dbURL, userName, password);
				System.out.println("connect successfully!");
			}
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}
}
