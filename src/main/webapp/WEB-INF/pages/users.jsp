<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 引入jstl 核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user list pages</title>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.9.0.js"></script>
<script type="text/javascript">
	$(function(){
		$(".delete").click(function(){
			var href = $(this).attr("href");
			$("form").attr("action", href).submit();			
			return false;
		});
	})
</script>
</head>
<body>
   <form action="" method="POST">
     <input type="hidden"  name="_hidden" value="DELETE"/>
   </form>

<h2>用户列表</h2>
<a href= "${pageContext.request.contextPath}/user/add" >新增</a>
<table border ="1">
 <tr>
   <td>id</td>
   <td>state</td>
   <td>nickname</td>
   <td>操作</td>
 </tr>
  <c:forEach items="${users }" var="u">
    <tr>
     <td>${u.id }</td>
     <td>${u.state }</td>
     <td>${u.nickname }</td>
     <td> 
       <a href="${pageContext.request.contextPath}/user/edit/${u.id}">编辑</a>
       <a  calss ="delete" href="${pageContext.request.contextPath}/user/delete/${u.id}">删除</a>
     
     </td>
    
    </tr>
  
  </c:forEach>
</table>

</body>
</html>