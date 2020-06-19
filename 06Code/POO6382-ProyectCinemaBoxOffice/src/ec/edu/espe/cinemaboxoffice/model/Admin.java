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

    private Billboard billboard[];

    Keyboard in = new Keyboard();

    public Admin(String userName, int keyUser) {
        this.userName = userName = "Kevin0936";
        this.keyUser = keyUser = 1234568;
    }

    public void menu() {
        int option = 0;
        boolean repeat = false;
        while (repeat == false) {
            System.out.println(" 1: Enter \n 2: Organize movie list \n 3: organize promotions \n 4: exit");
            option = in.getInt("enter the option: ", 1);
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
                    repeat = true;
                    break;
                default:
                    System.out.println("incorrect option");
                    break;
            }
        }
    }

    public void enterUser() {
        String userName2;
        int keyUser2;
        do {
            userName2 = in.getString("Ingrese el Nombre de Usuario: ");

        } while (!userName2.equals(userName));

        do {
            keyUser2 = in.getInt("Ingrese la clave: ", 7);
        } while (keyUser2 != keyUser);
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
