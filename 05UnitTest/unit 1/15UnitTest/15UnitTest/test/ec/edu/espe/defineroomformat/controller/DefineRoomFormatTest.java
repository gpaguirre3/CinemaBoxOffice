/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.defineroomformat.controller;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhoel Chicaiza
 */
public class DefineRoomFormatTest {
    
    

    /**
     * Test of defineRoomFormat method, of class DefineRoomFormat.
     */
    @Test
    public void testDefineRoomFormat2D() {
        DefineRoomFormat format = new DefineRoomFormat();
        int roomNumberForMovie = (int) 2D;
        String expectedResult = "2D";
        String actualResult;
        actualResult = format.defineRoomFormat(roomNumberForMovie);
        System.out.println("expected result-> " + expectedResult);
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testDefineRoomFormat3D() {
        DefineRoomFormat format = new DefineRoomFormat();
        int roomNumberForMovie3D = (int) 3D;
        String expectedResult = "3D";
        String actualResult;
        actualResult = format.defineRoomFormat3D(roomNumberForMovie3D);
        System.out.println("expected result-> " + expectedResult);
        assertEquals(expectedResult, actualResult);
    }
    
}
