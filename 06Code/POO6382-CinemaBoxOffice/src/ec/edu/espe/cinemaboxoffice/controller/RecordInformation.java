/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.FoodCombo;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Promotion;
import ec.edu.espe.cinemaboxoffice.model.Room;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class RecordInformation {

    private Movie movie;
    private Promotion promotion;

    Keyboard in = new Keyboard();

    public void createMovie() throws IOException {

        boolean repeat = false;
        String answer;
        String movieTitle;
        String movieGender;
        int roomNumberForMovie;
        String roomFormatForMovie;
        float moviePrice = 3.0f;
        FileManager file = new FileManager("MovieList.txt");
        do {
            Room room = new Room();
            movieTitle = in.getString("Enter the movie title");
            movieGender = in.getString("Enter the movie gender: ");
            room.showDataRoom();
            roomNumberForMovie = in.getInt("Enter the movie room: )", 1);
            roomFormatForMovie = in.getString("Enter the movie format: ");
            if ("2D".equals(roomFormatForMovie)){
                moviePrice = moviePrice + 3.50f;
            }
            if ("3D".equals(roomFormatForMovie)){
                moviePrice = moviePrice + 5.0f;
            }
            movie = new Movie(movieTitle, movieGender, roomNumberForMovie, roomFormatForMovie, moviePrice);
            System.out.println(file.writeFile(movie.toString()));
            answer = in.getStringAnswer("Add more movies[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }

        } while (repeat == false);
        
    }
    
    public void deleteMovie(String fileName) {
        FileManager file = new FileManager(fileName);
        file.deleteFile();
    }

    public void createPromotion() throws IOException {
        FileManager file = new FileManager("PromotionsList.txt");
        FoodCombo foodCombo = new FoodCombo(0, "", "", "", 0);
        boolean repeat = false;
        String name;
        String day;
        String answer;
        do {
            name = "Combo" + Integer.toString(foodCombo.menuCombo());
            day = in.getString("Enter the day promotion: ");
            answer = in.getStringAnswer("Add more movies[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }
        } while (repeat == false);
        promotion = new Promotion(name, day);
        file.writeFile(promotion.toString());
    }

    public void deletePromotion(String fileName) {
        FileManager file = new FileManager(fileName);
        file.deleteFile();
    }
}
