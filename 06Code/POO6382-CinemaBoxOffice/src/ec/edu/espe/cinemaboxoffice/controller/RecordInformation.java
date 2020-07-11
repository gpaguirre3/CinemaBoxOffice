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
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class RecordInformation {

    private Movie movie;

    InputValidation in = new InputValidation();

    public void createMovie() throws IOException {

        boolean repeat = false;
        String answer;
        String movieTitle;
        String movieGender;
        int roomNumberForMovie;
        String roomFormatForMovie = "";
        float moviePrice = 0f;
        FileManagerLib file = new FileManagerLib("MovieList.csv");
        do {
            Room room = new Room();
            movieTitle = in.getString("Enter the movie title");
            movieGender = in.getString("Enter the movie gender: ");
            room.showRoomData();
            roomNumberForMovie = in.getInt("Enter the number movie room: )", 1);
            roomFormatForMovie = defineRoomFormat(roomNumberForMovie, roomFormatForMovie, moviePrice);
            moviePrice = calculateMoviePrice(roomFormatForMovie, moviePrice);
            movie = new Movie(movieTitle, movieGender, roomNumberForMovie, roomFormatForMovie, moviePrice);
            System.out.println(FileManagerLib.writeFile(movie.toString()));
            answer = in.getStringAnswer("Add more promotions[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }
        } while (repeat == false);
    }

    public String defineRoomFormat(int roomNumberForMovie, String roomFormatForMovie, float moviePrice) {
        boolean repeat = false;
        do {
            if (roomNumberForMovie < 7 & roomNumberForMovie > 0) {
                if (roomNumberForMovie > 0 & roomNumberForMovie < 3) {
                    roomFormatForMovie = "2D";
                } else {
                    roomFormatForMovie = "3D";
                }
                repeat = true;
            } else {
                System.out.println("The room doesn't exist");
            }
        } while (repeat == false);
        return roomFormatForMovie;
    }

    public float calculateMoviePrice(String roomFormatForMovie, float moviePrice) {
        if ("2D".equals(roomFormatForMovie)) {
            moviePrice = 6.50f;
        } else {
            moviePrice = 8.0f;
        }
        return moviePrice;
    }

    public void deleteMovie(String fileName) {
        FileManagerLib file = new FileManagerLib(fileName);
        FileManagerLib.deleteFile();
    }

    public void createPromotion() throws IOException {
        FileManagerLib file = new FileManagerLib("PromotionsList.csv");
        FoodCombo foodCombo = new FoodCombo(0, "", "", "", 0);
        boolean repeat = false;
        String name;
        String day;
        String answer;
        do {
            name = "Combo" + Integer.toString(foodCombo.menuCombo());
            day = in.getString("Enter the promotion day: ");
            answer = in.getStringAnswer("Add another combo?[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
                Promotion promotion = new Promotion(name, day, 2.50f);
                FileManagerLib.writeFile(promotion.toString());
            }
        } while (repeat == false);
    }

    public void deletePromotion(String fileName) {
        FileManagerLib file = new FileManagerLib(fileName);
        FileManagerLib.deleteFile();
    }
}
