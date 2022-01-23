import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", value = "/discount")
public class CalculateDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Description= request.getParameter("Description");
        float Price= Float.parseFloat( request.getParameter("Price"));
        float Discount=  Float.parseFloat(request.getParameter("Discount"));
        float newPrice  = (float) (Price-Price * Discount * 0.01);
        PrintWriter printWriter= response.getWriter();
        printWriter.println("<HTML>");
        printWriter.println("<p>"+Description+"</p>");
        printWriter.println("<p>"+newPrice+"</p>");
        printWriter.println("</HTML>");
    }
}
