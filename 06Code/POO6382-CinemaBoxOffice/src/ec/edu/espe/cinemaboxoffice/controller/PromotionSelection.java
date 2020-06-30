/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Seat;
import ec.edu.espe.cinemaboxoffice.model.Ticket;
import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class PromotionSelection {

    public static void showPromotions() {
        DataValidation in = new DataValidation();
        FileManagerLib fileManagerLib;
        int election;
        fileManagerLib = new FileManagerLib("PromotionsList.csv");
        FileManagerLib.readFile();
        election = in.getInt("\nchoose the number of promotion[100-]: ", 4);
        choosePromotion(election);
    }

    public static void choosePromotion(int PromotionNumber) {
        DataValidation in = new DataValidation();
        FileManagerLib fileManagerLib;
        Seat seat = new Seat("", PromotionNumber, true);
        String selection = in.getString("choose the title movie: ");
        fileManagerLib = new FileManagerLib(selection + ".csv");
        FileManagerLib.readFile();
        Ticket.generateTicket(seat.chooseSeat(selection), selection);
    }
}
