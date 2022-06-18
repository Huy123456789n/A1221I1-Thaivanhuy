package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControllerServlet", urlPatterns = "/customer")
public class ControllerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if(action == null) {
        action = "";
    }
    switch (action) {
        case "create":
            createFrom(request,response);
            break;
        case "edit" :
            ShowFromEdit(request,response);
            break;
        case "delete":
            ShowDelete(request,response);
            break;
        case "view":
            DisplayCustomer(request,response);
            break;
        default:
            listCustomers(request, response);
    }
    }

    private void ShowDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("/customer/error-404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("/customer/delete.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void DisplayCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("/customer/error-404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("/customer/view.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void ShowFromEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            dispatcher = request.getRequestDispatcher("/customer/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createFrom(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerService.findAll();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request,response);
                break;
            case "edit" :
                updateCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "view":
                break;
            default:
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("/customer/error-404.jsp");
        } else {
            this.customerService.remove(id);
        }
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        RequestDispatcher dispatcher;
    Customer customer = this.customerService.findById(id);
    if (customer == null) {
        dispatcher = request.getRequestDispatcher("error-404.jsp");
    }else {
        customer.setName(name);
        customer.setEmail(email);
        customer.setAddress(address);
        this.customerService.update(id,customer);
        request.setAttribute("customer", customer);
        dispatcher = request.getRequestDispatcher("/customer/edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id = (int) (Math.random()*10000);
        Customer customer = new Customer(id,name,email,address);
        this.customerService.save(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
