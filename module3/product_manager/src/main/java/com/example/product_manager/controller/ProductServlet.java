package com.example.product_manager.controller;

import com.example.product_manager.model.Category;
import com.example.product_manager.model.Product;
import com.example.product_manager.repository.CategoryRepository;
import com.example.product_manager.repository.ICategoryRepository;
import com.example.product_manager.service.IProductService;
import com.example.product_manager.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product",""})
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductServiceImpl();
    private ICategoryRepository categoryRepository = new CategoryRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    formCreate(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    formDelete(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "update":
                try {
                    formUpdate(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "searchByName":
                try {
                    searchByName(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "soft":
                try {
                    listSoft(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listProduct(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    private void listSoft(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Product> products = productService.softByName();
        request.setAttribute("product", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(request, response);
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String search = request.getParameter("search");
        List<Product> products = productService.findByName("%" + search + "%");
        request.setAttribute("product", products);
        request.getRequestDispatcher("/view/search.jsp").forward(request,response);
    }

    private void formUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
       Product product =  productService.findById(id);
        List<Category> categories = categoryRepository.findAll();
        request.setAttribute("category",categories);
        request.setAttribute("product",product);
        request.getRequestDispatcher("/view/update.jsp").forward(request,response);
    }

    private void formCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Category> categories = categoryRepository.findAll();
        request.setAttribute("category",categories);
        request.getRequestDispatcher("/view/create.jsp").forward(request, response);
    }

    private void formDelete(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
       productService.delete(id);
//       response.sendRedirect("/product");
        listProduct(request, response);
    }
    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Product> products = productService.findAll();
        request.setAttribute("product", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    create(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    formDelete(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            case "update":
                try {
                    update(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            default:
        }
    }
    private void update(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        Product product = new Product(id,name,price,quantity,color,description,category);
        productService.update(product);
        response.sendRedirect("/product");
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        Product product = new Product(name,price,quantity,color,description,category);
        productService.create(product);
        response.sendRedirect("/product");
    }
}

