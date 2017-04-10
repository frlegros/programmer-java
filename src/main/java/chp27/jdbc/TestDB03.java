package chp27.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by frlegros on 05/04/17.
 */
public class TestDB03 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        InitDBConn initDBConn = new InitDBConn();
        Connection conn = initDBConn.connectDB();

        // Envoi d’un requête générique
        String sql = "SELECT * FROM produits";
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet res = stmt.executeQuery(sql);
        System.out.println("Test DB Update produits");

        String refCherchee = "A521";
        while (res.next()) {
            String ref = res.getString("reference");
            int qtePdt = res.getInt("quantite");
            System.out.println("Referneche cherchee " + refCherchee + " == " + ref+"?");
            if (ref.equals(refCherchee)) {
                System.out.println("Referneche cherchee " + ref + " trouvee. Quantite actuelle: " + qtePdt);
                int ancienneQte = res.getInt("quantite");
                res.updateInt("quantite", ancienneQte+10);
                res.updateRow();
            }
        }

        System.out.println("List DB produits after Update "+refCherchee);
        res.afterLast();
        while (res.previous()) {
            String ref = res.getString("reference");
            int qtePdt = res.getInt("quantite");
            System.out.println("Referneche after update " + ref + " trouvee. Quantite : " + qtePdt);

        }
        res.close();
        stmt.close();
        conn.close();
    }
}
