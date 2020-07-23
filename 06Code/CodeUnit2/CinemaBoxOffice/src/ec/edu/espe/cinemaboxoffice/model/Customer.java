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
public class Customer extends Person {

    private int age;
    private PaymentCard card;
    private Bill bill;

    public Customer(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public Customer(int id, String name, int age, PaymentCard card, Bill bill) {
        super(id, name);
        this.age = age;
        this.card = card;
        this.bill = bill;
    }

    public void cinemaMenu() {
        
    }
}
