package servlet01;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by frlegros on 22/03/17.
 */
public class Bonjour extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        // Instruction affichant bonjour dans la page
        rep.setContentType("text/html");
        PrintWriter page = rep.getWriter();
        page.println("<html>");
        page.println("<head>");
        page.println("<title>Servlet bonjour</title>");
        page.println("</head>");
        page.println("<body>");
        page.println("<font size=+2>BONJOUR</font>");
        page.println("</body>");
        page.println("</html>");
    }
}
