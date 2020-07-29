/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;
/*
import ec.edu.espe.farmsystem.utils.PasswordEncryptor;
import java.util.Scanner;*/

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class AdminLogin {

    /*Scanner scanner = new Scanner(System.in);
    LoginFileManager file = new LoginFileManager("AdminAccount.txt");

    public boolean verifyAccount() {

        boolean username = false;
        boolean password = false;
        boolean permissionToEnter = false;

        boolean repeat = false;
        while (repeat == false) {
            username = enterUsername();
            password = enterPassword();
            if ((username == true) & (password == true)) {
                repeat = true;
            }
        }
        permissionToEnter = allowAccess(username, password);
        return permissionToEnter;
    }

    public boolean enterUsername() {
        String username;
        boolean usernameFinder = false;
        do {
            System.out.println("Username: ");
            username = scanner.nextLine();
            usernameFinder = file.findUsername(username);

            if (usernameFinder == true) {
                System.out.println("Correct username!");
            } else {
                System.out.println("Incorrect account");
            }
        } while (usernameFinder != true);
        return true;
    }

    public boolean enterPassword() {
        PasswordEncryptor encryptor = new PasswordEncryptor();
        String password;
        boolean passwordFinder = false;
        do {
            System.out.println("Password: ");
            password = scanner.nextLine();
            String compareInFile = encryptor.decryptPassword(password);
            passwordFinder = file.findPassword(compareInFile);

            if (passwordFinder == true) {
                System.out.println("Correct Password");
            } else {
                System.out.println("Incorrect Password");
            }

        } while (passwordFinder != true);
        return true;
    }

    public boolean allowAccess(boolean username, boolean password) {
        boolean permissionToEnter = false;
        if ((username == true) & (password == true)) {
            permissionToEnter = true;
        }
        return permissionToEnter;
    }*/
}
