/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.MovieSelection;
import ec.edu.espe.cinemaboxoffice.controller.PromotionSelection;
import ec.edu.espe.cinemaboxoffice.model.Customer;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class CustomerSystem {

    InputValidation in = new InputValidation();

    public void seeBillboard() throws IOException {
        Customer customer = new Customer();
        boolean repeat = false;
        int election;
        do {
            System.out.println(" 1: See Billboard \n 2: Promotions \n 3: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    MovieSelection.showMovieList();
                    break;
                case 2:
                    PromotionSelection.showPromotions();
                    break;
                case 3:
                    repeat = true;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (repeat == false);
    }
}
