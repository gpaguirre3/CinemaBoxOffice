/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Billboard {

    private Room room;
    private Admin admin;

    Keyboard in = new Keyboard();
    FileManagerLib fileManagerLib;
    Seat seat;
    Ticket ticket;

    public void billboardMenu() throws IOException {
        boolean repeat = false;
        String selection = "";
        int election;
        do {
            System.out.println("1: Search a movie \n 2: See Billboard \n 3: Promotions \n 4: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    fileManagerLib = new FileManagerLib("MovieList.csv");
                    selection = in.getString("Search: ");
                    FileManagerLib.findRecord(selection);
                    break;
                case 2:
                    checkEmptyness(selection);
                    break;
                case 3:
                    showPromotions();
                    election = in.getInt("choose the number of promotion[100n]: ", 4);
                    choosePromotion(election);
                    break;
                case 4:
                    repeat = true;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (repeat == false);
    }

    public void checkEmptyness(String selection) {
        File f = new File("MovieList.csv");
            if (f.length() == 0) {
                System.out.println("No movies have been registered yet");
            } else {
                showMoviesList();
                selection = in.getString("What movie do you want to watch?: ");
                chooseMovie(selection);
            }
    }
    
    public void showMoviesList() {
        fileManagerLib = new FileManagerLib("MovieList.csv");
        FileManagerLib.readFile();
    }

    public void showPromotions() {
        fileManagerLib = new FileManagerLib("PromotionsList.csv");
        FileManagerLib.readFile();
    }

    public void chooseMovie(String selection) {
        fileManagerLib = new FileManagerLib(selection + ".csv");
        FileManagerLib.readFile();
        Ticket.generateTicket(chooseSeat(selection), selection);
    }

    public void choosePromotion(int numberPromotion) {
        String selection = in.getString("choose the title movie: ");
        fileManagerLib = new FileManagerLib(selection + ".csv");
        FileManagerLib.readFile();
        Ticket.generateTicket(chooseSeat(selection), selection);
    }

    public int chooseSeat(String selection) {
        boolean repeat;
        int chosenSeat;
        int aux = 0;
        do {
            chosenSeat = in.getInt("choose the number of seat: ", 2);
            if (chosenSeat > 0 & chosenSeat < 51) {
                seat = new Seat(selection, chosenSeat, true);
                FileManagerLib.writeFile(seat.toString());
                repeat = true;
            } else {
                System.out.println("incorrect seat number");
                repeat = false;
            }
        } while (repeat == false);
        return chosenSeat;
    }
}
