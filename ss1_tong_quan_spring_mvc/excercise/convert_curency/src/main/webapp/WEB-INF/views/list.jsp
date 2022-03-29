<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/29/2022
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/convert">
    <label>USD amount</label>
    <input type="text" name="usd">

    <label>result</label>
    <input type="text" value="${result}">
    <button type="submit">Submit</button>

</form>
</body>
</html>
