<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Thông báo kết quả</title>
</head>
<body>
	<%
	out.print((String) request.getAttribute("message"));
	%>
</body>
</html>