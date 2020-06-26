/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
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

    DataValidation in = new DataValidation();
    FileManagerLib fileManagerLib;
    Seat seat;
    Ticket ticket;

    public void billboardMenu() throws IOException {
        boolean repeat = false;
        int election;
        do {
            System.out.println("1: See Billboard \n 2: Promotions \n 3: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    showBillboard();
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

    public void showBillboard() {
        String selection;
        fileManagerLib = new FileManagerLib("MovieList.csv");
        FileManagerLib.readFile();
        File f = new File("MovieList.csv");
        if (f.length() == 0) {
            System.out.println("No movies have been registered yet");
        } else {
            selection = in.getString("What movie do you want to watch?: ");
            chooseMovie(selection);
        }
    }

    public void showPromotions() {
        int election;
        fileManagerLib = new FileManagerLib("PromotionsList.csv");
        FileManagerLib.readFile();
        election = in.getInt("choose the number of promotion[100n]: ", 4);
        choosePromotion(election);
    }

    public void chooseMovie(String selection) {
        fileManagerLib = new FileManagerLib(selection + ".csv");
        FileManagerLib.readFile();
        Ticket.generateTicket(chooseSeat(selection), selection);
    }

    public void choosePromotion(int PromotionNumber) {
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
            chosenSeat = in.getInt("Choose the number of seat[1-50]: ", 2);
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
