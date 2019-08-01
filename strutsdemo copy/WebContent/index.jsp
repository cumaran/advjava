<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.red{color:red;}

</style>
</head>
<body>
<h1 class="red"><s:property value="message"/></h1>
<s:textfield cssClass="red" name="message"/>
<s:form action="login" method="post">
<s:textfield name="userid" label="Enter Your Name"/>
<s:password name="password" label="Enter Your Password"/>
<s:submit/>
</s:form>
</body>
</html>