<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <!-- 引入jstl 核心标签库   开启EL表达式-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user details page</title>
</head>
<body>
<h3>  users detail info</h3></br>
  <form action = "${pageContext.request.contextPath}/user/update/${user.id}" method= "POST" >
   <input   type="hidden"   name="_method" value="PUT" />
   <input  hidden="hidden" value="${user.id }"/>
   state:  <input  typer= "text" value="${user.state }"  name="state"> </br>
   nickname:<input  typer= "text"value=" ${user.nickname }"name="nickname" ></br>  
    <input type="button" value="cancle">
    <input type="submit" value="submit">
    </form>
</body>
</html>