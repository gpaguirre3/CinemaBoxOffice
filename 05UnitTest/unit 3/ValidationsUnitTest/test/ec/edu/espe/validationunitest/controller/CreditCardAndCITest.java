/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.validationunitest.controller;

import ec.edu.espe.validationunitest.controller.CreditCardAndCI;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel Aguirre
 */
public class CreditCardAndCITest {
    
    public CreditCardAndCITest() {
    }

    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testCheckCard1() {
        System.out.println("checkCard");
        String card = "4048598412673666";
        boolean expResult = true;
        boolean result = CreditCardAndCI.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testCheckCard2() {
        System.out.println("checkCard");
        String card = "4608003816501748";
        boolean expResult = true;
        boolean result = CreditCardAndCI.checkCard(card);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testCheckCard3() {
        System.out.println("checkCard");
        String card = "4608003816501748";
        boolean expResult = true;
        boolean result = CreditCardAndCI.checkCard(card);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testCheckCard4() {
        System.out.println("checkCard");
        String card = "4835774663674896";
        boolean expResult = true;
        boolean result = CreditCardAndCI.checkCard(card);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testCheckCard5() {
        System.out.println("checkCard");
        String card = "4528804794441477";
        boolean expResult = true;
        boolean result = CreditCardAndCI.checkCard(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateCI method, of class CreditCardAndCI.
     */
    @Test
    public void testValidateCI1() {
        System.out.println("validateCI");
        String CI = "1727620054";
        boolean expResult = true;
        boolean result = CreditCardAndCI.validateCI(CI);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testValidateCI2() {
        System.out.println("validateCI");
        String CI = "1721482998";
        boolean expResult = true;
        boolean result = CreditCardAndCI.validateCI(CI);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testValidateCI3() {
        System.out.println("validateCI");
        String CI = "1751364819";
        boolean expResult = true;
        boolean result = CreditCardAndCI.validateCI(CI);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testValidateCI4() {
        System.out.println("validateCI");
        String CI = "0952465334";
        boolean expResult = true;
        boolean result = CreditCardAndCI.validateCI(CI);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkCard method, of class CreditCardAndCI.
     */
    @Test
    public void testValidateCI5() {
        System.out.println("validateCI");
        String CI = "1708740962";
        boolean expResult = true;
        boolean result = CreditCardAndCI.validateCI(CI);
        assertEquals(expResult, result);
    }
}
