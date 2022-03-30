<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/30/2022
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="list">
    <h1>Calculator</h1>
    <label>number 1</label>
    <input type="text" name="num1">

    <label>number 2</label>
    <input type="text" name="num2"><br><br>

    <button type="submit" name="calculate" value="+">addition</button>
    <button type="submit" name="calculate" value="-">subtraction</button>
    <button type="submit" name="calculate" value="*">multiplication</button>
    <button type="submit" name="calculate" value="/">division</button>

</form>

<p>result: ${result}</p>

</body>
</html>
