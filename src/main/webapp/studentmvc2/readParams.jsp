<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String dbServer = application.getInitParameter("dbServer");
		String dbAddress = application.getInitParameter("dbAddress");
		String dbPort = application.getInitParameter("dbPort");
		String database = application.getInitParameter("database");
		out.println("jdbc:" + dbServer + "://" + dbAddress + ":" + dbPort + "/" + database);
		String username = application.getInitParameter("username");
		String password = application.getInitParameter("password");
		out.println(username);
		out.println(password);
		String dbDriver = application.getInitParameter("dbDriver");
		out.println(dbDriver);
	%>
</body>
</html>