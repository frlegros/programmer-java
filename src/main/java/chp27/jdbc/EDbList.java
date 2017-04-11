package chp27.jdbc;

/**
 * Created by frlegros on 11/04/17.
 */
public enum EDbList {

    JAVA_TRAINING("java_training"),
    WORDPRESS("wordpress");

    private String dbName;

    private EDbList(String dbName) {
        this.dbName = dbName;
    }

    public String value() {
        return this.dbName;
    }

}
