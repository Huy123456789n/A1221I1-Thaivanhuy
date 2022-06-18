package codeGym.controller;

import codeGym.model.User;
import codeGym.repository.UserRepositoryImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ControllerServlet", urlPatterns = "/user")
public class ControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserRepositoryImpl userRepository;
    public void init(){
        userRepository = new UserRepositoryImpl();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    break;
                case "edit":
                    break;
                case "delete":
                    break;
                default:
                listUser(request,response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = this.userRepository.selectAllUser();
        RequestDispatcher dispatcher;
        if (users == null) {
            dispatcher = request.getRequestDispatcher("/view/error404.jsp");
        } else {
            request.setAttribute("user",users);
            dispatcher = request.getRequestDispatcher("/view/list.jsp");
        }dispatcher.forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null) {
        action = "";
    }
    try {
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
