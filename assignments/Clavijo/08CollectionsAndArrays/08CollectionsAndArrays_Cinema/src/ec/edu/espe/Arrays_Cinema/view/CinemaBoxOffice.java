/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Arrays_Cinema.view;

import java.util.ArrayList;
import ec.edu.espe.Arrays_Cinema.model.PremierMovie;
import ec.edu.espe.Arrays_Cinema.model.Seat;

/**
 *
 * @author nicol
 */
public class CinemaBoxOffice {

    public static void main(String[] args) {
        ArrayList<PremierMovie> titlePremierMovie = new ArrayList();
        PremierMovie titlePremierMovie1 = new PremierMovie("Cars", "18/06/2020");
        PremierMovie titlePremierMovie2 = new PremierMovie("Bob Esponja", "19/06/2020");
        PremierMovie titlePremierMovie3 = new PremierMovie("Maze Runner", "20/06/2020");
        PremierMovie titlePremierMovie4 = new PremierMovie("Harry Potter", "21/06/2020 \n");

        titlePremierMovie.add(titlePremierMovie1);
        titlePremierMovie.add(titlePremierMovie2);
        titlePremierMovie.add(titlePremierMovie3);
        titlePremierMovie.add(titlePremierMovie4);

        for (int i = 0; i < titlePremierMovie.size(); i++) {
            System.out.println("-->" + titlePremierMovie.get(i));
        }

        titlePremierMovie.remove(1);

        for (int i = 0; i < titlePremierMovie.size(); i++) {
            System.out.println("->" + titlePremierMovie.get(i));
        }

        ArrayList<Seat> seatType = new ArrayList();

        Seat seatType1 = new Seat("NORMAL", "$6.00");
        Seat seatType2 = new Seat("VPI", "$8.00 \n");

        seatType.add(seatType1);
        seatType.add(seatType2);

        for (int i = 0; i < seatType.size(); i++) {
            System.out.println("-->" + seatType.get(i));
        }

        seatType.remove(1);

        for (int i = 0; i < seatType.size(); i++) {
            System.out.println("->" + seatType.get(i));
        }

    }

}
