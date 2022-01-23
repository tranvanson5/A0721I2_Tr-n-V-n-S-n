package controller;

import Service.IUserDao;
import Service.UserDao;
import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private IUserDao iUserDAO;

    public void init() {
        iUserDAO = new UserDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                try {
                    insertUser(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit" :
                try {
                    updateUser(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User newUser = new User(name, email, country);
        iUserDAO.insertUser(newUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
        dispatcher.forward(request, response);
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String country= request.getParameter("country");
        User user= new User(id,name,email,country);
        iUserDAO.update(user);
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/edit.jsp");
        dispatcher.forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                showNewForm(request, response);
                break;
            case "edit" :
                try {
                    showUpdateUser(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case  "delete":
                try {
                    deleteUser(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                listUser(request,response);
                break;
        }

    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
        dispatcher.forward(request, response);
    }

    private void showUpdateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));

        User user=iUserDAO.seleteUser(id);
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/edit.jsp");
        request.setAttribute("listUser",user);
        dispatcher.forward(request,response);
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        iUserDAO.delete(id);

        List <User> users =iUserDAO.getAll();
        request.setAttribute("listUser",users);
        RequestDispatcher dispatcher= request.getRequestDispatcher("user/list.jsp");
        dispatcher.forward(request,response);
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        List <User> users =iUserDAO.getAll();
        request.setAttribute("listUser",users);
        RequestDispatcher dispatcher= request.getRequestDispatcher("user/list.jsp");
        dispatcher.forward(request,response);
    }
}
