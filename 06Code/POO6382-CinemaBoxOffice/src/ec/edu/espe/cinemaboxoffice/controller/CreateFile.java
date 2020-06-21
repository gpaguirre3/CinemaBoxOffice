/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Promotion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class CreateFile {

    File file = new File("MovieList.txt");
    File file2 = new File("PromotionList.txt");
    FileOutputStream salida = null;
    FileInputStream entrada = null;
    ObjectOutputStream writer = null;
    ObjectInputStream reader = null;

    public void writeInFile(ArrayList<Movie> movies) {
        try {
            salida = new FileOutputStream(file);
            writer = new ObjectOutputStream(salida);
            writer.writeObject(movies);

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }

    public void printInConsole(ArrayList<Movie> movies) {
        try {
            entrada = new FileInputStream(file);
            reader = new ObjectInputStream(entrada);
            movies = (ArrayList<Movie>) reader.readObject();
            for (Movie variable : movies) {
                System.out.println(variable.toString());
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void writeInFile2(ArrayList<Promotion> promotions) {
        try {
            salida = new FileOutputStream(file2);
            writer = new ObjectOutputStream(salida);
            writer.writeObject(promotions);

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }

    public void printInConsole2(ArrayList<Promotion> promotions) {
        try {
            entrada = new FileInputStream(file2);
            reader = new ObjectInputStream(entrada);
            promotions = (ArrayList<Promotion>) reader.readObject();
            for (Promotion variable : promotions) {
                System.out.println(variable.toString());
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Promotion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
