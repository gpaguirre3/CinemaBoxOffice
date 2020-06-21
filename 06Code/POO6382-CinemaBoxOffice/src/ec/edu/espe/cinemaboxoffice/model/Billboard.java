/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.CreateFile;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Billboard {

    private Room room;
    private Admin admin;

    ArrayList<Movie> movies = new ArrayList();
    ArrayList<Promotion> promotions = new ArrayList();
    
    CreateFile onScreen = new CreateFile();
    Keyboard in = new Keyboard();
    
    public void billboardMenu() {
        
        boolean repeat = false;
        do {
            System.out.println(" 1: List movies \n 2: Promotions \n 3: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    showMoviesList();
                    
                    break;
                case 2:
                    showPromotions();
                    break;
                case 3:
                    repeat = true;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (repeat == false);
    }
    
    public void showMoviesList() {
        onScreen.printInConsole(movies);
    }

    public void showPromotions() {
        onScreen.printInConsole2(promotions);
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
