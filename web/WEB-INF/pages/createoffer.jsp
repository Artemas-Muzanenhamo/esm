<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">
			<table class="formtable">
				<tr>
					<td class="label">Name: </td>
					<td>
						<sf:input name="name" path="name" type="text"/><br/>
						<sf:errors path="name" cssClass="error"></sf:errors>
					</td>
				</tr>
				<tr>
					<td class="label">Email: </td>
					<td>
						<sf:input name="email" path ="email" type="text"/><br/>
						<sf:errors path="email" cssClass="error"></sf:errors>
					</td>
				</tr>
				<tr>
				<td class="label">Your Offer: </td>
					<td>
						<sf:textarea name="text" path="text" rows="10" cols="10"></sf:textarea><br/>
						<sf:errors path="text" cssClass="error"></sf:errors>
					</td>
				</tr>
				<tr>
					<td class="label"> </td>
					<td>
						<input value="Create Advert" type="submit"/>
					</td>
				</tr>
			</table>
		</sf:form>	
	<p><a href="${pageContext.request.contextPath}/">Home</a></p>

</body>
</html>