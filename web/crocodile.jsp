<%@ page import="ducky.models.Image" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
	Image name: <%= ((Image) request.getAttribute("imageName")).getName() %>
	<img src="images/crocodile.jpg" alt="Ca sau khoa than vi moi truong">
</body>
</html>
