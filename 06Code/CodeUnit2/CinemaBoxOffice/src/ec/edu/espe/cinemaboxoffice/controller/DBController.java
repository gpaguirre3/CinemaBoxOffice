/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.nio.file.Files;

/**
 *
 * @author Gabriel Aguirre
 */
public abstract class DBController {
    protected Gson gson;
    
    public DBController() {
        ensureJsonDBFile();
    }
    
    private void ensureJsonDBFile(){
        gson = new GsonBuilder().setPrettyPrinting().create();
        File databaseFile = jsonDBFile();
        
        if (!databaseFile.exists()) {
            try {
                databaseFile.createNewFile();
                Files.write(databaseFile.toPath(), "[]".getBytes());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
    
    protected abstract File jsonDBFile();
}
