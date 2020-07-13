/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.adminlogin.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josue
 */
public class AccountManagement {

    private String fileName;
    private boolean answer;
    private File file;
    private String dataSeekerLine;

    public AccountManagement(String fileName, String dataSeekerLine) {
        this.fileName = fileName;
        this.dataSeekerLine = dataSeekerLine;
    }

    public AccountManagement(String fileName) {
        this.fileName = fileName;
        createFile();
    }

    public boolean createFile() {
        file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
                answer = false;
            }
        }
        return answer;
    }

    public boolean findUsername(String seeker) {
        boolean finder = false;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] contacto = line.split(",");
                if ((contacto[0].equals(seeker)) | (contacto[1].equals(seeker))) {
                    finder = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return finder;
    }

    public boolean findPassword(String seeker) {
        boolean correctPass = false;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] contact = line.split(",");
                if (contact[1].equals(seeker)) {

                    correctPass = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return correctPass;
    }

}
