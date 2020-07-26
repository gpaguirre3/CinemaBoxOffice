/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.farmsystem.utils.InputDataValidation;
import java.io.IOException;

/**
 *
 * @author Josue
 */
public class CustomerSystem {

    InputDataValidation in = new InputDataValidation();

    public void seeBillboard() throws IOException {

        boolean repeat = false;
        int election;
        do {
            System.out.println(" 1: See Billboard \n 2: Promotions \n 3: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    System.out.println("\nWatching billboard\n");
                    break;
                case 2:
                    System.out.println("\nWatching promotions\n");
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
