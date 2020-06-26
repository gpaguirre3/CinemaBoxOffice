/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import ec.edu.espe.cinemaboxoffice.utils.SpecialValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Payment {

    private Customer customer;
    private String cardHolder;
    private String cardNumber;
    private int year;
    private int month;

    DataValidation in = new DataValidation();
    FileManagerLib file;

    public Payment(String cardHolder, String creditCard, int year, int month) {
        this.cardHolder = cardHolder;
        this.cardNumber = creditCard;
        this.year = year;
        this.month = month;
    }

    Payment() {
    }

    @Override
    public String toString() {
        return "Payment{" + "cardHolder=" + cardHolder + ", creditCard=" + cardNumber + ", year=" + year + ", month=" + month + '}';
    }

    public boolean createPayment(boolean condition) {

        String answer;
        do {
            cardNumber = in.getString("Enter the credit card number: ");
        } while (!SpecialValidation.checkCard(cardNumber));
        cardHolder = in.getString("Enter the card holder: ");
        year = in.getInt("Enter the credit card expiration year", 4);
        month = in.getInt("Enter the credit card expiration month(In numbers)", 2);

        answer = in.getString("Pay?[yes/no]");
        if (answer.equals("yes")) {
            return true;
        }
        return false;
    }
}
