package chp27.jdbc;

import com.mysql.jdbc.Driver;
import com.sun.rowset.JdbcRowSetImpl;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by frlegros on 09/04/17.
 */
public class InitJdbcRowSetDBConn {

    private String dbName;

    public JdbcRowSet connectDB(String dbName) {

        JdbcRowSet rs = null;
        this.dbName = dbName;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            rs = new JdbcRowSetImpl();
            rs.setUrl("jdbc:mysql://localhost:3306/" + EDbList.JAVA_TRAINING.value());
            rs.setUsername("root");
            rs.setPassword("SpU63root");
            rs.setType(ResultSet.TYPE_SCROLL_SENSITIVE);
            rs.setConcurrency(ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
