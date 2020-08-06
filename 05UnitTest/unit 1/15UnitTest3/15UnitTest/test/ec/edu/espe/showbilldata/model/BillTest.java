/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.showbilldata.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhoel Chicaiza
 */
public class BillTest {
    
    

    /**
     * Test of showBillData method, of class Bill.
     */
    @Test
    public void testShowBillData() {
        Bill bill = new Bill();
        float moviePriceTicket = 9;
        String customerId= "3";
        String customerName= "jhoel";
        String expectedResult = "1001, Jhoel, 20, ";
        String actualResult = bill.showBillData(moviePriceTicket);
        System.out.println("expected result-> " + expectedResult);
        assertEquals(expectedResult, actualResult);
    }
    
}
