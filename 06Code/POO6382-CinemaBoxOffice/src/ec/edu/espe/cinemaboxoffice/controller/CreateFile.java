/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class CreateFile {
 
    public void writeInFile(Movie movie) {
        //Create a file//
        try {
            File file = new File("Movie List.txt");
            FileWriter fwriter;
            BufferedWriter bwriter;
            
            if(file.exists()){
                fwriter = new FileWriter(file, true);
                bwriter = new BufferedWriter(fwriter);
                bwriter.newLine();
                bwriter.write(movie.getTitle()+","+movie.getDuration()+","+movie.getPriceMovie()
                                        +","+movie.getGender()+".");
                
            }else{
                fwriter = new FileWriter(file, true);
                bwriter = new BufferedWriter(fwriter);
                bwriter.write(movie.getTitle()+","+movie.getDuration()+","+movie.getPriceMovie()
                                        +","+movie.getGender()+".");                
            }
            bwriter.close();
            fwriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void printInConsole(){
        //Read a File//
        try {
            File file = new File("Movie List.txt");
            if(file.exists()){
                FileReader freader = new FileReader(file);
                BufferedReader breader = new BufferedReader(freader);
                //Separate data in positions//
                String line;
                while((line = breader.readLine()) != null){
                    String [] contact = line.split(","); //position after each data entry//
                    Movie showMovie = new Movie(contact[0], contact[1], contact[2], contact[3]);
                    showMovie.showDataMovie();
                    System.out.println("************************");//Separate Movie
                }
            }else{
                System.out.println("Non-existent Ticket");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
