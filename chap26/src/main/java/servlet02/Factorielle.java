package servlet02;

import javax.servlet.ServletConfig;
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
@WebServlet("/factorielleres")
public class Factorielle extends HttpServlet {

    private static int compte;

    public void init(ServletConfig Config) throws ServletException{
        compte = 0;
    }

    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        displayRes(req, rep);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        displayRes(req, rep);
    }

    private void displayRes(HttpServletRequest req, HttpServletResponse rep) throws IOException {

        int debut,fin;

        compte++;
        String sDeb = req.getParameter("debut");
        String sFin = req.getParameter("fin");

        if(sDeb==null)
            debut=0;
        else
            debut = Integer.parseInt(sDeb);

        if(sFin==null)
            fin=0;
        else
            fin = Integer.parseInt(sFin);

        // Instruction affichant la page resultats
        rep.setContentType("text/html");
        PrintWriter page = rep.getWriter();
        page.println("<html>");
        page.println("<head>");
        page.println("<title>Servlet calcul de Factorielle</title>");
        page.println("</head>");
        page.println("<body>");
        page.println("<font size=+2>factorielles de  "+debut+" à "+fin+"</font><br>");
        int fac =1;
        for (int i=1;i<=fin;i++){
            fac *=i;
            if (i>= debut)
                page.println(i+"! = "+fac+" <br>");
        }
        page.println("</body>");
        page.println("</html>");
    }
}
