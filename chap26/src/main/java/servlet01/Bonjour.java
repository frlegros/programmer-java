package servlet01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by frlegros on 22/03/17.
 */
@WebServlet("/helloyou")
public class Bonjour extends HttpServlet {

    private static int compte;

    public void init(ServletConfig Config) throws ServletException{
        compte = 0;
    }

    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        displayHello(req, rep);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        displayHello(req, rep);
    }

    private void displayHello(HttpServletRequest req, HttpServletResponse rep) throws IOException {
        compte++;
        String nom = req.getParameter("nom");
        // Instruction affichant bonjour dans la page
        rep.setContentType("text/html");
        PrintWriter page = rep.getWriter();
        page.println("<html>");
        page.println("<head>");
        page.println("<title>Servlet bonjour</title>");
        page.println("</head>");
        page.println("<body>");
        page.println("<font size=+2>BONJOUR "+nom+"</font>");
        page.println("<font size=+2>Cela fait "+compte+" fois que je dis bonjour</font>");
        page.println("</body>");
        page.println("</html>");
    }
}
