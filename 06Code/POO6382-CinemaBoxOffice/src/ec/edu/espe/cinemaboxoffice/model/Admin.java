/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.FileManager;
import ec.edu.espe.cinemaboxoffice.controller.InformationRecord;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.cinemaboxoffice.utils.Screen;
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
    Screen cls = new Screen();
    InformationRecord fileManager = new InformationRecord();

    
    public Admin(String userName, int keyUser) {
        this.userName = userName = "Kevin";
        this.keyUser = keyUser = 123;
    }

    public Admin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void adminMenu() throws IOException {
        
        int option;
        boolean repeat = false;
        
        while (repeat == false) {
            System.out.println(" 1: Organize movie list \n 2: Organize promotions \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    cls.cleanScreen();
                    organizeMovieList();
                    break;
                case 2:
                    cls.cleanScreen();
                    organizePromotions();
                    break;
                case 3:
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
            keyUser2 = in.getInt("Password: ", 3);
        } while (keyUser2 != keyUser);
        
    }

    public void organizeMovieList() throws IOException {
        boolean repeat = false;
        int option;
        do {   
            System.out.println(" 1: Create Movie \n 2: Delete Movie \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            
            switch (option) {
                case 1:
                    fileManager.createMovie();
                    break;
                case 2:
                    FileManager file = new FileManager("MovieList.txt");
                    file.readFile();
                    String fileName = in.getString("enter the name of file for delete: ");
                    fileManager.deleteMovie(fileName + ".txt");
                    break;
                case 3: 
                    repeat = true;
            }
        } while (repeat == false);
    }

    public void organizePromotions() throws IOException{
        boolean repeat = false;
        int option;
        do {   
            System.out.println(" 1: Save Promotion \n 2: Delete Promotion \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            
            switch (option) {
                case 1:
                    fileManager.createPromotion();
                    break;
                case 2:
                    FileManager file = new FileManager("PromotionsList.txt");
                    file.readFile();
                    String fileName = in.getString("enter the name of file for delete: ");
                    fileManager.deletePromotion(fileName + ".txt");
                    break;
                case 3: 
                    repeat = true;
            }
        } while (repeat == false);
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
