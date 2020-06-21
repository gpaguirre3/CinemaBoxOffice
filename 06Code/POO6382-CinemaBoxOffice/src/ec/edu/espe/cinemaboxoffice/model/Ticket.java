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

    private static int indexCounter = 1000;
    private int key;
    private String seat;
    private String titleMovie;
    private String roomAssignment;
    private float priceTicket;

    PricePurchase pricePurchase[];

    public Ticket(String seat, String titleMovie, String roomAssignment, float priceTicket) {
        this.key = indexCounter + 1;
        this.indexCounter = this.indexCounter + 1;
        this.seat = seat;
        this.titleMovie = titleMovie;
        this.roomAssignment = roomAssignment;
        this.priceTicket = priceTicket;
    }

    public void showTicketData() {

    }
}
