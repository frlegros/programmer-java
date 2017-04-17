package chp27.jdbc;

import com.sun.rowset.JdbcRowSetImpl;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by frlegros on 05/04/17.
 */
public class TestDB06 {

    public static void main(String[] args) {

        try {
            InitJdbcRowSetDBConn initDBConn = new InitJdbcRowSetDBConn();
            JdbcRowSet rs = initDBConn.connectDB(EDbList.JAVA_TRAINING.value());

            rs.setCommand("SELECT * FROM produits");
            rs.execute();

            System.out.println("Test DB produits with JDBCRowSetImpl autonome");

            // Petite mise à jour
            rs.first();
            rs.updateString("nom", "Cafetiere 9T");
            rs.updateRow();
            // Liste dans l'ordre inverse
            String nom;
            int qte;
            rs.afterLast();
            while (rs.previous()) {
                nom = rs.getString("nom");
                qte = rs.getInt("quantite");
                System.out.println(nom + " " + qte);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
