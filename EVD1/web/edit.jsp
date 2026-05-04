<%-- 
    Document   : edit.jsp
    Created on : May 3, 2026, 11:59:38 PM
    Author     : HP-PC
--%>
<%@page import="entity.Student" %>
<%
Student s= (Student)request.getAttribute("student");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="studentservlet" method="post">
            <input type="hidden" name="action" value="update">
            <input type="hidden" name="id" value="<%=s.getId()%>"> 

            <label>Name</label>
            <input type="text" name="name" value="<%=s.getName()%>"><br>

            <label>Email</label>
            <input type="email" name="email" value="<%=s.getEmail()%>"><br>

            <label>Date of Birth</label>
            <input type="date" name="dob" value="<%=s.getDob()%>"><br>

            <label>Fee</label>
            <input type="text" name="fee" value="<%=s.getFee()%>"><br>

            <input type="submit" value="save">
        </form>
    </body>
</html>
