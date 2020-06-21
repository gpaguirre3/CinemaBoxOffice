/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.io.Serializable;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Promotion implements Serializable{

    private Ticket ticket;
    private String keyPromotion;
    private String dayPromotion;
    private float pricePromotionFood;
    
    private PricePurchase pricePurchases[];
    private FoodCombo foodCombos[];

    public Promotion(String keyPromotion, String dayPromotion, float pricePromotionFood) {
        this.keyPromotion = keyPromotion;
        this.dayPromotion = dayPromotion;
        this.pricePromotionFood = pricePromotionFood;
    }
    
    

    public void showPromotionData(){
        
    }

    @Override
    public String toString() {
        return "Promotion{" + "ticket=" + getTicket() + ", keyPromotion=" + getKeyPromotion() + ", dayPromotion=" + getDayPromotion() + ", pricePromotionFood=" + getPricePromotionFood() + ", pricePurchases=" + getPricePurchases() + ", foodCombos=" + getFoodCombos() + '}';
    }

    /**
     * @return the ticket
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the keyPromotion
     */
    public String getKeyPromotion() {
        return keyPromotion;
    }

    /**
     * @param keyPromotion the keyPromotion to set
     */
    public void setKeyPromotion(String keyPromotion) {
        this.keyPromotion = keyPromotion;
    }

    /**
     * @return the dayPromotion
     */
    public String getDayPromotion() {
        return dayPromotion;
    }

    /**
     * @param dayPromotion the dayPromotion to set
     */
    public void setDayPromotion(String dayPromotion) {
        this.dayPromotion = dayPromotion;
    }

    /**
     * @return the pricePromotionFood
     */
    public float getPricePromotionFood() {
        return pricePromotionFood;
    }

    /**
     * @param pricePromotionFood the pricePromotionFood to set
     */
    public void setPricePromotionFood(float pricePromotionFood) {
        this.pricePromotionFood = pricePromotionFood;
    }

    /**
     * @return the pricePurchases
     */
    public PricePurchase[] getPricePurchases() {
        return pricePurchases;
    }

    /**
     * @param pricePurchases the pricePurchases to set
     */
    public void setPricePurchases(PricePurchase[] pricePurchases) {
        this.pricePurchases = pricePurchases;
    }

    /**
     * @return the foodCombos
     */
    public FoodCombo[] getFoodCombos() {
        return foodCombos;
    }

    /**
     * @param foodCombos the foodCombos to set
     */
    public void setFoodCombos(FoodCombo[] foodCombos) {
        this.foodCombos = foodCombos;
    }
    
    
}
