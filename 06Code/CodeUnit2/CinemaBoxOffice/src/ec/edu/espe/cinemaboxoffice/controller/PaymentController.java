/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.Bill;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Gabriel Aguirre
 */
public class PaymentController extends DBController {
    @Override
    public File jsonDBFile(){
        return Paths.get("data/bill.json").toFile();
    }
    
    public void createInvoice(Bill bill){
        // TODO: imprimir datos del bill y datos pelicula
    }
}
