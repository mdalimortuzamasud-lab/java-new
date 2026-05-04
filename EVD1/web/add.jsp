<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add Student</title>
    </head>
    <body>
        <a href="add.jsp">ADD Student</a>
        <h1>Add Student</h1>

        <form action="StudentServent" method="Post">
            <input type="hidden"name="action"value="add"/>


        <form action="studentservlet" method="post">
            <input type="hidden" name="action" value="add">

            <label>Name</label>
            <input type="text" name="name"><br>

            <label>Email</label>
            <input type="email" name="email"><br>

            <label>Date of Birth</label>
            <input type="date" name="dob"><br>

            <label>Fee</label>
            <input type="text" name="fee"><br>

            <input type="submit" value="save">
        </form>
    </body>
</html>