package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
    protected static final String USERNAME = "C##BDD3_5";
    protected static final String PASSWORD = "BDD35";
    //protected static final String CONN_STRING = "jdbc:oracle:thin:@oracle.esigelec.fr:1521:orcl";
    protected final static String CONN_STRING   = "jdbc:oracle:thin:@//srvoracledb.intranet.int:1521/orcl.intranet.int";

    public ConnectionDAO(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found");
            e.printStackTrace();
        }
    }
}