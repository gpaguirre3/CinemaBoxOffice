/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.filemanagerlibrary.FileManagerLib;

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
    private float priceTicket;

    private PricePurchase pricePurchase;

    public Ticket(int seat, String titleMovie, String roomAssignment, float priceTicket) {
        this.key = indexCounter + 1;
        indexCounter = indexCounter + 1;
        this.seat = seat;
        this.titleMovie = titleMovie;
        this.roomAssignment = roomAssignment;
        this.priceTicket = priceTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" + "key=" + getKey() + ", seat=" + getSeat() + ", titleMovie=" + getTitleMovie() +  '}';
    }
    
    public static void generateTicket(int seat, String selection) {
        FileManagerLib file = new FileManagerLib("MovieList.csv");
        FileManagerLib.findRecord(selection);
        Ticket ticket = new Ticket(seat, selection, "", 0);
        ticket.showDataTicket();
        PricePurchase.calculatePriceTicket(selection);
    }
    
    public void showDataTicket(){
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
     * @return the priceTicket
     */
    public float getPriceTicket() {
        return priceTicket;
    }

    /**
     * @param priceTicket the priceTicket to set
     */
    public void setPriceTicket(float priceTicket) {
        this.priceTicket = priceTicket;
    }

    /**
     * @return the pricePurchase
     */
    public PricePurchase getPricePurchase() {
        return pricePurchase;
    }

    /**
     * @param pricePurchase the pricePurchase to set
     */
    public void setPricePurchase(PricePurchase pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

   
}
