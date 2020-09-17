/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.login.controller;

import ec.edu.espe.login.model.Admin;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue Aleman ESPE.
 */
public class LogInControllerTest {

    public LogInControllerTest() {
    }

    /**
     * Test of findUser method, of class LogInController.
     */
    @Test
    public void testFindUser() throws Exception {
        String username = "gpaguirre";
        String pass = "cinema1";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findUser(username, pass);
        assertEquals(expResult, result);
    }

    public void testFindUser2() throws Exception {
        String username = "jjaleman";
        String pass = "cinema2";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findUser(username, pass);
        assertEquals(expResult, result);
    }

    public void testFindUser3() throws Exception {
        String username = "jhoeld";
        String pass = "cinema3";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findUser(username, pass);
        assertEquals(expResult, result);
    }

    public void testFindUser4() throws Exception {
        String username = "kevinc";
        String pass = "cinema4";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findUser(username, pass);
        assertEquals(expResult, result);
    }

    public void testFindUser5() throws Exception {
        String username = "jajajaja";
        String pass = "xdxdxdx";
        LogInController instance = new LogInController();
        boolean expResult = false;
        boolean result = instance.findUser(username, pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of findId method, of class LogInController.
     */
    @Test
    public void testFindId() throws Exception {
        String id = "1";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findId(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindId2() throws Exception {
        String id = "2";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findId(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindId3() throws Exception {
        String id = "3";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findId(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindId4() throws Exception {
        String id = "4";
        LogInController instance = new LogInController();
        boolean expResult = true;
        boolean result = instance.findId(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindId5() throws Exception {
        String id = "91";
        LogInController instance = new LogInController();
        boolean expResult = false;
        boolean result = instance.findId(id);
        assertEquals(expResult, result);
    }
}
