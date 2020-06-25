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
    
    public static void calculatePriceTicket(String ticketData){
        String line = null;
        String foundLine[];
        int a = 0;
        FileManager file = new FileManager("MovieList.csv");
        foundLine = file.findRecord(ticketData);
        System.out.println(foundLine);
        while (a == 3) {
                String[] searchWord = line.split(",");
                System.out.println(searchWord[3]); 
                a++;                
            }
    }
    
    public void calculatePricePromotion(){
        
    }
}
