/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ticketsCinema.utils;

import java.util.ArrayList;

/**
 *
 * @author Alisson Clavijo
 */
public class CalculateMoviePrice {

        public float calculateMoviePrice(String roomFormatForMovie, float moviePrice) {
            if ("2D".equals(roomFormatForMovie)) {
                moviePrice= 6.50f;
            } else {
                moviePrice = 8.0f;
            }
            return moviePrice;
        }
        
}
