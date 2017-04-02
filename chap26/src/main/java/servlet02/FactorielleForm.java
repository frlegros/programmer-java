package servlet02;

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
@WebServlet("/factorielle")
public class FactorielleForm extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        displayForm(rep);
    }

    private void displayForm(HttpServletResponse rep) throws IOException {
        rep.setContentType("text/html");
        PrintWriter page = rep.getWriter();
        page.println("<html>");
        page.println("<head>");
        page.println("<title>Servlet de calcul de factorielles</title>");
        page.println("</head>");
        page.println("<body>");
        formGetAction(page);
        page.println("Calcul des factorielles des nombres <br><br>");
        page.println("de <input type='text' size='12' name='debut' value='1'>");
        page.println("à <input type='text' size='12' name='fin' value='5'>");
        page.println("<input type='submit' value='OK'>");
        page.println("</body>");
        page.println("</html>");
    }

    private void formGetAction(PrintWriter page) {
        page.println("<form action='factorielleres' method='GET'>");
    }

    private void formPostAction(PrintWriter page) {
        page.println("<form action='factorielleres' method='POST'>");
    }
}
