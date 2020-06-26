/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.FileManager;

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
        System.out.println("the price ticket is: " + searchDataTicket("MovieList.csv", ticketTitleMovie, 4));
    }
    
    public  static String searchDataTicket(String nameFile, String titleMovie, int positionData){
        String[] searchWord = null;
        int a = 0;
        FileManager file = new FileManager(nameFile, "");
        file.findRecord(titleMovie);
        file.getTest();
        while (a < positionData) {
            searchWord = file.getTest().split(",");
            a++;
        }
        return searchWord[positionData];
    }

    public void calculatePricePromotion() {

    }
}
