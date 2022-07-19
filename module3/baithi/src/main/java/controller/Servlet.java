package controller;

import model.PayType;
import model.Room;
import service.IService;
import service.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = {"/room",""})
public class Servlet extends HttpServlet {
    private IService service = new Service();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    formCreate(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
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
                    formUpdate(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                try {
                    formSearch(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "SearchById":
                try {
                    formSearchById(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            default:
                try {
                    listAll(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

        }
    }

    private void formSearchById(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("search"));
        Room room  = service.findById(id);
        request.setAttribute("p",room);
        request.getRequestDispatcher("/view/searchById.jsp").forward(request,response);
    }

    private void listAll(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Room> rooms = service.findAll();
        request.setAttribute("room",rooms);
        request.getRequestDispatcher("/view/list.jsp").forward(request,response);
    }

    private void formSearch(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name_r = request.getParameter("search");
        List<Room> rooms = service.findByName("%" + name_r + "%");
        request.setAttribute("room",rooms);
        request.getRequestDispatcher("/view/search.jsp").forward(request,response);
    }

    private void formUpdate(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Room room = service.findById(id);
        List<PayType> payTypes = service.findALLPayType();
        request.setAttribute("payType",payTypes);
        request.setAttribute("p",room);
        request.getRequestDispatcher("/view/update.jsp").forward(request,response);
    }

    private void formDelete(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Room room = service.findById(id);
        request.setAttribute("p",room);
        request.getRequestDispatcher("/view/delete.jsp").forward(request,response);
    }

    private void formCreate(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<PayType> payTypes = service.findALLPayType();
        request.setAttribute("payType",payTypes);
        request.getRequestDispatcher("view/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    create(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    delete(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "update":
                try {
                    update(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name  = request.getParameter("name");
        String sdt = request.getParameter("sdt");
        String dayStar = request.getParameter("starDay");
        int idThanhToan = Integer.parseInt(request.getParameter("payType"));
        String note = request.getParameter("note");
        Room room = new Room(id,name,sdt,dayStar,note,idThanhToan);
        service.update(room);
        response.sendRedirect("/room");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        service.delete(id);
        response.sendRedirect("/room");
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name  = request.getParameter("name");
        String sdt = request.getParameter("sdt");
        String dayStar = request.getParameter("starDay");
        int idThanhToan = Integer.parseInt(request.getParameter("payType"));
        String note = request.getParameter("note");
        Room room = new Room(name,sdt,dayStar,note,idThanhToan);
        service.create(room);
        response.sendRedirect("/room");
    }
}
