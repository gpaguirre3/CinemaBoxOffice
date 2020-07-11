/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.FoodCombo;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Promotion;
import ec.edu.espe.cinemaboxoffice.model.Room;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class RecordInformation {

    InputValidation in = new InputValidation();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void createMovie() throws IOException {

        boolean repeat = false;
        String answer;
        String movieTitle;
        String movieGender;
        int roomNumberForMovie;
        String roomFormatForMovie = "";
        float moviePrice = 0f;
        FileManager file = new FileManager("MovieList.json");
        do {
            ArrayList<Movie> movie = new ArrayList<>();
            Room room = new Room();
            movieTitle = in.getString("Enter the movie title");
            movieGender = in.getString("Enter the movie gender: ");
            room.showRoomData();
            roomNumberForMovie = in.getInt("Enter the number movie room: )", 1);
            roomFormatForMovie = defineRoomFormat(roomNumberForMovie, roomFormatForMovie, moviePrice);
            moviePrice = calculateMoviePrice(roomFormatForMovie, moviePrice);
            movie.add(new Movie(movieTitle, movieGender, roomNumberForMovie, roomFormatForMovie, moviePrice));
            String JsonString = "";
            JsonString = gson.toJson(movie);
            FileManager.writeFile(JsonString);
            answer = in.getStringAnswer("Record more movies?[yes/no]: ");
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
        FileManager file = new FileManager(fileName);
        FileManager.deleteFile();
    }

    public void createPromotion() throws IOException {
        FileManager file = new FileManager("PromotionsList.json");
        FoodCombo foodCombo = new FoodCombo(0, "", "", "", 0);
        boolean repeat = false;
        String name;
        String day;
        String answer;
        do {
            ArrayList<Promotion> promo = new ArrayList<>();
            name = "Combo" + Integer.toString(foodCombo.menuCombo());
            day = in.getString("Enter the promotion day: ");
            promo.add(new Promotion(name, day, 2.50f));
            String JsonString = "";
            JsonString = gson.toJson(promo);
            FileManager.writeFile(JsonString);
            answer = in.getStringAnswer("Add another combo?[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }
        } while (repeat == false);
    }

    public void deletePromotion(String fileName) {
        FileManager file = new FileManager(fileName);
        FileManager.deleteFile();
    }
}
