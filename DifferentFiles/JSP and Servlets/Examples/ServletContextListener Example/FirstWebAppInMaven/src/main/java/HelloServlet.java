import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HelloServlet extends HttpServlet {
public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
    String country = httpServletRequest.getParameter("country");
    if(country.equals("Canada")){
        //Redirect:
        httpServletResponse.sendRedirect("https://yandex.ru/");
    }else {

        String adminEmail = getServletConfig().getInitParameter("adminEmail");
        httpServletRequest.setAttribute("admail", adminEmail);
        httpServletRequest.setAttribute("choosedCountry", country);

        /**
         * Пример чтения ServletConfig и получения из него данных
         */
//        PrintWriter writer = httpServletResponse.getWriter();
//        Enumeration<String> e = getServletConfig().getInitParameterNames();
//
//        while (e.hasMoreElements()){
//            writer.println("<br> param name = " + e.nextElement() + "<br>");
//        }
//
//        writer.println(" main: " + getServletConfig().getInitParameter("mainEmail"));
//        writer.println("<br>");
//        writer.println(" admin: " + getServletConfig().getInitParameter("adminEmail"));
//        writer.close();
        String myName = getServletContext().getInitParameter("myName");
        httpServletRequest.setAttribute("myName", myName);
        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("afterClick.jsp");
        requestDispatcher.forward(httpServletRequest, httpServletResponse);

    }
}

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        doGet(httpServletRequest, httpServletResponse);
    }
}