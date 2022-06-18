package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
             ShowFormCreate(request,response);
                break;
            case "delete":
                Showdelete(request,response);
                break;
            case "update":
                ShowFromEdit(request,response);
                break;
            case "search":
                ShowFromSeach(request,response);
                break;
            case "view":
                ShowProduct(request,response);
                break;
            default:
                listProduct(request, response);

        }
    }

    private void ShowProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher;
        Product product = productService.findId(id);
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/view/error-404.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("/view/view.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ShowFromSeach(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/search.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Showdelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findId(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/view/error-404.jsp");
        } else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("/view/delete.jsp");
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
        Product product = this.productService.findId(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/view/error-404.jsp");
        } else {
            dispatcher = request.getRequestDispatcher("/view/update.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void ShowFormCreate(HttpServletRequest request, HttpServletResponse response) {
   creaetProduct(request,response);
 }
 private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.displayAll();
        request.setAttribute("product", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                creaetProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "update":
                updateProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            case "view":
                break;
            default:
                listProduct(request, response);

        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("search");
       Product product = this.productService.search(name);
        RequestDispatcher dispatcher;
  if (product == null) {
      dispatcher = request.getRequestDispatcher("/view/error-404.jsp");
  }else {
      request.setAttribute("product",product);
      dispatcher = request.getRequestDispatcher("/view/search.jsp");
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
        RequestDispatcher dispatcher;
        Product product = this.productService.findId(id);
        if(product == null) {
            dispatcher = request.getRequestDispatcher("/view/error-404.jsp");
        }else {
            this.productService.delete(id);
            dispatcher = request.getRequestDispatcher("/view/delete.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        Product product = this.productService.findId(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/view/error-404.jsp");
        } else {
            product.setName(name);
            product.setPrice(price);
            product.setDescription(description);
            dispatcher = request.getRequestDispatcher("/view/update.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void creaetProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        int id = (int) (Math.random()*1000);
        Product product = new Product(id,name,price,description);
        this.productService.addNew(product);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
