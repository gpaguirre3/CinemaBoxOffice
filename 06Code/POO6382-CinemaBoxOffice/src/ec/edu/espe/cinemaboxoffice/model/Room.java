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
public class Room {

    private int numberRoom;
    private int numberSeats;
    private String formatRoom;
    private float priceTypeRoom;

    public Room(int numberRoom, int numberSeats, String formatRoom, float priceTypeRoom) {

        this.numberRoom = numberRoom;
        this.numberSeats = numberSeats;
        this.formatRoom = formatRoom;
        this.priceTypeRoom = priceTypeRoom;

    }

    public void showDataRoom() {
        System.out.println(toString());
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getFormatRoom() {
        return formatRoom;
    }

    public void setFormatRoom(String formatRoom) {

        this.formatRoom = formatRoom;
    }

    public float getPriceTypeRoom() {
        return priceTypeRoom;
    }

    public void setPriceTypeRoom(float priceTypeRoom) {
        this.priceTypeRoom = priceTypeRoom;
    }

    @Override
    public String toString() {
        return "Room{" + "numberRoom=" + numberRoom + ", numberSeats=" + numberSeats + ", formatRoom=" + formatRoom + ", priceTypeRoom=" + priceTypeRoom + '}';
    }

}
