<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Application Object <%=application.getAttribute("share") %>
<label>City</label>
<select>
<c:forEach items="${city}" var="obj">
<option value="${obj.val}">${obj.desc}</option>
</c:forEach>
</select>

</body>
</html>