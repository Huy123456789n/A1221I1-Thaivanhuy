package codyGym.controller;

import codyGym.model.Service;
import codyGym.service.IServiceService;
import codyGym.service.ServiceServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceServlet", value = "/service")
public class ServiceServlet  extends HttpServlet{
    IServiceService serviceService = new ServiceServiceImpl();
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
                    delete(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listService(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String id = request.getParameter("id");
        serviceService.delete(id);
        response.sendRedirect("/service");
    }

    private void formCreate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/viewService/create.jsp");
        dispatcher.forward(request,response);
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Service> services = serviceService.findAll();
        request.setAttribute("service",services);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/viewService/list.jsp");
        dispatcher.forward(request,response);

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
                    createService(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentType = Integer.parseInt(request.getParameter("rentType"));
        int serviceType = Integer.parseInt(request.getParameter("serviceType"));
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");
        int pool = Integer.parseInt(request.getParameter("pool"));
        int floors = Integer.parseInt(request.getParameter("floors"));
        Service service = new Service(id,name,area,cost,maxPeople,rentType,
                serviceType,standardRoom,description,pool,floors);
            if (service == null){
                response.sendRedirect("/error404.jsp");
            } else {
                serviceService.create(service);
                response.sendRedirect("/service");
            }
    }
}
