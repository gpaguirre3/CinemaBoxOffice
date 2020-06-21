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

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class FileManager {
    
    private Movie movie;
    private Promotion promotion;
    
    Keyboard in = new Keyboard();
    
    public void createMovie() throws IOException{
        
        CreateFile create = new CreateFile();
        
        boolean repeat =false;
        
        String movieTitle;
        String movieDuration;
        String movieGender;
        String moviePrice;
        String answer;
        
        
        
        do{
            movieTitle = in.getString("Enter the movie title");
            movieDuration = in.getString("Enter the movie duration (hour.mins.secs)");
            movieGender = in.getString("Enter the movie gender: ");
            moviePrice = in.getString("Enter the price of the movie ticket: ");
            
            Movie movie = new Movie(movieTitle, movieDuration, movieGender, moviePrice);
            create.writeInFile(movie);
            
            answer = in.getStringAnswer("Add more movies[yes/no]");
            if("no".equals(answer)){
                repeat = true;
            } 
            
        } while (repeat == false);
    }
    
    public void deleteMovie(){
       
    }
    
    public void createPromotion(){
        
    }
    
    public void deletePromotion(){
        
    }
}
