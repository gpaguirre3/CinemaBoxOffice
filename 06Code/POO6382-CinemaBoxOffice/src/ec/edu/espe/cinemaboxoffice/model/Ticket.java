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
    private int seat;
    private String titleMovie;
    private String roomAssignment;
    private float ticketPrice;

    PurchasePrice pricePurchase;

    public Ticket(int seat, String titleMovie, String roomAssignment, float priceTicket) {
        this.key = indexCounter + 1;
        indexCounter = indexCounter + 1;
        this.seat = seat;
        this.titleMovie = titleMovie;
        this.roomAssignment = roomAssignment;
        this.ticketPrice = priceTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" + "key=" + key + ", seat=" + seat + ", titleMovie=" + titleMovie + ", roomAssignment=" + roomAssignment + ", priceTicket=" + ticketPrice + '}';
    }
    
    public static void generateTicket(int seat, String selection) {
        String numberRomm = PurchasePrice.searchTicketData("MovieList.csv", selection, 2);
        String priceOfTheTicket = PurchasePrice.searchTicketData("MovieList.csv", selection, 4);
        float priceTheTicket = Float.parseFloat(priceOfTheTicket);
        Ticket ticket = new Ticket(seat, selection, numberRomm, priceTheTicket);
        ticket.showTicketData();
        PurchasePrice.calculateTicketPrice(selection);
    }
    
    public void showTicketData(){
        System.out.println(toString());
    }

    /**
     * @return the indexCounter
     */
    public static int getIndexCounter() {
        return indexCounter;
    }

    /**
     * @param aIndexCounter the indexCounter to set
     */
    public static void setIndexCounter(int aIndexCounter) {
        indexCounter = aIndexCounter;
    }

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * @return the seat
     */
    public int getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(int seat) {
        this.seat = seat;
    }

    /**
     * @return the titleMovie
     */
    public String getTitleMovie() {
        return titleMovie;
    }

    /**
     * @param titleMovie the titleMovie to set
     */
    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    /**
     * @return the roomAssignment
     */
    public String getRoomAssignment() {
        return roomAssignment;
    }

    /**
     * @param roomAssignment the roomAssignment to set
     */
    public void setRoomAssignment(String roomAssignment) {
        this.roomAssignment = roomAssignment;
    }

    /**
     * @return the ticketPrice
     */
    public float getTicketPrice() {
        return ticketPrice;
    }

    /**
     * @param ticketPrice the ticketPrice to set
     */
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * @return the pricePurchase
     */
    public PurchasePrice getPricePurchase() {
        return pricePurchase;
    }

    /**
     * @param pricePurchase the pricePurchase to set
     */
    public void setPricePurchase(PurchasePrice pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

   
}
