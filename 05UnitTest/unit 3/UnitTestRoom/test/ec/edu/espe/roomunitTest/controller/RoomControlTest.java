/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.roomunitTest.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alisson Clavijo
 */
public class RoomControlTest {
    
    public RoomControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of defineRoom method, of class RoomControl.
     */
    @Test
    public void testDefineRoom1() {
        System.out.println("Room 1 - 2D");
        int numberRoom = 1;
        RoomControl instance = new RoomControl();
        String expResult = "2D";
        String result = instance.defineRoom(numberRoom);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDefineRoom2() {
        System.out.println("Room 2 - 2D");
        int numberRoom = 2;
        RoomControl instance = new RoomControl();
        String expResult = "2D";
        String result = instance.defineRoom(numberRoom);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineRoom3() {
        System.out.println("Room 3 -2D");
        int numberRoom = 3;
        RoomControl instance = new RoomControl();
        String expResult = "2D";
        String result = instance.defineRoom(numberRoom);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDefineRoom4() {
        System.out.println("Room 4 -2D");
        int numberRoom = 4;
        RoomControl instance = new RoomControl();
        String expResult = "2D";
        String result = instance.defineRoom(numberRoom);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDefineRoom5() {
        System.out.println("Room 5 -3D");
        int numberRoom = 5;
        RoomControl instance = new RoomControl();
        String expResult = "3D";
        String result = instance.defineRoom(numberRoom);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDefineRoom6() {
        System.out.println("Room 6 - 3D");
        int numberRoom = 6;
        RoomControl instance = new RoomControl();
        String expResult = "3D";
        String result = instance.defineRoom(numberRoom);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDefineRoom7() {
        System.out.println("Room 7 -3D");
        int numberRoom = 7;
        RoomControl instance = new RoomControl();
        String expResult = "3D";
        String result = instance.defineRoom(numberRoom);
        assertEquals(expResult, result);
    }
}
