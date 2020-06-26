/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.util.ArrayList;

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
    
    public Room() {
    }

    public void showRoomData() {
        ArrayList<Room> rooms = new ArrayList<>();
        for (int i = 0; i<3; i++){
            rooms.add(new Room(i+1, 50, "2D", 6.50f));
        }
        for (int j = 3; j<6; j++){
            rooms.add(new Room(j+1, 50, "3D", 8.0f));
        }
        System.out.println(rooms);
    }
    
    @Override
    public String toString() {
        return "\nnumberRoom=" + numberRoom + ", numberSeats=" + numberSeats + ", formatRoom=" + formatRoom + ", priceTypeRoom=" + priceTypeRoom;
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
}
