<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 引入jstl 核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %><!--JSP默认是禁用EL表达式的 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user input pages</title>
</head>
<body>
 <form action = "save" method= "post">
   <fieldset  style="width: 300px;">
     <legend > user info</legend>    
     State: <input type= "text" name ="state"></br>
     nickName:<input type= "text" name ="nickname"> </br>
     <input type="reset" value="cancle">
     <input type="submit" value="submit">
   </fieldset>
 </form>
</body>
</html>