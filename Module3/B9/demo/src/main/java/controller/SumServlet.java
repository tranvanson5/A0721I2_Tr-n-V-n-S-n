package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SumServlet", urlPatterns = "/sum_servlet")
public class SumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double numberOne= Double.parseDouble(request.getParameter("numberOne"));
        double numberTwo= Double.parseDouble(request.getParameter("numberTwo"));
        double result= numberOne+numberTwo;
        request.setAttribute("result: ", result);


//        PrintWriter printWriter= response.getWriter();
//        printWriter.write("<html>");
//        printWriter.write("<body>");
//        printWriter.write("<h2 style =' color:red'>"+result+"</h2>");
//        printWriter.write("</body>");
//        printWriter.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double numberOne = Double.parseDouble(request.getParameter("numberOne"));
        double numberTwo = Double.parseDouble(request.getParameter("numberTwo"));
        double result = numberOne + numberTwo;
//        key và value
//        Dùng để gửi dữ liệu sang trang jsp -> hiển thị cho người dùng
        System.out.println("hello các bạn A07");
        request.setAttribute("result1", result);
        request.getRequestDispatcher("result_final.jsp").forward(request, response);
    }
}
