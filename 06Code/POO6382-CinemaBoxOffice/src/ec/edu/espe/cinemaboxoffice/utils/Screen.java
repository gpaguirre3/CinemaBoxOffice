/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.utils;

/**
 *
 * @author Gabriel Aguirre
 */
public class Screen {
    public static void cleanScreen(){
    try{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }catch(Exception e){
            System.out.println(e);
    }
    }
}
