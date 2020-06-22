/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class FoodCombo {
    private String drink;
    private String snack;
    private String fastFood;
    private float priceFood;

    public FoodCombo(String drink, String snack, String fastFood, float priceFood) {
        this.drink = drink;
        this.snack = snack;
        this.fastFood = fastFood;
        this.priceFood = priceFood;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getFastFood() {
        return fastFood;
    }

    public void setFastFood(String fastFood) {
        this.fastFood = fastFood;
    }

    public float getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(float priceFood) {
        this.priceFood = priceFood;
    }
    
    
}
