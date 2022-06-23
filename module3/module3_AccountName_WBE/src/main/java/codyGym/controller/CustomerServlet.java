package codyGym.controller;

import codyGym.model.Customer;
import codyGym.repository.CustomerRepositoryImpl;
import codyGym.service.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private static CustomerService customerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null){
        action = "";
    }
    switch (action) {
        case "create":
            formCreate(request,response);
            break;
        case "delete":
            try {
                formDelete(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            break;
        case "update":
            try {
                formedit(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        default:
            try {
                listCustomer(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            break;
    }
    }

    private void formedit(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null){
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        }
        else {
            request.setAttribute("customer",customer);
            dispatcher = request.getRequestDispatcher("/viewCustomer/update.jsp");
        } dispatcher.forward(request,response);
    }

    private void formCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/viewCustomer/create.jsp");
        dispatcher.forward(request,response);
    }

    private void formDelete(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    Customer customer = customerService.findById(id);
    RequestDispatcher dispatcher;
    if (customer == null){
        dispatcher = request.getRequestDispatcher("error404.jsp");
    }else {
        request.setAttribute("customer",customer);
        dispatcher = request.getRequestDispatcher("/viewCustomer/delete.jsp");
    } dispatcher.forward(request,response);
    }
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Customer> customers = customerService.findAll();
        RequestDispatcher dispatcher;
        if (customers == null){
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            request.setAttribute("customer", customers);
            dispatcher = request.getRequestDispatcher("/viewCustomer/listCustomer.jsp");
        }
        dispatcher.forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createCustomer(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                deleteCustomer(request,response);
                try {
                    formDelete(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "update":
                try {
                    updateCustomer(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            default:
    }
}

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        int gender = Integer.parseInt(request.getParameter("gender"));
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int type = Integer.parseInt(request.getParameter("type"));
        int sdt = Integer.parseInt(request.getParameter("sdt"));
        Customer customer = new Customer(id,name,email,sdt,date,cmnd,gender,address,type);
        RequestDispatcher dispatcher ;
        if (customer == null){
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        }else {
            customerService.updateCustomer(customer);
            dispatcher = request.getRequestDispatcher("/viewCustomer/update.jsp");
        } dispatcher.forward(request,response);
    }
    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        int gender = Integer.parseInt(request.getParameter("gender"));
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int type = Integer.parseInt(request.getParameter("type"));
        int sdt = Integer.parseInt(request.getParameter("sdt"));
        Customer customer = new Customer(name,email,sdt,date,cmnd,gender,address,type);
        customerService.createCustomer(customer);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            dispatcher = request.getRequestDispatcher("/viewCustomer/create.jsp");
        } dispatcher.forward(request,response);
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            customerService.deleteCustomer(id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("viewCustomer/delete.jsp");
            dispatcher.forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
