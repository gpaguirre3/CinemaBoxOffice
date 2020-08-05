/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.cinemaboxoffice.model.CinemaRoom;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.MovieBillboard;
import ec.edu.espe.cinemaboxoffice.model.NextPremier;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieRecord {

    InputDataValidation in = new InputDataValidation();

    public void manageCinema() throws IOException {
        int option;
        do {
            System.out.println(" 1: recordMovieBillboard \n 2: deleteMovieBillboard");
            System.out.println(" 3: recordNextPremiere \n 4: deleteNextPremiere");
            System.out.println(" 5: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    recordMovie("Billboard.json", recordBillboard());
                    break;
                case 2:
                    deleteMovie("Billboard.json");
                    break;
                case 3:
                    recordMovie("NextPremier.json", recordNextPremier());
                    break;
                case 4:
                    deleteMovie("NextPremier.json");
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (option != 5);
    }

    public boolean recordMovie(String fileName, Movie movie) throws IOException {
        System.out.println(movie);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Movie> movies = new ArrayList<>();
        FileManager.createFile(fileName);
        String moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            movies = gson.fromJson(moviesJson, ArrayList.class);
        }
        movies.add(movie);
        FileManager.deleteFile(fileName);
        FileManager.writeFile(fileName, gson.toJson(movies));
        return true;
    }

    public MovieBillboard recordBillboard() {
        String title = in.getString("Enter the title movie: ");
        String gender = in.getString("Enter the gender movie: ");
        String age = in.getString("Enter the age restricction: " );
        int duration = in.getInt("Enter the duration in minutes: ", 3);
        String namePoster = in.getString("Enter the name of the picture: ");
        float price = in.getFloat("Enter the price: ");
        int roomNumber = in.getInt("Enter the room number; ", 1);
        CinemaRoom room = new CinemaRoom(roomNumber, "Num Room", CinemaRoom.buildSeat());
        MovieBillboard movie = new MovieBillboard(title, gender, age, duration, namePoster, in.getDate(), price, room);
        return movie;
    }

    public Movie recordNextPremier() {
        String title = in.getString("Enter the title movie: ");
        String gender = in.getString("Enter the gender movie: ");
        String age = in.getString("Enter the age restricction: " );
        int duration = in.getInt("Enter the duration in minutes: ", 3);
        String namePoster = in.getString("Enter the name of the picture: ");
        String month = in.getString("Emter the month of premier: ");
        Movie nextPremier = new NextPremier(title, gender, age, duration, namePoster, month);
        return nextPremier;
    }

    public boolean deleteMovie(String fileName) throws IOException {
        String title = in.getString("Enter the name of the movie: ");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileManager.createFile(fileName);
        String moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            java.lang.reflect.Type typeMovies = new TypeToken<ArrayList<MovieBillboard>>() {
            }.getType();
            ArrayList<Movie> movies = gson.fromJson(moviesJson, typeMovies);
            delete(title, movies);
            FileManager.deleteFile(fileName);
            FileManager.writeFile(fileName, gson.toJson(delete(title, movies)));
        }
        return true;
    }

    public ArrayList<Movie> delete(String title, ArrayList<Movie> movies) {
        System.out.println("-->" + movies.size());
        System.out.println("-->" + movies.get(0));
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("-->" + movies.toString());
            if (movies.get(i).getTitle().equals(title)) {
                movies.remove(i);
            }
        }
        return movies;
    }
}
