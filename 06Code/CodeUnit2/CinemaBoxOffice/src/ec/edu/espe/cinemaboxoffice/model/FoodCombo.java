/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.util.ArrayList;

/**
 *
 * @author Alisson Clavijo
 */
public class FoodCombo {
    private int comboNumber;
    private String drink;
    private String snack;
    private String fastFood;
    private float foodPrice;

    public FoodCombo(int numberCombo, String drink, String snack, String fastFood, float priceFood) {
        this.comboNumber = numberCombo;
        this.drink = drink;
        this.snack = snack;
        this.fastFood = fastFood;
        this.foodPrice = priceFood;
    }

    public int menuCombo() {
       //InputValidation in = new InputValidation();
        ArrayList<FoodCombo> combos = new ArrayList<>();
        boolean repeat = false;
        int election;
        
        combos.add(new FoodCombo(1, "CocaCola", "Chocolate Bar", "Pop-Corn", 2.50F));
        combos.add(new FoodCombo(2, "Sprite", "Candies", "Hot-Dog", 2.50F));
        combos.add(new FoodCombo(3, "Fanta", "Gummies", "Pizza", 2.50F));
        combos.add(new FoodCombo(4, "Seven Up", "Doritos", "Chips", 2.50F));
        combos.add(new FoodCombo(5, "Fiora Vanti", "Ice-Cream", "Nachos", 2.50F));
        System.out.println(combos);
        return 0;
        
    }
    
    @Override
    public String toString() {
        return "\n" + comboNumber + "," + drink + "," + snack + "," + fastFood + "," + foodPrice;
    } 
}
