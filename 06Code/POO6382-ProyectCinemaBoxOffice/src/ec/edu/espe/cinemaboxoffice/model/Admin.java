/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Admin {

    private String userName;
    private int keyUser;

    Keyboard in;

    private Billboard billboard[];

    public Admin(String userName, int keyUser) {
        this.userName = userName;
        this.keyUser = keyUser;
    }

    public void menu() {
        int option = 0;
        boolean repeat = false;
        while (repeat == false) {
            switch (option) {
                case 1:
                    enterUser();
                    break;
                case 2:
                    organizeMovieList();
                    break;
                case 3:
                    organizePromotions();
                    break;
                case 4:
                    exitUser();
                    break;
            }
        }
    }

    public void enterUser() {
        userName = in.getString("Ingrese el Nombre de Usuario: ");
        keyUser = in.getInt("Ingrese la clave: ", 7);
    }

    public void organizeMovieList() {
        
    }

    public void organizePromotions() {

    }

    public void exitUser() {
        
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the keyUser
     */
    public int getKeyUser() {
        return keyUser;
    }

    /**
     * @param keyUser the keyUser to set
     */
    public void setKeyUser(int keyUser) {
        this.keyUser = keyUser;
    }

    /**
     * @return the billboard
     */
    public Billboard[] getBillboard() {
        return billboard;
    }

    /**
     * @param billboard the billboard to set
     */
    public void setBillboard(Billboard[] billboard) {
        this.billboard = billboard;
    }
}
