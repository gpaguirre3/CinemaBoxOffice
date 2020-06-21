/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.FileManager;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Admin {

    private String userName;
    private int keyUser;
    private Billboard billboard[];

    Keyboard in = new Keyboard();
    FileManager fileManager = new FileManager();

    
    public Admin(String userName, int keyUser) {
        this.userName = userName = "Kevin";
        this.keyUser = keyUser = 1234568;
    }

    public Admin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void adminMenu() throws IOException {
        
        int option = 0;
        boolean repeat = false;
        
        while (repeat == false) {
            System.out.println(" 1: Organize movie list \n 2: Organize promotions \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    organizeMovieList();
                    break;
                case 2:
                    organizePromotions();
                    break;
                case 3:
                    exitUser();
                    repeat = true;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        }
    }

    public void enterUser() {
        String userName2;
        int keyUser2;
        
        do {
            userName2 = in.getString("Username: ");

        } while (!userName2.equals(userName));

        
        do {
            keyUser2 = in.getInt("Password: ", 7);
        } while (keyUser2 != keyUser);
        
    }

    public void organizeMovieList() throws IOException {
        
        boolean repeat = false;
        int option;
        do {   
            System.out.println(" 1: Create Movie \n 2: Delete Movie \n 3: Exit");
            option = in.getInt("enter the option: ", 1);
            
            switch (option) {
                case 1:
                    fileManager.createMovie();
                    break;
                case 2:
                    fileManager.deleteMovie();
                    break;
                case 3: 
                    repeat = true;
            }
        } while (repeat == false);
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
