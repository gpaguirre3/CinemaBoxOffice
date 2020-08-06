/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.unittest.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel Aguirre
 */
public class CardAndCIValidationTest {
    
    public CardAndCIValidationTest() {
    }

    /**
     * Test of checkCard method, of class CardAndCIValidation.
     */
    @Test
    public void testCheckCard01() {
        System.out.println("checkCard01");
        String card = "5181140006787661";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard02() {
        System.out.println("checkCard02");
        String card = "4386303873043628";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard03() {
        System.out.println("checkCard");
        String card = "4205606846280344";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard04() {
        System.out.println("checkCard");
        String card = "5647608651833236";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard05() {
        System.out.println("checkCard");
        String card = "5056811135423632";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard06() {
        System.out.println("checkCard");
        String card = "4334875881166247";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard07() {
        System.out.println("checkCard");
        String card = "5024887348536351";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard08() {
        System.out.println("checkCard");
        String card = "4630880554175658";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard09() {
        System.out.println("checkCard");
        String card = "4576001327141366";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    public void testCheckCard10() {
        System.out.println("checkCard");
        String card = "4672540563643075";
        boolean result = CardAndCIValidation.checkCard(card);
        assertTrue(result);
    }
    /**
     * Test of validateCI method, of class CardAndCIValidation.
     */
    @Test
    public void testValidateCI01() {
        System.out.println("validateCI");
        String CI = "1727620054";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
    public void testValidateCI02() {
        System.out.println("validateCI");
        String CI = "1726744293";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
    public void testValidateCI03() {
        System.out.println("validateCI");
        String CI = "2300629702";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
    public void testValidateCI04() {
        System.out.println("validateCI");
        String CI = "1725186702";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
    public void testValidateCI05() {
        System.out.println("validateCI");
        String CI = "1708740962";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
    public void testValidateCI06() {
        System.out.println("validateCI");
        String CI = "1707856330";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }public void testValidateCI07() {
        System.out.println("validateCI");
        String CI = "1750744441";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
    public void testValidateCI08() {
        System.out.println("validateCI");
        String CI = "1314524651";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }public void testValidateCI09() {
        System.out.println("validateCI");
        String CI = "1725906968";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
    public void testValidateCI10() {
        System.out.println("validateCI");
        String CI = "1751486950";
        boolean result = CardAndCIValidation.validateCI(CI);
        assertTrue(result);
    }
 
}
