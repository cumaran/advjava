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

<s:iterator value="list" var="x">
<s:if test="%{#x=='Delhi'}">
<h1>${x}</h1>
</s:if>
<s:else>
${x}
</s:else>
</s:iterator>
<s:combobox name="city" label="Select City" headerKey="-1" headerValue="Select" list="list"></s:combobox>
<s:a href="admin/adminAC">Admin</s:a>
<s:a href="users/userAC">Users</s:a>
<h1 class="red"><s:property value="message"/></h1>
<s:textfield cssClass="red" name="message"/>
<s:form action="login" method="post">
<s:textfield name="userid" label="Enter Your Name"/>
<s:password name="password" label="Enter Your Password"/>
<s:submit/>
</s:form>
</body>
</html>