package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.view.FrmPayment;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel Aguirre
 */
public class PaymentController {
    public void buyMovieTicket(Movie movie) {
        FrmPayment form = new FrmPayment(movie);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setVisible(true);
    }
}
