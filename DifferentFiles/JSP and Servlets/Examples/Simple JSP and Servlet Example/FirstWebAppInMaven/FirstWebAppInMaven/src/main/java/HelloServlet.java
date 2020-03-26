import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
    String country = httpServletRequest.getParameter("country");
    httpServletRequest.setAttribute("country", country);

    RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("afterClick.jsp");
    requestDispatcher.forward(httpServletRequest, httpServletResponse);
}
}