package chp27.jdbc;

import java.sql.*;

/**
 * Created by frlegros on 05/04/17.
 */
public class TestDB04 {

    public static void main(String[] args) {

        try {

            InitDBConn initDBConn = new InitDBConn();
            Connection conn = initDBConn.connectDB(EDbList.JAVA_TRAINING.value());

            // Tableau des ref recherchées
            String refCherchees[] = {"E248", "A427", "A432"};

            // Envoi d’un requête générique
            String sql = "SELECT * FROM produits WHERE reference=?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);

            ResultSet res;
            System.out.println("Test DB produits with prepared Statement");
            for (int i = 0; i < refCherchees.length; i++) {
                prepStmt.setString(1, refCherchees[i]);
                res = prepStmt.executeQuery();
                System.out.println("-- Produit de reference " + refCherchees[i]);
                while (res.next()) {
                    int qte = res.getInt("quantite");
                    String nom = res.getString("nom");
                    System.out.println(nom + " " + refCherchees[i] + " " + qte);
                }
                res.close();
            }
            prepStmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
