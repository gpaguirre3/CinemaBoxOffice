/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.MovieRecord;
import ec.edu.espe.cinemaboxoffice.controller.PromotionRecord;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class Admin extends Person {

    private String userName;
    private String password;

    public Admin(int id, String name, String userName, String keyUser) {
        super(id, name);
        this.userName = userName;
        this.password = keyUser;
    }

    public void manageCinema() {
        InputDataValidation in = new InputDataValidation();
        MovieRecord record = new MovieRecord();
        PromotionRecord precord = new PromotionRecord();
        int option;
        do {
            System.out.println(" 1: Manage movie list \n 2: Manage promotions \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    record.manageCinema();
                    break;
                case 2:
                    precord.managePromotion();
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (option != 3);
    }

    @Override
    public String toString() {
        String admin = userName + "," + password + "," + name + "," + getId();

        return admin;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

}
