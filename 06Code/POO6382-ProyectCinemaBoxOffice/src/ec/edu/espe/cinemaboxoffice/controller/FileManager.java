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
        File file = new File();
        boolean repeat =false;
        do{
        String titleMovie = in.getString("enter the title movie");
        String durationMovie = in.getString("enter the duration movie [hour.min.seg]");
        String genderMovie = in.getString("enter the gender movie: ");
        float priceTheMovie = 1.50f;
        file.writeInFile();
        String answer = in.getStringAnswer("enter other movie[yes/no]");
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
