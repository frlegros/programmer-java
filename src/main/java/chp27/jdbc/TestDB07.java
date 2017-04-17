package chp27.jdbc;

import javax.sql.rowset.JdbcRowSet;
import java.sql.ResultSetMetaData;

/**
 * Created by frlegros on 05/04/17.
 */
public class TestDB07 {

    public static void main(String[] args) {

        try {

            InitJdbcRowSetDBConn initDBConn = new InitJdbcRowSetDBConn();
            JdbcRowSet rs = initDBConn.connectDB(EDbList.JAVA_TRAINING.value());

            rs.setCommand("SELECT * FROM produits");
            rs.execute();

            System.out.println("Analyse du résultat par création de MetaDonnées associées");

            ResultSetMetaData resMeta = rs.getMetaData();
            System.out.println("--- Infos champs table produits: nom, type SQL, numéro type SQL, type Java");

            int nbChamps = resMeta.getColumnCount();

            for (int i = 1; i <= nbChamps; i++) {
                String nom = resMeta.getColumnName(i);
                String typeSQL = resMeta.getColumnTypeName(i);
                int numTypeSQL = resMeta.getColumnType(i);
                String typeJava = resMeta.getColumnClassName(i);
                System.out.println(nom + ", " + typeSQL + ", " + numTypeSQL + ", " + typeJava);
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
