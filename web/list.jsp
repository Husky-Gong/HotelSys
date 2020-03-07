<%--
  Created by IntelliJ IDEA.
  User: jersey
  Date: 3/7/20
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Hotel room list</title>
</head>
<body>
<p>Hotel System</p>
<p>Current&gt;&gt;Home page&gt;&gt;Search</p>
<hr>
<p>
<form action="room.do">
    <label>Name:</label>
    <input type="hidden" name="service" value="list" />
    <input type="text" name="hotelName" value="${hotelName}" placeholder="Hotel name"/>
    <input type="submit" value="Search" />
</form>
</p>
<hr>
<p><a href="room.do?service=toAdd">Add</a></p>
<table>
    <tr>
        <th>ID</th>
        <th>Hotel</th>
        <th>Type</th>
        <th>Price</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Operate</th>
    </tr>
    <c:forEach items="${rooms}" var="room">
        <tr>
            <td>${room.id}</td>
            <td>${room.hotelName}</td>
            <td>
                <c:choose>
                    <c:when test="${room.type == 1}">
                        Standard Room
                    </c:when>
                    <c:when test="${room.type == 2}">
                        Superior Room
                    </c:when>
                    <c:when test="${room.type == 3}">
                        President Suite
                    </c:when>

                </c:choose>

            </td>
            <td>${room.price}</td>
            <td>${room.address}</td>
            <td>${room.mobile}</td>
            <td><a href="room.do?service=delete&id=${room.id}">Delete</a></td>

        </tr>
    </c:forEach>


</table>
</body>
</html>

