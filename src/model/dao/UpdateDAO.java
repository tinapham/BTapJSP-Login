package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by TiNa on 13/05/2017.
 */
public class UpdateDAO {
    public boolean updateUser(String username,String fullname, String roles) throws Exception{
        DBConnection db = new DBConnection();
        Connection conn = db.getMySQLConnection();
        Statement statement = conn.createStatement();
        String sql = "UPDATE Admin SET fullname ='"+fullname+"', roles ='"+roles+"' WHERE username = '"+username+"'";
        System.out.print(sql);
        return statement.execute(sql);
    }
    public boolean deleteUser(String username) throws Exception{
        DBConnection db = new DBConnection();
        Connection conn = db.getMySQLConnection();
        Statement statement = conn.createStatement();
        String sql = "DELETE FROM Admin WHERE username = '"+username+"'";
        System.out.print(sql);
        return statement.execute(sql);
    }
}
