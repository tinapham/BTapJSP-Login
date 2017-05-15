package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by TiNa on 09/05/2017.
 */
public class RegisterDAO {
    public boolean register(String username, String password, String fullname, String roles) throws Exception{
        DBConnection db = new DBConnection();
        Connection conn = db.getMySQLConnection();
        Statement statement = conn.createStatement();

        String sql = "Select * from Admin WHERE username = '"+username+"'";
        ResultSet rs = statement.executeQuery(sql);
        if(rs.next()) return false;
        sql = "INSERT INTO Admin VALUES('"+username+"','"+password+"','"+fullname+"','"+roles+"')";
        statement.execute(sql);
        return true;
    }
}
