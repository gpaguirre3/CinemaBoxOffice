/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.cinemaboxoffice.utils.PasswordEncryptor;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class AdminLogIn {

    InputValidation in = new InputValidation();

    public boolean enterUser() {

        PasswordEncryptor c = new PasswordEncryptor();
        FileManager file = new FileManager("AdminAccount.csv");

        boolean correctUser = false;
        boolean correctPass = false;
        boolean correctAcc = false;

        Scanner scanner = new Scanner(System.in);
        boolean repeat = false;
        boolean usernameFinder = false;
        String username;
        String password;
        while (repeat == false) {
            do {
                System.out.println("Username: ");
                username = scanner.nextLine();
                usernameFinder = file.findUsername(username);

                if (usernameFinder == true) {
                    System.out.println("Correct username!");
                    usernameFinder = false;
                    correctUser = true;
                } else {
                    System.out.println("Incorrect account");
                    usernameFinder = true;
                }
            } while (usernameFinder != false);

            boolean findPass = false;
            boolean foundPass = false;
            do {
                System.out.println("Password: ");
                password = scanner.nextLine();
                String compareInFile = c.comparePassword(password);
                foundPass = file.findPassword(compareInFile);
                try {
                    if (foundPass == true) {
                        System.out.println("Correct Password");
                        findPass = true;
                        correctPass = true;
                    } else {
                        System.out.println("Incorrect Password");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            } while (findPass == false);

            repeat = true;
        }
        if ((correctUser == true) & (correctPass == true)) {
            correctAcc = true;
        }
        return correctAcc;
    }
}
