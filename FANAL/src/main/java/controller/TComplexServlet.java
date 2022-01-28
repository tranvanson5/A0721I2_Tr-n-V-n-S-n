package controller;

import model.TComplex;
import service.TComplexService;
import service.TComplexServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "TComplexServlet", urlPatterns = "/tcomplex")
public class TComplexServlet extends HttpServlet {
    private TComplexService tComplexService;

    public void init() {
        tComplexService = new TComplexServiceImp();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                try {
                    delete(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            default:
                try {
                    showList(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
            int id = Integer.parseInt(request.getParameter("id"));
            tComplexService.delete(id);

            List<TComplex> list = tComplexService.selectAll();
            request.setAttribute("list", list);
            RequestDispatcher dispatcher = request.getRequestDispatcher("tcomplex/list.jsp");
            dispatcher.forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        List<TComplex> list= tComplexService.selectAll();
        request.setAttribute("list",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("tcomplex/list.jsp");
        dispatcher.forward(request,response);
    }
}
