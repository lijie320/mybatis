<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="listClass" method="get">
<input type="text" name="file" value="${Myfile}">
<input type="submit" value="查询"><br>
<c:forEach var="tmp" items="${requestScope.classList}">
       编号：<font color=red>${pageScope.tmp.id}</font><br/>标题：<font color=red>${pageScope.tmp.name}</font><br/>内容：<font color=red>${pageScope.tmp.cfile}</font><br/>
       <a href="${pageContext.request.contextPath}/listClass?id=${pageScope.tmp.id}">删除</a>
       <br/>
       ---------------------------------------------------------------------------------<br/>
    </c:forEach>
   </form>
<form action="listClass" method="get">
标题：<input type="text" name="title" value="${title}"><br>
<br>
内容：<textarea rows="20" cols="22" name="file1">${Myfile1}</textarea><br>
<input type="submit" value="增加">
</form>
</body>
</html>