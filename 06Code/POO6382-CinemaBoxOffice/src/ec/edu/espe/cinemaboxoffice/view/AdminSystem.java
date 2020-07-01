/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.BillboardManager;
import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class AdminSystem {

    

    public void manager() throws IOException {
        BillboardManager billboard = new BillboardManager();
        boolean permission = false;
        while (permission == false) {
            permission = billboard.enterUser();
            if (permission == true) {
                adminMenu();
            }
        }
    }

    public void adminMenu() throws IOException {
        BillboardManager billboard = new BillboardManager();
        DataValidation in = new DataValidation();
        int option;
        boolean repeat = false;
        while (repeat == false) {
            System.out.println(" 1: Organize movie list \n 2: Organize promotions \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    billboard.organizeMovieList();
                    break;
                case 2:
                    billboard.organizePromotions();
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
