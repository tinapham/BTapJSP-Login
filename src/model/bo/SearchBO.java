package model.bo;

import model.bean.Admin;
import model.dao.SearchDAO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by TiNa on 09/05/2017.
 */
public class SearchBO {
    SearchDAO searchDAO = new SearchDAO();

    public List<Admin> searchUser(String search) throws SQLException, ClassNotFoundException{
        return searchDAO.searchUser(search);
    }
}
