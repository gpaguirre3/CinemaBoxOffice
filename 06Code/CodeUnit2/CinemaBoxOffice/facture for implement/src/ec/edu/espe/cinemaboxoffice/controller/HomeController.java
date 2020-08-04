package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.service.MovieService;
import ec.edu.espe.cinemaboxoffice.view.FrmHome;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


/**
 *
 * @author Gabriel Aguirre
 */
public class HomeController {
    public void init() {
        List<Movie> movies = MovieService.getAllMovies();
        FrmHome home = new FrmHome(movies);
        
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
    }
}
