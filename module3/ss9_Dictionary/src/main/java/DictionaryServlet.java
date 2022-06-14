import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", value = "/Dictionary")
public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map <String, String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin chao");
        dictionary.put("how", "Thế Nào");
        dictionary.put("What are you doing", "Bạn đang làm gì thế");
        dictionary.put("dictionary", "Từ Điển");
        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if(result != null) {
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        } else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }

