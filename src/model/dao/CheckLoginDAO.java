package model.dao;

/**
 * Created by TiNa on 03/05/2017.
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CheckLoginDAO {

    public boolean isExistUser(String userName, String password)throws SQLException,ClassNotFoundException {
        DBConnection db = new DBConnection();
        Connection conn = db.getMySQLConnection();
        Statement statement = conn.createStatement();

        String sql = "Select * from Admin WHERE username='"+userName+"' AND password='"+password+"'";
        ResultSet rs = statement.executeQuery(sql);
        boolean result = rs.next();
        conn.close();
        return result;
    }
}
