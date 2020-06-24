/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.FoodCombo;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Promotion;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class InformationRecord {

    private Movie movie;
    private Promotion promotion;

    Keyboard in = new Keyboard();

    public void createMovie() throws IOException {

        boolean repeat = false;

        String movieTitle;
        String movieDuration;
        String movieGender;
        String moviePrice;
        String answer;
        FileManager file = new FileManager("MovieList.txt");
        do {
            movieTitle = in.getString("Enter the movie title");
            movieDuration = in.getString("Enter the movie duration (hour.mins.secs)");
            movieGender = in.getString("Enter the movie gender: ");
            moviePrice = in.getString("Enter the price of the movie ticket: ");
            movie = new Movie(movieTitle, movieDuration, movieGender, moviePrice);
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
        FoodCombo foodCombo = new FoodCombo(0,"", "", "", 0);
        boolean repeat = false;
        String name;
        String day;
        int price;
        String answer;
        do {
            name = "Combo" + Integer.toString(foodCombo.menuCombo());
            day = in.getString("Enter the day promotion: ");
            price = in.getInt("Enter the price promotion: ", 2);
            answer = in.getStringAnswer("Add more movies[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }
        } while (repeat == false);
        promotion = new Promotion(name, day, price);
        file.writeFile(promotion.toString());
    }

    public void deletePromotion(String fileName) {
        FileManager file = new FileManager(fileName);
        file.deleteFile();
    }
}
