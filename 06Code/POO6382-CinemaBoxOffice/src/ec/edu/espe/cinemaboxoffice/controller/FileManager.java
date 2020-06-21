/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Promotion;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class FileManager {

    private Movie movie;
    private Promotion promotion;

    CreateFile create = new CreateFile();

    Keyboard in = new Keyboard();

    public void createMovie() throws IOException {

        boolean repeat = false;

        String movieTitle;
        String movieDuration;
        String movieGender;
        String moviePrice;
        String answer;

        ArrayList<Movie> movies = new ArrayList();

        do {
            movieTitle = in.getString("Enter the movie title");
            movieDuration = in.getString("Enter the movie duration (hour.mins.secs)");
            movieGender = in.getString("Enter the movie gender: ");
            moviePrice = in.getString("Enter the price of the movie ticket: ");
            movies.add(new Movie(movieTitle, movieDuration, movieGender, moviePrice));
            answer = in.getStringAnswer("Add more movies[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }

        } while (repeat == false);
        create.writeInFile(movies);
    }

    public void deleteMovie() {

    }

    public void createPromotion() throws IOException {
        boolean repeat = false;
        String key;
        String day;
        float price;
        String answer;

        ArrayList<Promotion> promotions = new ArrayList();

        do {
            key = in.getString("Enter the key promotion: ");
            day = in.getString("Enter the day promotion: ");
            price = in.getInt("Enter the price promotion: ", 1);
            promotions.add(new Promotion(key, day, price));
            answer = in.getStringAnswer("Add more movies[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }
        } while (repeat == false);
        create.writeInFile2(promotions);
    }

    public void deletePromotion() {

    }
}
