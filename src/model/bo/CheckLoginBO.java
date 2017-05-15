package model.bo;

/**
 * Created by TiNa on 03/05/2017.
 */


import model.dao.CheckLoginDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CheckLoginBO {

    CheckLoginDAO checkLoginDAO = new CheckLoginDAO();

    public boolean isValidUser(String userName, String password) throws SQLException, ClassNotFoundException{
        return checkLoginDAO.isExistUser(userName, password);
    }

}
