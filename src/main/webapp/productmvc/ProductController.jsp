<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="../error.html"
	import="pxu.edu.vn.bt1.ProductModel" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!public ArrayList<ProductModel> getProducts() {
		ArrayList<ProductModel> results = new ArrayList();
		results.add(new ProductModel(1, "sampoo"));
		results.add(new ProductModel(2, "breaker"));
		return results;
	}%>
	<%
	ArrayList<ProductModel> dssp = getProducts();

	for (ProductModel itr : dssp) {
		out.print(itr.getProductID() + "; " + itr.getProductName());
	}
	%>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>TenSp</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (ProductModel itr : dssp) {
			%>
			}
			<tr>
				<td>
					<%
					out.print(itr.getProductID());
					%>
				</td>
				<td>
					<%
					out.print(itr.getProductName());
					%>
				</td>
			</tr>
			<%
			} //dong vong for
			%>
		</tbody>
	</table>
</body>
</html>