import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet", value = "/calculatorServlet")
public class calculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float number1 = Float.parseFloat(request.getParameter("number"));
        float number2 = Float.parseFloat(request.getParameter("number2"));
        float add = number1 + number2;
        float sub = number1 - number2;
        float mul = number1 * number2;
        float div = number1 / number2;
        String select = request.getParameter("select");
        PrintWriter writer = response.getWriter();
        switch (select) {
            case "Addition":
                writer.println("add :" + add );
                break;
            case "Subtraction":
                writer.println("Sub :" + sub);
                break;
            case "multiplication":
                writer.println("mul" + mul);
                break;
            case "Division" :
                if (number2 == 0) {
                    try {
                        throw new divisionException("Denominator not equal to 0 ");
                    } catch (divisionException e) {
                        e.printStackTrace();
                    }
                }
                writer.println("div" + div);
                break;
            default: writer.println("Error");
        }
    }
}
