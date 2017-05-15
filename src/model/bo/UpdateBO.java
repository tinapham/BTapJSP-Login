package model.bo;

import model.dao.UpdateDAO;

/**
 * Created by TiNa on 13/05/2017.
 */
public class UpdateBO {

    UpdateDAO updateDAO = new UpdateDAO();

    public boolean updateUser(String username,String fullname, String roles) throws Exception{
        return updateDAO.updateUser(username, fullname, roles);
    }

    public boolean deleteUser(String username) throws Exception{
        return updateDAO.deleteUser(username);
    }
}
