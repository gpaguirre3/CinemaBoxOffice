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
    private String cardHolder;
    private long creditCard;
    private int year;
    private int month;
    
    Keyboard in = new Keyboard();
    FileManagerLib file;

    public Payment(String cardHolder, long creditCard, int year, int month) {
        this.cardHolder = cardHolder;
        this.creditCard = creditCard;
        this.year = year;
        this.month = month;
    }
    
    Payment() {
        
    }

    @Override
    public String toString() {
        return "Payment{" + "cardHolder=" + cardHolder + ", creditCard=" + creditCard + ", year=" + year + ", month=" + month + '}';
    }
    
    
    public boolean createPayment(boolean condition) {
        
        String answer;
        cardHolder = in.getString("Enter the card holder: ");
        creditCard = in.getLong("Enter the credit card number: ", 16);
        year = in.getInt("Enter the credit card expiration year", 4);
        month = in.getInt("Enter the credit card expiration month(In numbers)", 2);
        
        answer = in.getString("Pay?[yes/no]");
        if(answer.equals("yes")) {
            return true;
        }
        
        return false;
        
    }
    
    public void cancelPay(){
        
    }
}
