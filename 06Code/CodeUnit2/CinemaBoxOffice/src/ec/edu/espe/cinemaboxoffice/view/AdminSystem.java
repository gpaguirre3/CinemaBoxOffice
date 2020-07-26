/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.AdminLogIn;
import ec.edu.espe.farmsystem.utils.InputDataValidation;
import java.io.IOException;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class AdminSystem {

    public void verifyAccount() throws IOException {
        AdminLogIn logIn = new AdminLogIn();
        boolean permission = false;
        while (permission == false) {
            permission = logIn.verifyAccount();
            if (permission == true) {
                adminMenu();
            }
        }
    }

    public void adminMenu() throws IOException {

        InputDataValidation in = new InputDataValidation();
        int option;
        boolean repeat = false;
        while (repeat == false) {
            System.out.println(" 1: Organize movie list \n 2: Organize promotions \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    System.out.println("\nOrganizing movie list\n");
                    //billboard.organizeMovieList();
                    break;
                case 2:
                    System.out.println("\nOrganizing promotions\n");
                    //billboard.organizePromotions();
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

}
