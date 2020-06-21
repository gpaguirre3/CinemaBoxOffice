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
public class Customer {
    private int id;
    private String name;
    private int age;
    
    public void enterBillboard(){
        Billboard billboard = new Billboard();
        billboard.billboardMenu();
    }
    
    public void exitBillboard(){
        
    }
}
