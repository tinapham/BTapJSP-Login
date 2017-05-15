package model.dao;

import model.bean.Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TiNa on 09/05/2017.
 */
public class SearchDAO {
    public List<Admin> searchUser(String search) throws SQLException, ClassNotFoundException{
        List<Admin> list = new ArrayList<Admin>();
        DBConnection db = new DBConnection();
        Connection conn = db.getMySQLConnection();
        Statement statement = conn.createStatement();
        String sql;
        if("".equals(search)) sql = "Select * from Admin";
        else sql = "Select * from Admin WHERE username LIKE '%"+search+"%'";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            String user = rs.getString(1);
            String pass = rs.getString(2);
            String full = rs.getString(3);
            String role = rs.getString(4);
            Admin admin = new Admin(user,pass,full,role);
            list.add(admin);
        }
        // Ðóng k?t n?i
        conn.close();
        return list;
    }
}
