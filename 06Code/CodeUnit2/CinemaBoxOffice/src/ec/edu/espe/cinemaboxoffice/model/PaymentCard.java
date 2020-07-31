/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;


/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class PaymentCard {

    private String cardNumber;
    private int segurityCode;
    private int month;
    private int year;
    
    public PaymentCard(String cardNumber, int segurityCode, int month, int year) {
        this.cardNumber = cardNumber;
        this.segurityCode = segurityCode;
        this.month = month;
        this.year = year;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSegurityCode() {
        return segurityCode;
    }

    public void setSegurityCode(int segurityCode) {
        this.segurityCode = segurityCode;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
