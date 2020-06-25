/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.cinemaboxoffice.utils.Screen;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
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
    FileManagerLib fileManagerLib;
    Seat seat;
    Ticket ticket;

    public void billboardMenu() throws IOException {
        boolean repeat = false;
        String selection;
        int election;
        do {
            System.out.println("1: Search movie \n 2: List movies \n 3: Promotions \n 4: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    fileManagerLib = new FileManagerLib("MovieList.txt");
                    selection = in.getString("Search: ");
                    FileManagerLib.findRecord(selection);
                    break;
                case 2:
                    Screen.cleanScreen();
                    showMoviesList();
                    selection = in.getString("choose the title movie: ");
                    chooseMovie(selection);
                    
                    break;
                case 3:
                    Screen.cleanScreen();
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

    public void showMoviesList() {
        fileManagerLib = new FileManagerLib("MovieList.txt");
        FileManagerLib.readFile();
    }

    public void showPromotions() {
        fileManagerLib = new FileManagerLib("PromotionsList.txt");
        FileManagerLib.readFile();
    }

    public void chooseMovie(String selection) {
        fileManagerLib = new FileManagerLib(selection + ".txt");
        FileManagerLib.readFile();
        ticket.generateTicket(chooseSeat(selection), selection);
    }

    public void choosePromotion(int numberPromotion) {
        String selection = in.getString("choose the title movie: ");
        fileManagerLib = new FileManagerLib(selection + ".txt");
        FileManagerLib.readFile();
        ticket.generateTicket(chooseSeat(selection), selection);
    }

    public String chooseSeat(String selection) {
        boolean repeat;
        String chosenSeat;
        int aux;
        do {
            chosenSeat = in.getString("choose the number of seat: ");
            aux = Integer.parseInt(chosenSeat);
            if (aux > 0 & aux < 101) {
                System.out.println(aux);
                seat = new Seat(selection, chosenSeat, true);
                FileManagerLib.writeFile(seat.toString());
                repeat = true;
                
            }
           else {
                System.out.println(aux);
                System.out.println("incorrect number seat, please log in again");
                repeat = false;
            }
            System.out.println(repeat);
        } while (repeat == false);
        return chosenSeat;
    }
}
