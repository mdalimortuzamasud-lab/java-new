/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servent;

import Dao.StudentDao;
import entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author HP-PC
 */
@WebServlet("/studentservlet")
public class StudentServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equalsIgnoreCase(action)) {
            Student s = new Student();
            s.setName(request.getParameter("name"));
            s.setEmail(request.getParameter("email"));
            s.setDob(request.getParameter("dob"));
            s.setFee(Double.parseDouble(request.getParameter("fee")));

            StudentDao.save(s);
            response.sendRedirect("home.jsp");

        } else if ("update".equalsIgnoreCase(action)) {
            Student s = new Student();
            s.setId(Integer.parseInt(request.getParameter("id")));
            s.setName(request.getParameter("name"));
            s.setEmail(request.getParameter("email"));
            s.setDob(request.getParameter("dob"));
            s.setFee(Double.parseDouble(request.getParameter("fee")));
            System.out.println("Servlet Works");

            StudentDao.update(s);
            response.sendRedirect("home.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equalsIgnoreCase(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            StudentDao.delete(id);
            response.sendRedirect("home.jsp");

        } else if ("edit".equalsIgnoreCase(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Student s = StudentDao.getById(id);
            request.setAttribute("student", s);
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        }
    }

}
