package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            case "edit" :
                editProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            default:
                break;
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        double price= Double.parseDouble(request.getParameter("price"));
        String description= request.getParameter("description");
        String manufature= request.getParameter("manafacture");
        Product product= new Product(id, name,price,description,description);
        RequestDispatcher dispatcher;
        if(product==null){
            dispatcher= request.getRequestDispatcher("error-404.jsp");
        }else {
            product.getName();
            product.getPrice();
            product.getDescription();
            product.getManufacture();
            this.productService.update(id, product);
            request.setAttribute("massage","Product information was updated");
            dispatcher= request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            this.productService.remove(id);
            try {
                response.sendRedirect("/products");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name= request.getParameter("name");
        double price= Double.parseDouble(request.getParameter("price"));
        String description= request.getParameter("description");
        String manufacture= request.getParameter("manufacture");
        int id = (int)(Math.random() * 10000);
        Product product= new Product(id,name,price,description,manufacture);
        this.productService.save(product);
        RequestDispatcher dispatcher= request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message","New product was created");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if(action == null){
            action = "";
        }
            switch (action){
                case "create":
                    showCreateProduct(request,response);
                    break;
                case "edit" :
                    showEdit(request,response);
                    break;
                case "delete":
                    showDelete(response,request);
                    break;
                case "view":
                    viewProduct(request,response);
                    break;
                default:
                    listProduct(request,response);
                    break;
            }
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product= this.productService.findById(id);

        RequestDispatcher dispatcher;
        if(product== null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else
        {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/view.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product= this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product==null){
            dispatcher= request.getRequestDispatcher("error-404.jsp");
        } else{
            request.setAttribute("products",product);
            dispatcher= request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDelete(HttpServletResponse response, HttpServletRequest request) {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product= productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher= request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList=this.productService.findAll();
        request.setAttribute("products",productList);
        RequestDispatcher dispatcher= request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
