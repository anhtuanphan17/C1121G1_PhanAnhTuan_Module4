<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/29/2022
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="search">

<label>Search Word</label>
<input type="text" name="searchWord">
    <button type="submit" value="Search">Search</button>
    <input type="text" value="${result}">
</form>


<%--<label> Result </label>--%>
<%--<input type="text" value="${result}">--%>


</body>
</html>
