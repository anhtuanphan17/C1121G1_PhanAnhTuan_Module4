<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/31/2022
  Time: 12:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Email List</h2>
<h5><a href="/create">Create new email</a></h5>
<form method="post" action="edit">
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Email Address</th>
            <th>Language</th>
            <th>Page size</th>
            <th>Spam filter</th>
            <th>Signature</th>
            <th>Action</th>
        </tr>

        <c:forEach var="email" items="${emailList}">
            <tr>
                <td>${email.emailId}</td>
                <td>${email.emailAddress}</td>
                <td>${email.language}</td>
                <td>${email.pageSize}</td>
                <td>
                    <c:choose>
                        <c:when test="${email.spamsFilter}">
                            Enable
                        </c:when>
                        <c:otherwise>
                            Disable
                        </c:otherwise>

                    </c:choose>

                </td>
                <td>${email.signature}</td>
                <td>
                    <a href="email?action=edit&id=${email.emailId}">Edit</a>
                    </td>
            </tr>

        </c:forEach>

    </table>


</form>

</body>
</html>
