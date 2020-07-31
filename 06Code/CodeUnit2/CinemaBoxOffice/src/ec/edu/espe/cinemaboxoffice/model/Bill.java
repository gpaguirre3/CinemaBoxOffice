/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Bill extends Person{

    private int id;
    private float buyPrice;
    private Customer customer;
    private Gson gson;
    private File invoiceCreated;

    public Bill(String CI, String name,int id, float buyPrice) {
        super(CI, name);
        this.id = id;
        this.buyPrice = buyPrice;
    }
    
    public void keepingInvoice(){
        gson = new GsonBuilder().setPrettyPrinting().create();
        invoiceCreated = Paths.get("data/bill.json").toFile();
        
        if (!invoiceCreated.exists()) {
            try {
                invoiceCreated.createNewFile();
                Files.write(invoiceCreated.toPath(), "[]".getBytes());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
    
    public void invoiceCreate(){
        
    }
    

}
