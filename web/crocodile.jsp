<%@ page import="ducky.models.Image" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
	Image name: <%= ((Image) request.getAttribute("imageName")).getName() %>
	<img width="200px" height="200px" src="images/crocodile.jpg" alt="Ca sau khoa than vi moi truong">
	<% pageContext.setAttribute("scope","Page Context"); %>
	<br>
	Scope of the attribute: <%= pageContext.getAttribute("scope") %>
	<br>
	Scope of the attribute by EL: ${ pageScope.scope }
	<br>
	Student name: ${ requestScope.student.name }
	<br>
	Ohter Scope of the attribute: <%= pageContext.findAttribute("otherScope") %>
	<br>
	<%= application.getInitParameter("account") %>
	${ initParam.account }
	<br>
	Session Scope of the attribute: <%= pageContext.getAttribute("otherScope", PageContext.SESSION_SCOPE) %>
</body>
</html>
