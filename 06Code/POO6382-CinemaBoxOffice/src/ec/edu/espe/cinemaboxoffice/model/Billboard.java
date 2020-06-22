/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.CreateFile;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Billboard {

    private Room room;
    private Admin admin;
    
    Keyboard in = new Keyboard();
    CreateFile createFile;
    Seat seat;

    public void billboardMenu() throws IOException {
        boolean repeat = false;
        String selection;
        do {
            System.out.println(" 1: List movies \n 2: Promotions \n 3: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    showMoviesList();
                    selection = in.getString("choose the title movie: ");
                    chooseMovieAndSeat(selection);
                    break;
                case 2:
                    showPromotions();
                    selection = in.getString("choose the promotion: ");
                    choosePromotion(selection);
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

    public void showMoviesList(){
        createFile = new CreateFile("MovieList.txt");
        createFile.readFile();
    }

    public void showPromotions(){
        createFile = new CreateFile("PromotionsList.txt");
        createFile.readFile();
    }

    public void chooseMovieAndSeat(String selection){
        createFile = new CreateFile(selection + ".txt");
        boolean repeat = false;
        Ticket ticket;
        String chosenSeat;
        createFile.readFile();
        do {
            chosenSeat = in.getString("choose the number of seat: ");
            int aux = Integer.parseInt(chosenSeat);
            if (aux > 0 & aux < 51) {
                chosenSeat = chosenSeat + "VPI";
                seat = new Seat(selection, chosenSeat, true);
                createFile.writeFile(seat.toString());
                repeat = true;
            }
            if (aux > 50 & aux < 101) {
                chosenSeat = chosenSeat + "STD";
                seat = new Seat(selection, chosenSeat, true);
                createFile.writeFile(seat.toString());
                repeat = true;
            }
            if (aux>100 | aux<1){
                System.out.println("incorrect number seat, please log in again");
                repeat = false;
            }
        } while (repeat = false);
        ticket = new Ticket(chosenSeat, selection, "", 0);
        ticket.showDataTicket();
    }

    public void showPriceRoomAndSeat() {

    }

    public void choosePromotion(String promotion) {
        chooseMovieAndSeat(promotion);
    }

    public void chooseSeat() {

    }

    public void generateTicket() {

    }
}
