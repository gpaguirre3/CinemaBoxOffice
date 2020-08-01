/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Promotion;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class PromotionRecord {

    InputDataValidation in = new InputDataValidation();

    public void managePromotion() throws IOException {
        int option;
        do {
            System.out.println(" 1: Record Promotion \n 2: Delete promotion \n 3: Exit");
            option = in.getInt("Enter an option: ", 1);
            switch (option) {
                case 1:
                    recordPromotion(recordData());
                    break;
                case 2:
                    deletePromotion();
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (option != 3);
    }

    public boolean recordPromotion(Promotion promotion) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Promotion> promotions = new ArrayList<>();
        FileManager.createFile("Promotion.json");
        String moviesJson = new String(Files.readAllBytes(Paths.get("Promotion.json")));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            promotions = gson.fromJson(moviesJson, ArrayList.class);
        }
        promotions.add(promotion);
        FileManager.deleteFile("Promotion.json");
        FileManager.writeFile("Promotion.json", gson.toJson(promotions));
        return true;
    }

    public boolean deletePromotion() throws IOException {
        String title = in.getString("Enter the name of the promotion: ");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Promotion> promotions;
        FileManager.createFile("Promotions.json");
        String moviesJson = new String(Files.readAllBytes(Paths.get("Promotions.json")));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            promotions = gson.fromJson(moviesJson, ArrayList.class);
            deleteP(title, promotions);
            FileManager.deleteFile("Promotions.json");
            FileManager.writeFile("Promotions.json", gson.toJson(deleteP(title, promotions)));
        }
        return true;
    }

    public ArrayList<Movie> deleteP(String title, ArrayList<Promotion> promotions) {
        System.out.println("-->" + promotions.size());
        System.out.println("-->" + promotions.get(0));
        for (int i = 0; i < promotions.size(); i++) {
            System.out.println("-->" + promotions.toString());
            /*if (promotions.get(i).getTitle().equals(title)) {
                promotions.remove(i);
            }*/
        }
        return null;
    }

    public Promotion recordData() {
        String description = in.getString("Enter the description of promotion: ");
        float price = in.getFloat("Enter the price: ");
        return new Promotion(description, in.getDate(), price);
    }
}
