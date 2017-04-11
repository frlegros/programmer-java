package chp27.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by frlegros on 05/04/17.
 */
public class TestDB02 {

    public static void main(String[] args) {

        try {

            InitDBConn initDBConn = new InitDBConn();
            Connection conn = initDBConn.connectDB(EDbList.JAVA_TRAINING.value());

            // Envoi d’un requête générique
            String sql =  "SELECT pdt.nom, pdt.quantite, frs.nom FROM produits pdt LEFT JOIN fournisseurs frs" +
                    " ON pdt.fournisseur = frs.reference" ;
            Statement stmt = conn.createStatement() ;
            ResultSet res = stmt.executeQuery(sql) ;
            System.out.println("Test DB produits");

            String nomPdt, nomFrs;
            int qtePdt;
            while (res.next()) {
                nomPdt = res.getString("pdt.nom");
                qtePdt = res.getInt("pdt.quantite");
                nomFrs = res.getString("frs.nom");
                System.out.println(qtePdt+" "+nomPdt+" du fournisseur "+((nomFrs==null)?"Inconnu":nomFrs));
            }
            res.close();stmt.close();conn.close();
        } catch (SQLException e) {
            System.out.println("ERROR DB");
//            e.printStackTrace();
            System.out.println("Error Code= " + e.getErrorCode());
        }
    }
}
