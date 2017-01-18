<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Details</title>
</head>
<body>
	${menuList}
	<h2>Available Menu</h2>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${menuList}</td>
			</tr>
			<c:forEach var="menu" items="${menuList}">
				<tr>
					<td>${menu.id}</td>
					<td>${menu.name}</td>
				</tr>

			</c:forEach>

		</tbody>

	</table>
	<a href="../food/logout">Sign Out</a>
</body>
</html>