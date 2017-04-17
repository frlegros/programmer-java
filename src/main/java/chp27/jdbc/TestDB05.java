package chp27.jdbc;

import com.sun.rowset.JdbcRowSetImpl;

import javax.sql.rowset.JdbcRowSet;
import java.sql.*;

/**
 * Created by frlegros on 05/04/17.
 */
public class TestDB05 {

    public static void main(String[] args) {

        try {

            InitDBConn initDBConn = new InitDBConn();
            Connection conn = initDBConn.connectDB(EDbList.JAVA_TRAINING.value());

            // Envoi d’un requête générique
            String sql = "SELECT * FROM produits";
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet res;
            res = stmt.executeQuery(sql);
            System.out.println("Test DB produits with JDBCRowSetImpl");
            JdbcRowSet rs = new JdbcRowSetImpl(res);

            String nom;
            int qte;
            // Petite mise à jour
            rs.first();
            rs.updateString("nom", "Cafetiere 6T");
            rs.updateRow();
            // Liste dans l'ordre inverse
            rs.afterLast();
            while (rs.previous()) {
                nom = rs.getString("nom");
                qte = rs.getInt("quantite");
                System.out.println(nom + " " + qte);
            }

            stmt.close();
            res.close();
            rs.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
