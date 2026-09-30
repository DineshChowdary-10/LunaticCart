<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
</head>
<body>

    <h1>Product Details</h1>

    <h2>${product.name}</h2>

    <p>Product ID: ${product.id}</p>

    <p>Price: ₹${product.price}</p>

    <a href="products">Back to Products</a>

</body>
</html>