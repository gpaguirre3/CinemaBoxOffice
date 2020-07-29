/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Promotion;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class PromotionRecord {

    public void managePromotion() {
        InputDataValidation in = new InputDataValidation();
        int option;
        do {
            System.out.println(" 1: Record Promotion \n 2: Delete promotion \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    recordPromotion(null);
                    break;
                case 2:
                    deletePromotion(null);
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (option != 3);
    }

    public boolean recordPromotion(Promotion promotion) {

        return true;
    }

    public boolean deletePromotion(Promotion promotion) {
        return true;
    }
}
