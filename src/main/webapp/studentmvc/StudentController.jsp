<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="pxu.edu.vn.bai6.Student"
	import="pxu.edu.vn.bai6.StudentModel" import="java.util.Date"
	import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//Lay du lieu tu form
	String hoten = (String) request.getParameter("hoten");
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	Date ngaysinh = df.parse(request.getParameter("ngaysinh"));
	String gioitinh = (String) request.getParameter("gioitinh");
	String sdt = (String) request.getParameter("sdt");
	out.println(hoten + "; " + ngaysinh.toString() + "; " + gioitinh+" ; "+sdt);
	//goi student model de luu doi tuong sv vao csdl
	Student sv = new Student();
	sv.setHoten(hoten);
	sv.setGioitinh(gioitinh);
	sv.setNgaysinh(ngaysinh);
	sv.setSdt(sdt);
	StudentModel myModel = new StudentModel();
	boolean kq = myModel.addStudent(sv);
	if (kq) {
		request.setAttribute("message", "them sinh vien thanh cong");

	} else {
		request.setAttribute("message", "them sinh vien that bai");
	}
	RequestDispatcher dispatcher = request.getRequestDispatcher("message.jsp");
	if (dispatcher != null) {
		dispatcher.forward(request, response);
	}
	%>
</body>
</html>