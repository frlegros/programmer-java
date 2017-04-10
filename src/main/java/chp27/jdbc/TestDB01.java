package chp27.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by frlegros on 05/04/17.
 */
public class TestDB01 {

    public static void main(String[] args) {

        try {

            InitDBConn initDBConn = new InitDBConn();
            Connection conn = initDBConn.connectDB();

            // Envoi d’un requête générique
            String sql =  "SELECT nom, quantite from produits" ;
            Statement stmt = conn.createStatement() ;
            ResultSet res = stmt.executeQuery(sql) ;
            System.out.println("Test DB produits");

            String nom;
            int quantite;
            while (res.next()) {
                nom = res.getString("nom");
                quantite = res.getInt("quantite");
                System.out.println(quantite+" "+nom) ;
            }
            res.close();stmt.close();conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
