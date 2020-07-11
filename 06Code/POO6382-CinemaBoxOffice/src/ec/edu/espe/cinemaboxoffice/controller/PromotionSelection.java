/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Seat;
import ec.edu.espe.cinemaboxoffice.model.Ticket;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class PromotionSelection {

    public static void showPromotions() {
        InputValidation in = new InputValidation();
        FileManager fileManager;
        int election;
        fileManager = new FileManager("PromotionsList.json");
        FileManager.readFile();
        election = in.getInt("\nChoose the number of promotion[100-]: ", 4);
        choosePromotion(election);
    }

    public static void choosePromotion(int PromotionNumber) {
        InputValidation in = new InputValidation();
        FileManager fileManager;
        Seat seat = new Seat("", PromotionNumber, true);
        String selection = in.getString("Choose the title movie: ");
        fileManager = new FileManager(selection + ".json");
        FileManager.readFile();
        Ticket.generateTicket(seat.chooseSeat(selection), selection);
    }
}
