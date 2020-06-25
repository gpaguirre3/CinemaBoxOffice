/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.util.Scanner;
/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Payment {
    private Customer customer;
    private String card;

    public Payment(Customer customer, String card) {
        this.customer = customer;
        this.card = card;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Payment{" + "customer=" + customer + ", card=" + card + '}';
    }
    
    
    
    public void pay(){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println();
        System.out.println("Enter your card details ");
        System.out.println("Enter your id:  ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age:  ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter number of the card: ");
        String card = scanner.nextLine();
        
        System.out.println("\n your card information was entered! ");
    }
    
    public void cancelPay(){
                       
    }
}
