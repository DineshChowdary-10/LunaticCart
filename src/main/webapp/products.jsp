<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to lunatic cart</h1>
<h2>Available Products</h2>
<c:forEach var="product" items = "${products}">
<p>
${product.name} -  ₹${product.price}
</p>
</c:forEach>

</body>
</html>