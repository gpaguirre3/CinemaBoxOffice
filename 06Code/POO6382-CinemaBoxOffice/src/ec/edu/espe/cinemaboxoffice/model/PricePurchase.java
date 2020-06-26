/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Temp

import ec.edu.espe.cinemaboxoffice.controller.FileManager;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCOlates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.FileManager;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class PricePurchase {

    private float pricePurchase;
    private int numberTickets;
    private String typePromotion;

    Bill bills;

    public static void calculatePriceTicket(String ticketTitleMovie) {
        Keyboard in = new Keyboard();
        float moviePriceTicket = Float.parseFloat(searchDataTicket("MovieList.csv", ticketTitleMovie, 4));
        
        String purchaseAnswer;
        purchaseAnswer = in.getString("Would you like to purchase the movie ticket?[yes/no]");
        if (purchaseAnswer.equals("yes")) {
            Bill bills = new Bill(null, 0, 0);
            bills.showBillData(moviePriceTicket);
        }
    }

    public static String searchDataTicket(String nameFile, String titleMovie, int positionData) {
        String[] searchWord  = null;
        int a = 0;
        FileManager file = new FileManager(nameFile, "");
        file.findRecord(titleMovie);
        file.getDataSeekerLine();
        while (a < positionData) {
            searchWord = file.getDataSeekerLine().split(",");
            a++;
        }
        return searchWord[positionData];
    }

    public void calculatePricePromotion() {

    }
}
