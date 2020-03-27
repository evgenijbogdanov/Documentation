import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListenerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
       httpServletResponse.setContentType("text/html");
        PrintWriter writer = httpServletResponse.getWriter();

        Dog dog = (Dog) getServletContext().getAttribute("dog");
        writer.println("Dog's breed is " + dog.getBreed() + " and color is " + dog.getColor());
        writer.close();

    }
}
