package controller;

import model.employee.employee;
import sevice.employee.EmployeeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    public EmployeeService employeeService = new EmployeeService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            listShow(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void listShow(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<employee> list  = employeeService.getAll();
        request.setAttribute("list",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("listemployee.jsp");
        dispatcher.forward(request,response);
    }
}
