/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ticketsCinema.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alisson Clavijo
 */
public class CalculateMoviePriceTest {

    public CalculateMoviePriceTest() {
    }

    /**
     * Test of calculateMoviePrice method, of class CalculateMoviePrice.
     */
    @Test
    public void testCalculateMoviePrice2D() {

        String roomFormatForMovie = "2D";
        float moviePrice = 6.5F;
        CalculateMoviePrice instance = new CalculateMoviePrice();
        float expResult = 5.0F;
        float result = instance.calculateMoviePrice(roomFormatForMovie, moviePrice);
        assertEquals(expResult, result, 0.0);
        System.out.println("calculateMoviePrice2D : "+expResult);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testCalculateMoviePrice3D() {
        String roomFormatForMovie = "3D";
        float moviePrice = 8.0F;
        CalculateMoviePrice instance = new CalculateMoviePrice();
        float expResult = 9.0F;
        float result = instance.calculateMoviePrice(roomFormatForMovie, moviePrice);
        assertEquals(expResult, result, 0.0);
        System.out.println("calculateMoviePrice 3D : " + expResult);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

}
