package model.dao;
import model.bean.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TiNa on 27/04/2017.
 */
public class DBConnection {
    String hostName = "localhost";
    String dbName = "laptrinhmang";
    String userName = "root";
    String password = "";
    public Connection getMySQLConnection() throws SQLException,ClassNotFoundException {
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }

    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {

        System.out.println("Get connection ... ");

        DBConnection db = new DBConnection();
        db.getMySQLConnection();
        System.out.println("Done!");
    }
}
