package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.HomeController;
import java.awt.EventQueue;
import java.net.URL;

/**
 *
 * @author Gabriel Aguirre
 */
public class Application {
    public static void main(String[] args) {
        URL url = ClassLoader.getSystemResource("/icons/hand_credit.png");
        
        EventQueue.invokeLater(() -> {
            new HomeController().init();
        });
    }
}
