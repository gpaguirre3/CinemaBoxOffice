/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.FileManager;
import ec.edu.espe.cinemaboxoffice.controller.RecordInformation;
import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import java.io.IOException;
import java.util.Scanner;

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

    public boolean enterUser() {
        
        PasswordEncryptor c = new PasswordEncryptor();
        FileManager file = new FileManager("AdminAccount.csv");

        boolean correctUser = false;
        boolean correctPass = false;
        boolean correctAcc = false;
        
        Scanner scanner = new Scanner(System.in);
        boolean repeat = false;
        boolean usernameFinder = false;
        String username;
        String password;
        while (repeat == false) {
            do {
                System.out.println("Username: ");
                username = scanner.nextLine();
                usernameFinder = file.findUsername(username);

                if (usernameFinder == true) {
                    System.out.println("Correct username!");
                    usernameFinder = false;
                    correctUser = true;
                } else {
                    System.out.println("Incorrect or not registered account");
                    usernameFinder = true;
                }
            } while (usernameFinder != false);

            boolean findPass = false;
            boolean foundPass = false;
            do {
                System.out.println("Password: ");
                password = scanner.nextLine();
                String compareInFile = c.comparePassword(password);
                foundPass = file.findPassword(compareInFile);
                try {
                    if (foundPass == true) {
                        System.out.println("Correct Password");
                        findPass = true;
                        correctPass = true;
                    } else {
                        System.out.println("Incorrect Password");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            } while (findPass == false);

            repeat = true;
        }
        if((correctUser==true) & (correctPass==true)){
            correctAcc = true;
        }
        return correctAcc;
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
}
