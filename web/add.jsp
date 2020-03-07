<%--
  Created by IntelliJ IDEA.
  User: jersey
  Date: 3/7/20
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form action="room.do" method="post">
    <input type="hidden" name="service"  value="doAdd"/>
    <p>
        Room type:
        <input type="radio" name="type" value="1" />Standard Room
        <input type="radio" name="type" value="2" />Superior Room
        <input type="radio" name="type" value="3" />President suite
    </p>
    <p>
        Price:
        <input type="text" name="price" />
    </p>
    <p>
        Hotel:
        <select name="hotelId">
            <c:forEach items="${hotels}" var="hotel">
                <option value="${hotel.id}">${hotel.name}</option>
            </c:forEach>
        </select>
    </p>
    <p>
        Info:
        <textarea name="info"></textarea>
    </p>
    <input type="submit"  value="Submit"/>
</form>
</body>
</html>
