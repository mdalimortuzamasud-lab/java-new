<%@page import="entity.Student" %>
<%@page import="Dao.StudentDao" %>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<<<<<<< HEAD
<%
    StudentDao dao = new StudentDao();
    List<Student> list = dao.getAll();
    request.setAttribute("list", list);
=======

<% 
List<Student> list =studentdao.getAll();
request.setAttribute("list", list);
>>>>>>> b0035f10c7a74b1e4e06baceed22ab7df5a06742
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>All Student</h1>

    <a href="add.jsp">Add New Student</a>

    <table border="1" cellpadding="5" cellspacing="0">
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
                    <td>
                        <a href="studentservlet?action=edit&id=${s.id}">Edit</a> |
                        <a href="studentservlet?action=delete&id=${s.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>