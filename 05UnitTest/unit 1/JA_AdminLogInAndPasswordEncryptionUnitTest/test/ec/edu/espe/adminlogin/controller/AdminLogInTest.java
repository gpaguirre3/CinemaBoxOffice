/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.adminlogin.controller;

import ec.edu.espe.adminlogin.controller.AdminLogIn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue
 */
public class AdminLogInTest {

    public AdminLogInTest() {
    }

    /**
     * Test of verifyAccount method, of class AdminLogIn.
     */
    @Test
    public void testVerifyCorrectAccount() {
        AdminLogIn login = new AdminLogIn();
        String username = "Cinema";
        String password = "cinema";
        boolean expectedResult = true;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount() {
        AdminLogIn login = new AdminLogIn();
        String username = "Josue";
        String password = "Aleman";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount2() {
        AdminLogIn login = new AdminLogIn();
        String username = "brothers";
        String password = "sisters";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount3() {
        AdminLogIn login = new AdminLogIn();
        String username = "humanboundary";
        String password = "war";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount4() {
        AdminLogIn login = new AdminLogIn();
        String username = "12412";
        String password = "123901";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount5() {
        AdminLogIn login = new AdminLogIn();
        String username = "boss";
        String password = "beta";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount6() {
        AdminLogIn login = new AdminLogIn();
        String username = "african";
        String password = "continent";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount7() {
        AdminLogIn login = new AdminLogIn();
        String username = "need";
        String password = "rath";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount8() {
        AdminLogIn login = new AdminLogIn();
        String username = "sex";
        String password = "passion";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectAccount9() {
        AdminLogIn login = new AdminLogIn();
        String username = "cinema";
        String password = "Cinema";
        boolean expectedResult = false;
        boolean actualResult = false;
        actualResult = login.verifyAccount(username, password);
        assertEquals(expectedResult, actualResult);
    }

}
