/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;


/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class PaymentCard {

    private String cardNumber;
    private int segurityCode;
    private int month;
    private int year;
    
    InputDataValidation in = new InputDataValidation();
    
    public PaymentCard(String cardNumber, int segurityCode, int month, int year) {
        this.cardNumber = cardNumber;
        this.segurityCode = segurityCode;
        this.month = month;
        this.year = year;
    }
    
    public boolean confirmCard(){
        
        boolean validconfirmation = true;
        
        do{
            cardNumber = in.getString("Enter your Number Card: ");
        }while(!in.checkCard(cardNumber));
        
        segurityCode = in.getInt("Enter your segurity code: ", 3);
        month = in.getInt("Expiration date of month", 2);
        year = in.getInt("Expiration date of year", 2);
        return validconfirmation;
    }
    
    
    
}
