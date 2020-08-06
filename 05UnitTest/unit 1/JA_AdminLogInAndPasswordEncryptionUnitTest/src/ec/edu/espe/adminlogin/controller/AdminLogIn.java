/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.adminlogin.controller;

import ec.edu.espe.passwordencryptor.utils.PasswordEncryptor;

/**
 *
 * @author Josue
 */
public class AdminLogIn {

    AccountManagement f = new AccountManagement("AdminAccount.csv");

    public boolean verifyAccount(String name, String pass) {

        boolean username = false;
        boolean password = false;
        boolean permissionToEnter = false;

        boolean repeat = false;

        username = enterUsername(name);
        password = enterPassword(pass);

        permissionToEnter = allowAccess(username, password);
        if(permissionToEnter == true){
            System.out.println("Correct Account");
        } else {
            System.out.println("Incorrect Account");
        }
        return permissionToEnter;
    }

    public boolean enterUsername(String username) {
        boolean usernameFinder = false;

        usernameFinder = f.findUsername(username);

        return usernameFinder;
    }

    public boolean enterPassword(String password) {
        PasswordEncryptor c = new PasswordEncryptor();
        boolean passwordFinder = false;

        String compareInFile = c.encryptPassword(password);
        passwordFinder = f.findPassword(compareInFile);

        return passwordFinder;
    }

    public boolean allowAccess(boolean username, boolean password) {
        boolean permissionToEnter = false;
        if ((username == true) & (password == true)) {
            permissionToEnter = true;
        }
        return permissionToEnter;
    }

}
