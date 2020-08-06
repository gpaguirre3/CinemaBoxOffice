/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class Admin extends Person {

    private String userName;
    private String password;
    

    public Admin(String id, String name, String userName, String keyUser) {
        super(id, name);
        this.userName = userName;
        this.password = keyUser;
    }

    @Override
    public String toString() {
        String admin = userName + "," + password + "," + name + "," + getId();

        return admin;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
