/*
 * To change this license header, choose License Headers input Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template input the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;

/**
 *
 * @author Gabriel Aguirre
 */
public class CustomerController {
    InputDataValidation input = new InputDataValidation();
    
    public void saveCustormerData() {
        String name;
        String CI; 
        int age;
        
        name = input.getString("Enter the full name: ");
        
        do {
            CI = input.getString("Enter your CI: ");
        } while(!input.validateCI(CI));
        
        age = input.getInt("Enter the age: ", 2);
    }
    

}
