/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class File {

    private Movie movie;

    public void writeInFile() throws IOException {

        try {
            java.io.File file = new java.io.File("ListMovies.csv");
            FileWriter fWriter;
            BufferedWriter bWriter;
            if (file.exists()) {
                fWriter = new FileWriter(file, true);
                bWriter = new BufferedWriter(fWriter);
                bWriter.newLine();
                bWriter.write(movie.getTitle() + "," + movie.getDuration() + "," + movie.getGender() + "," + movie.getPriceMovie());
            } else {
                fWriter = new FileWriter(file);
                bWriter = new BufferedWriter(fWriter);
                bWriter.write(movie.getTitle() + "," + movie.getDuration() + "," + movie.getGender() + "," + movie.getPriceMovie());
            }
            bWriter.close();
            fWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
