package model.bo;

import model.dao.RegisterDAO;

/**
 * Created by TiNa on 09/05/2017.
 */
public class RegisterBO {

    RegisterDAO registerDAO = new RegisterDAO();
    public boolean register(String username, String password, String fullname, String roles) throws Exception{
        return registerDAO.register(username, password, fullname, roles);
    }
}
