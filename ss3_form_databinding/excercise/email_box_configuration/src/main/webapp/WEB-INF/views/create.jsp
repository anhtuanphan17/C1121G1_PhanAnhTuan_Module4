<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/31/2022
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<div>
    <form:form method="post" action="/createEmail" modelAttribute="email">
        <table>
            <tr>
                <td><form:label path="emailAddress">Email Address</form:label></td>
                <td><form:input path="emailAddress"/></td>
            </tr>
            <tr>
                <td><form:label path="language">Language</form:label></td>
                <td><form:select path="language" items="${languageList}">
<%--                    <form:option value="English">English</form:option>--%>
<%--                    <form:option value="Vietnamese">Vietnamese</form:option>--%>
<%--                    <form:option value="Japanese">Japanese</form:option>--%>
                </form:select></td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Size</form:label></td>
                <td><form:select path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="20">20</form:option>
                    <form:option value="25">25</form:option>
                </form:select></td>
            </tr>
            <tr>
                <td><form:label path="spamsFilter">Spam Filter</form:label></td>

                <td>
                    <form:checkbox path="spamsFilter"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="signature">Signature</form:label>
                </td>
                <td>
                    <form:input path="signature" type="text" size="50px"/>
                </td>
            </tr>
            <tr>
                <td><button type="submit">Create</button>
                <button><a href="/email">Cancel</a></button></td>
            </tr>
        </table>


    </form:form>
</div>
</body>
</html>
