import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "customerServlet", urlPatterns = "")
public class customerServlet extends HttpServlet {
    private static List<customer> customerList;
    static {
        customerList = new ArrayList<>();
        customerList.add(new customer("Huy","01/10/1999","Đà Nẵng","img_avatar.png"));
        customerList.add(new customer("Sơn","01/01/1999","Huế","img_avatar2.png"));
        customerList.add(new customer("Cường","01/10/2010","Hà Nội","img_avatar.png"));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
