/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.RecordInformation;
import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Admin {

    private String userName;
    private int keyUser;

    DataValidation in = new DataValidation();
    RecordInformation infoRecord = new RecordInformation();

    public Admin(String userName, int keyUser) {
        this.userName = userName = "Cinema";
        this.keyUser = keyUser = 321;
    }

    public void adminMenu() throws IOException {
        int option;
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
                    repeat = true;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        }
    }

    public void enterUser() {
        String loginName;
        int keyUser2;
        do {
            loginName = in.getString("Username: ");
            if (!loginName.equals(userName)) {
                System.out.println("Incorrect Username. Please enter again");
            }
        } while (!loginName.equals(userName));

        do {
            keyUser2 = in.getInt("Password: ", 3);
        } while (keyUser2 != keyUser);

    }

    public void organizeMovieList() throws IOException {
        FileManagerLib file = new FileManagerLib("MovieList.csv");
        boolean repeat = false;
        int option;
        String fileName;
        do {
            System.out.println(" 1: Create Movie \n 2: Delete Movie \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);

            switch (option) {
                case 1:
                    infoRecord.createMovie();
                    break;
                case 2:
                    FileManagerLib.readFile();
                    fileName = in.getString("enter the name of file for delete: ");
                    infoRecord.deleteMovie(fileName + ".csv");
                    break;
                case 3:
                    repeat = true;
                    break;
            }
        } while (repeat == false);
    }

    public void organizePromotions() throws IOException {
        FileManagerLib file = new FileManagerLib("PromotionsList.csv");
        boolean repeat = false;
        String fileName;
        int option;
        do {
            System.out.println(" 1: Save Promotion \n 2: Delete Promotion \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);

            switch (option) {
                case 1:
                    infoRecord.createPromotion();
                    break;
                case 2:
                    FileManagerLib.readFile();
                    fileName = in.getStringAnswer("you want to delete the promotion list[yes/no]: ");
                    if ("yes".equals(fileName)) {
                        infoRecord.deletePromotion("PromotionsList.csv");
                    }
                    break;
                case 3:
                    repeat = true;
                    break;
            }
        } while (repeat == false);
    }

    /**
     * @return the loginName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the loginName to set
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
}
