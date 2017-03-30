package servlet01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by frlegros on 22/03/17.
 */
@WebServlet("/hello")
public class BonjourForm extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        displayForm(rep);
    }

    private void displayForm(HttpServletResponse rep) throws IOException {
        // Instruction affichant bonjour dans la page
        rep.setContentType("text/html");
        PrintWriter page = rep.getWriter();
        page.println("<html>");
        page.println("<head>");
        page.println("<title>Servlet bonjour</title>");
        page.println("</head>");
        page.println("<body>");
        formPostAction(page);
        page.println("Quel est votre nom: <input type='text' size='24' name='nom' value=''>");
        page.println("<input type='submit' value='OK'>");
        page.println("</body>");
        page.println("</html>");
    }

    private void formGetAction(PrintWriter page) {
        page.println("<form action='helloyou' method='GET'>");
    }

    private void formPostAction(PrintWriter page) {
        page.println("<form action='helloyou' method='POST'>");
    }
}
