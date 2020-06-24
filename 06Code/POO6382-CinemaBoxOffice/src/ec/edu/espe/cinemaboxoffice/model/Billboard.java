/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.FileManager;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.cinemaboxoffice.utils.Screen;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Billboard {

    private Room room;
    private Admin admin;

    Keyboard in = new Keyboard();
    Screen cls = new Screen();
    FileManager fileManager;
    Seat seat;

    public void billboardMenu() throws IOException {
        boolean repeat = false;
        String selection;
        String selectionRoom;
        int election;
        do {
            System.out.println(" 1: List movies \n 2: Promotions \n 3: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    cls.cleanScreen();
                    showMoviesList();
                    selection = in.getString("choose the title movie: ");
                    chooseMovie(selection);
                    selectionRoom = in.getString("choose the room: ");
                    break;
                case 2:
                    cls.cleanScreen();
                    showPromotions();
                    election = in.getInt("choose the number of promotion[100n]: ", 4);
                    choosePromotion(election);
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
        fileManager = new FileManager("MovieList.txt");
        fileManager.readFile();
    }

    public void showPromotions() {
        fileManager = new FileManager("PromotionsList.txt");
        fileManager.readFile();
    }

    public void chooseMovie(String selection) {
        fileManager = new FileManager(selection + ".txt");
        Ticket ticket;
        fileManager.readFile();
        chooseSeat(selection);
        generateTicket(chooseSeat(selection), selection);
    }

    public void choosePromotion(int numberPromotion) {
        String selection = in.getString("choose the title movie: ");
        fileManager = new FileManager(selection + ".txt");
        Ticket ticket;
        fileManager.readFile();
        chooseSeat(selection);
        generateTicket(chooseSeat(selection), selection);
    }

    public String chooseSeat(String selection) {
        boolean repeat = false;
        String chosenSeat;
        int aux;
        do {
            chosenSeat = in.getString("choose the number of seat: ");
            aux = Integer.parseInt(chosenSeat);
            if (aux > 0 & aux < 51) {
                chosenSeat = chosenSeat + "VIP";
                seat = new Seat(selection, chosenSeat, true);
                fileManager.writeFile(seat.toString());
                repeat = true;
            }
            if (aux > 50 & aux < 101) {
                chosenSeat = chosenSeat + "STD";
                seat = new Seat(selection, chosenSeat, true);
                fileManager.writeFile(seat.toString());
                repeat = true;
            }
            if (aux > 100 | aux < 1) {
                System.out.println("incorrect number seat, please log in again");
                repeat = false;
            }
        } while (repeat = false);
        return chosenSeat;
    }

    public void generateTicket(String seat, String selection) {
        Ticket ticket = new Ticket(seat, selection, "", 0);
        ticket.showDataTicket();
    }
}
