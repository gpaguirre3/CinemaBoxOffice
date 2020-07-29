/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.MovieBillboard;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieRecord {

    public void manageCinema() {
        InputDataValidation in = new InputDataValidation();
        int option;
        do {
            System.out.println(" 1: recordMovieBillboard \n 2: deleteMovieBillboard");
            System.out.println(" 3: recordMoviePremiere \n 4: deleteMoviePremiere");
            System.out.println(" 5: recordNextPremiere \n 6: deleteNextPremiere");
            System.out.println(" 7: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    recordMovie("Billboard.json");
                    break;
                case 2:
                    deleteMovie("Billboard.json");
                    break;
                case 3:
                    recordMovie("Premier.json");
                    break;
                case 4:
                    deleteMovie("Premier.json");
                    break;
                case 5:
                    recordMovie("NextPremier.json");
                    break;
                case 6:
                    deleteMovie("NextPremier.json");
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (option != 3);
    }

    public boolean recordMovie(String fileName) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Movie movie;
        FileManager.createFile(fileName);
        String moviesJson;
        do {
            moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println(moviesJson);
            ArrayList<Movie> movies = gson.fromJson(moviesJson, ArrayList.class);
            room.showRoomData();
            roomNumber = in.getInt("Enter the number movie room: )", 1);
            formatMovie = defineRoomFormat(roomNumber);
            movies.add(new Movie(in.getString("Enter the movie title"),
                    in.getString("Enter the movie gender: "), roomNumber,
                    defineRoomFormat(roomNumber), calculateMoviePrice(formatMovie)));
            FileManager.deleteFile("MovieList.json");
            FileManager.writeFile("MovieList.json", gson.toJson(movies));
        } while ("yes".equals(in.getYesOrNo("Record more movies?[yes/no]: ")));
        return true;
    }

    public boolean deleteMovie(String fileName) {
        
        return true;
    }
    
    public Movie recordData(){
        
        Movie movie = new MovieBillboard(title, gender, 0, sinopsis, date, 0, room);
        return null;
    }
}
