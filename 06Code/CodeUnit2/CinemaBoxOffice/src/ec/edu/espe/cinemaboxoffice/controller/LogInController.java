/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.cinemaboxoffice.model.Admin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class LogInController {

    public boolean findUser(String username, String pass) {
        boolean foundUser = false;
        File archivo = null;
        FileReader FileR = null;
        BufferedReader BufferedR = null;

        String accountsJson = "";
        ArrayList<Admin> admins = new ArrayList<>();
        Gson gson = new Gson();
        try {
            archivo = new File("AdminAccount.json");
            FileR = new FileReader(archivo);
            BufferedR = new BufferedReader(FileR);
            String line;
            while ((line = BufferedR.readLine()) != null) {
                accountsJson = accountsJson + line;
            }
            java.lang.reflect.Type combosType = new TypeToken<ArrayList<Admin>>() {
            }.getType();
            admins = gson.fromJson(accountsJson, combosType);

            for (Admin admin : admins) {
                if ((admin.getUserName().equals(username)) & (admin.getPassword().equals(pass))) {
                    foundUser = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (null != FileR) {
                    FileR.close();
                }
            } catch (IOException e2) {
            }

        }

        return foundUser;
    }
}
