/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.Admin;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Josue Aleman, ESPE.
 */
public class NewAccountsController {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public List<Admin> getAllAccounts() {
        try {
            String json = new String(Files.readAllBytes(Paths.get("AdminAccount.json")));
            return Arrays.asList(gson.fromJson(json, Admin[].class));
        } catch (Exception e) {
        }

        return Collections.emptyList();
    }

    public void addAccounts(String id, String name, String username, String password) {
        Admin admin = new Admin("", "", "", "");
        admin.setId(id);
        admin.setName(name);
        admin.setUserName(username);
        admin.setPassword(password);

        List<Admin> accounts = new ArrayList<>(getAllAccounts());
        accounts.add(admin);

        try {
            String json = gson.toJson(accounts);
            Files.write(Paths.get("AdminAccount.json"), json.getBytes());
        } catch (Exception e) {
        }
    }
}
