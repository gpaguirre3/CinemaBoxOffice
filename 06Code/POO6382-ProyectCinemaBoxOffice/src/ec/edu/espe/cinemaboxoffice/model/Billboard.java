/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Billboard {

    private Room room;
    private Admin admin;

    Movie movies[];
    Promotion promotions[];
    Keyboard in = new Keyboard();

    public void menu() {
        boolean repeat = false;
        do {
            System.out.println(" 1: List movies \n 2: Promotions \n 3: Exit");
            int option = in.getInt("enter the option: ", 1);
            switch (option) {
                case 1:
                    showListMovies();
                    break;
                case 2:
                    showPromotions();
                    break;
                case 3:
                    repeat = true;
                    break;
                default:
                    System.out.println("incorrect option");
                    break;
            }
        } while (repeat == false);
    }

    public void showListMovies() {

    }

    public void showPromotions() {

    }

    public void showPriceRoomAndSeat() {

    }

    public void choosePromotion() {

    }

    public void chooseMovie() {

    }

    public void chooseSeat() {

    }

    public void generateTicket() {

    }
}
