/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.utils.PasswordEncryptor;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class BillboardManager {

    InputValidation in = new InputValidation();
    RecordInformation infoRecord = new RecordInformation();

    public void showBillboard() {
        FileManagerLib fileManagerLib;
        String selection;
        fileManagerLib = new FileManagerLib("MovieList.csv");
        FileManagerLib.readFile();
        File f = new File("MovieList.csv");
        if (f.length() == 0) {
            System.out.println("No movies have been registered yet");
        }
        System.out.println("");
    }

    public void organizeMovieList() throws IOException {
        FileManagerLib file = new FileManagerLib("MovieList.csv");
        boolean repeat = false;
        int option;
        String fileName;
        do {
            System.out.println(" 1: Create Movie \n 2: Delete Movie \n 3: "
                    + "See Billboard \n 4: Exit");
            option = in.getInt("Enter an option: ", 1);

            switch (option) {
                case 1:
                    infoRecord.createMovie();
                    break;
                case 2:
                    FileManagerLib.readFile();
                    fileName = in.getString("Movie to delete: ");
                    infoRecord.deleteMovie(fileName + ".csv");
                    break;
                case 3:
                    showBillboard();
                case 4:
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
                    fileName = in.getStringAnswer("Do you want to delete the "
                                                + "promotion list[yes/no]: ");
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
