/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.Admin;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;
import ec.edu.espe.cinemaboxoffice.utils.PasswordEncryptor;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class AdminSystem {

    InputDataValidation in = new InputDataValidation();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    PasswordEncryptor pass = new PasswordEncryptor();

    public void adminMenu() throws IOException {

        int option;
        do {
            System.out.println(" 1. LogIn \n 2. SignIn \n 3. Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    verifyAccount();
                    break;
                case 2:
                    signInAdmin();
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (option != 3);
    }

    public void verifyAccount() throws IOException {
        Admin admin = new Admin("", "", "", "");
        boolean permission = false;
        while (permission == false) {
            permission = logInAdmin();
            if (permission == true) {
                admin.manageCinema();
            }
        }
    }

    public boolean logInAdmin() throws IOException {
        PasswordEncryptor decrypt = new PasswordEncryptor();
        String admins;
        admins = new String(Files.readAllBytes(Paths.get("AdminAccount.json")));
        String username, password;
        boolean isFound = false;
        do {
            username = in.getString("Enter your username: ");
            password = in.getString("Enter your password: ");
            String decryptedPass = decrypt.decryptPassword(password);
            if (admins.contains(username) == false) {
                System.out.println("Incorrect Username");
            } else {
                if (admins.contains(decryptedPass) == false) {
                    System.out.println("Incorrect Password");
                } else {
                    System.out.println("Correct Account!");
                    isFound = true;
                }
            }

        } while (isFound == false);

        return isFound;
    }

    public void signInAdmin() throws IOException {
        FileManager.createFile("AdminAccount.json");
        String admins;
        JSONArray adminList;
        do {
            admins = new String(Files.readAllBytes(Paths.get("AdminAccount.json")));
            JSONObject admin = createAdmin();
            adminList = gson.fromJson(admins, JSONArray.class);
            adminList.add(admin);
        } while ("yes".equals(in.getYesOrNo("Register more admins?[yes/no]: ")));
        FileManager.deleteFile("AdminAccount.json");
        FileManager.writeFile("AdminAccount.json", gson.toJson(adminList));
    }

    public JSONObject createAdmin() {
        int iD = in.getInt("Enter your ID(numero de la lista): ", 1);
        String name = in.getString("Enter yout name: ");
        String userName = in.getString("Enter an username: ");
        String password = in.getString("Enter a password: ");
        String newPass = pass.encryptPassword(password);

        JSONObject accountDetails = new JSONObject();
        accountDetails.put("id", iD);
        accountDetails.put("name", name);
        accountDetails.put("userName", userName);
        accountDetails.put("password", newPass);
        JSONObject admin = new JSONObject();
        admin.put("admin", accountDetails);
        return admin;
    }

}
