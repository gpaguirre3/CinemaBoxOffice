/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.cinemaboxoffice.utils.Validation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Payment {
    private Customer customer;
    //private String card;
    
    Keyboard in = new Keyboard();
    FileManagerLib file;
    
    public void createPayment() throws IOException{
        
        boolean repeat = false;
        String cardNumber;
        String customerId;
        String customerName;
        int customerAge;
        file = new FileManagerLib("Bill.txt");
        
        do{
            cardNumber = in.getString("Enter your card number: ");
            customerId = in.getString("Enter your ID: ");
            customerName = in.getString("Enter your name: ");
            customerAge = in.getInt("Enter your age", 2);
            customer = new Customer(cardNumber, customerId, customerName, customerAge);
            System.out.println(file.writeFile(customer.toString()));
            
        }while(repeat == false);
    }
    
    public void cancelPay(){
        
    }
}
