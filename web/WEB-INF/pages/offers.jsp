<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		
	<h2>Offers Results</h2>
	<table>
		<tr><td>Name</td><td>Email</td><td>Text</td></tr>
		
		<c:forEach var="offer" items="${offers}">
			<tr>
				<td><c:out value="${offer.name}"/></td>
				
				<td><c:out value="${offer.email}"/></td>
				
				<td><c:out value="${offer.text}"/></td>
			</tr>
		</c:forEach>
	</table>
	
	<p><a href="${pageContext.request.contextPath}/">Home</a></p>
	
</body>
</html>