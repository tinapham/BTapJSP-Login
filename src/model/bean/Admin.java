package model.bean;

public class Admin {
    String username;
    String password;
    String fullname;
    String roles;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String address) {
        this.roles = address;
    }

    public Admin(String username, String password,String fullname, String address) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.roles = address;

    }

    public Admin() {

    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
