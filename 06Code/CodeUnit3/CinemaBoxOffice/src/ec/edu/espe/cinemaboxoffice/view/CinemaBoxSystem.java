/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class CinemaBoxSystem {
    public static void main(String[] args) throws IOException {
        FrmCinemaBox frmCinema = new FrmCinemaBox();
        frmCinema.showBillboard(new Date().getDay());
        frmCinema.showDataNextPremier();
        frmCinema.setVisible(true);
    }
}
