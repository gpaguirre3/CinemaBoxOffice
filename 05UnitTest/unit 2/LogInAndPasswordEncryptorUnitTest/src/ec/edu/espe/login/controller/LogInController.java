/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.login.controller;

import ec.edu.espe.login.utils.PasswordEncryptor;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.login.model.Admin;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class LogInController {

    public boolean findUser(String username, String pass) throws IOException {
        PasswordEncryptor decryptor = new PasswordEncryptor();
        boolean foundUser = false;
        pass = decryptor.decryptPassword(pass);
        ArrayList<Admin> admins = new ArrayList<>();
        admins = createAdminList();
        for (Admin admin : admins) {
            if ((admin.getUserName().equals(username)) & (admin.getPassword().equals(pass))) {
                foundUser = true;
            }
        }

        return foundUser;
    }

    public boolean findId(String id) throws IOException {
        boolean idFound = false;
        ArrayList<Admin> admins = new ArrayList<>();
        admins = createAdminList();
        for (Admin admin : admins) {
            if (admin.getId().equals(id)) {
                idFound = true;
            }
        }
        return idFound;
    }

    public ArrayList<Admin> createAdminList() throws IOException {
        Gson gson = new Gson();
        ArrayList<Admin> admins = new ArrayList<>();
        String accountsJson = "";
        accountsJson = new String(Files.readAllBytes(Paths.get("AdminAccount.json")));
        java.lang.reflect.Type combosType = new TypeToken<ArrayList<Admin>>() {
        }.getType();
        admins = gson.fromJson(accountsJson, combosType);
        return admins;
    }
}
