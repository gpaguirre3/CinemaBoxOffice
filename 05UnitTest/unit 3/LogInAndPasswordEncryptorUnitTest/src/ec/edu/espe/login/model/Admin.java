/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.login.model;

/**
 *
 * @author Josue Aleman ESPE.
 */
public class Admin {

    private String userName;
    private String password;
    private String id;
    private String name;

    public Admin(String name, String userName, String keyUser, String id) {

        this.userName = userName;
        this.password = keyUser;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String admin = userName + "," + password;

        return admin;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
