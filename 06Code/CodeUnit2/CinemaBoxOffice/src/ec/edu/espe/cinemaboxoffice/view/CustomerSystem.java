/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.model.Cinema;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class CustomerSystem {

    public void CinemaMenu() throws IOException {
        InputDataValidation in = new InputDataValidation();
        Date open = null;
        Date close = null;
        int option;
        Cinema cinema = new Cinema(open, close, null);
        System.out.println("Hour of open: " + open + "Hour Of close: " + close);
        do {
            System.out.println(" 1: Billboard \n 2: Premieres \n 3: NextPremier"
                    + "es \n 4: Promotions \n 5: Exit");
            option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    cinema.showListBillboard();
                    break;
                case 2:
                    cinema.showListMoviePremiere();
                    break;
                case 3:
                    cinema.showLisNextPremieres();
                    break;
                case 4:
                    cinema.showPromotions();
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (option != 5);
    }
}
