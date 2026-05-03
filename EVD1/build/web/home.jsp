<%@page import="entity.Student" %>
<%@page import="dao.studentdao" %>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<% 
List<Student> list =studentdao.getAll();
request.setAttribute("list", list);
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        <table>
<thead>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>DoB</th>
    <th>Fee</th>
    <th>Action</th>
</tr>
</thead>
<tbody>
    <c:forEach items="${list}" var="s">
         <tr>
    <td>${s.id}</td>
    <td>${s.name}</td>
    <td>${s.email}</td>
    <td>${s.dob}</td>
    <td>${s.fee}</td>
 </tr>
    </c:forEach>
     
</tbody>
</table>
    </body>
</html>
