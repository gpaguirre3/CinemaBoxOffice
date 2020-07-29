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
public class Admin extends Person{

    private String userName;
    private String keyUser;

    public Admin(int id, String name, String userName, String keyUser) {
        super(id, name);
        this.userName = userName;
        this.keyUser = keyUser;
    }
}
