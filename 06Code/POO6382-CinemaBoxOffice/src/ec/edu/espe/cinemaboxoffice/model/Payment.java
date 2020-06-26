/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.cinemaboxoffice.utils.Validation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Payment {
    private Customer customer;
    //private String card;
    
    Keyboard in = new Keyboard();
    FileManagerLib file;
    
    public boolean createPayment() {
        return false;
        
    }
    
    public void cancelPay(){
        
    }
}
