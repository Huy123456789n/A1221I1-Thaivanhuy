package codyGym.controller;

import codyGym.model.Customer;
import codyGym.repository.CustomerRepositoryImpl;
import codyGym.service.CustomerService;
import codyGym.service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();
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
            }break;
        case "searchByName":
            try {
                searchByName(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            break;
        case "searchByAddress":
            try {
                searchByAddress(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            break;
        case "typeCustomer" :
            try {
                formType(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            break;
        default:
            try {
                listCustomer(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            break;
    }
    }
    private void formType(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<String> customer = customerService.typeCustomer(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            request.setAttribute("customer",customer);
            dispatcher = request.getRequestDispatcher("/viewCustomer/type.jsp");
        } dispatcher.forward(request,response);
    }

    private void searchByAddress(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String address = request.getParameter( "name");
        List<Customer> customers = customerService.findByAddress( "%"+ address +"%");
        RequestDispatcher dispatcher;
        if (customers == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            request.setAttribute("customer",customers);
            dispatcher = request.getRequestDispatcher("/viewCustomer/search.jsp");
        } dispatcher.forward(request,response);
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name = request.getParameter( "name");
        List<Customer> customers = customerService.findByName("%"+ name +"%");
        RequestDispatcher dispatcher;
        if (customers == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            request.setAttribute("customer",customers);
            dispatcher = request.getRequestDispatcher("/viewCustomer/search.jsp");
        } dispatcher.forward(request,response);
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
    if (customer == null){
        response.sendRedirect("/error404.jsp");
    }else {
        request.setAttribute("customer",customer);
        response.sendRedirect("/customer");
    }
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
                break;
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
             request.getRequestDispatcher("/error404.jsp").forward(request,response);
        }else {
            customerService.updateCustomer(customer);
            response.sendRedirect("/customer");
        }
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
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer");
            dispatcher.forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
