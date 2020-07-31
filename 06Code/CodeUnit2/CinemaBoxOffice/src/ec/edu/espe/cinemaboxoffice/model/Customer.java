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
public class Customer extends Person{

    private int age;
    
    InputDataValidation in = new InputDataValidation();

    public Customer(String CI, String name, int age) {
        super(CI, name);
        this.age = age;
    }
    
    public void custormerData(){
        
        name = in.getString("Enter the full name: ");
        do{
            CI = in.getString("Enter your CI: ");
        }while(!in.validateCI(CI));
        age = in.getInt("Enter the age: ", 2);
    }
    
    public void cinemaMenu() {

    }
    
    
}
