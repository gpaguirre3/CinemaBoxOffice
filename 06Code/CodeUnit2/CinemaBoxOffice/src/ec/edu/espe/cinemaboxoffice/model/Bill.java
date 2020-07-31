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
public class Bill {

    private int id;
    private Customer customer;
    private float buyPrice;
    
    public Bill(int id, Customer customer, float buyPrice) {
        this.id = id;
        this.customer = customer;
        this.buyPrice = buyPrice;
    }
}
