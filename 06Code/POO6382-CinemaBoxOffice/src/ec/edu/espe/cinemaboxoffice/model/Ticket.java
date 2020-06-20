/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Ticket {
    private int key;
    private String seat;
    private Movie movie;
    private Room room;
    private float priceTicket;
    
    PricePurchase pricePurchase[];
    
    public void showTicketData(){
        
    }
}
