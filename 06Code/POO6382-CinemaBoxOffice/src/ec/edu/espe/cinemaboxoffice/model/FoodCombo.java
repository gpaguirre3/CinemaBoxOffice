/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class FoodCombo {

    private int numberCombo;
    private String drink;
    private String snack;
    private String fastFood;
    private float priceFood;

    public FoodCombo(int numberCombo, String drink, String snack, String fastFood, float priceFood) {
        this.numberCombo = numberCombo;
        this.drink = drink;
        this.snack = snack;
        this.fastFood = fastFood;
        this.priceFood = priceFood;
    }

    public int menuCombo() {
        DataValidation in = new DataValidation();
        ArrayList<FoodCombo> combos = new ArrayList<>();
        boolean repeat = false;
        int election;
        combos.add(new FoodCombo(1, "CocaCola", "Chocolate Bar", "Pop-Corn", 2.50F));
        combos.add(new FoodCombo(2, "Sprite", "Candies", "Hot-Dog", 2.50F));
        combos.add(new FoodCombo(3, "Fanta", "Gummies", "Pizza", 2.50F));
        combos.add(new FoodCombo(4, "Seven Up", "Doritos", "Chips", 2.50F));
        combos.add(new FoodCombo(5, "Fiora Vanti", "Ice-Cream", "Nachos", 2.50F));
        System.out.println(combos);
        do {
            election = in.getInt("Choose the combo you want to add: ", 1);
            if (election <= 5 & election > 0) {
                combos.get(election);
                repeat = true;
            } else {
                System.out.println("The combo doesn' exist");
                repeat = false;
            }
        } while (repeat = false);
        return election;
    }

    @Override
    public String toString() {
        return "\n" + numberCombo + "," + drink + "," + snack + "," + fastFood + "," + priceFood;
    }
}