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

    private int roomNumber;
    private int seatNumber;
    private String roomFormat;
    private float roomTypePrice;

    public Room(int numberRoom, int numberSeats, String formatRoom, float priceTypeRoom) {

        this.roomNumber = numberRoom;
        this.seatNumber = numberSeats;
        this.roomFormat = formatRoom;
        this.roomTypePrice = priceTypeRoom;

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
        return "\nnumberRoom=" + roomNumber + ", numberSeats=" + seatNumber + ", formatRoom=" + roomFormat + ", priceTypeRoom=" + roomTypePrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getRoomFormat() {
        return roomFormat;
    }

    public void setRoomFormat(String roomFormat) {

        this.roomFormat = roomFormat;
    }

    public float getRoomTypePrice() {
        return roomTypePrice;
    }

    public void setRoomTypePrice(float roomTypePrice) {
        this.roomTypePrice = roomTypePrice;
    }
}
