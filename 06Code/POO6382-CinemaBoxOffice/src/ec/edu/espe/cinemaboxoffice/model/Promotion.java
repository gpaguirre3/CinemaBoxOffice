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
public class Promotion{

    private static int indexEnumerator = 1000;
    private int promotionKey;
    private String promotionName;
    private String promotionDay;
    private float foodPricePromotion;
    
    private PurchasePrice pricePurchases[];
    private FoodCombo foodCombos[];

    public Promotion(String namePromotion, String dayPromotion, float pricePromotionFood) {
        this.promotionKey = indexEnumerator + 1;
        indexEnumerator = indexEnumerator + 1;
        this.promotionName = namePromotion;
        this.promotionDay = dayPromotion;
        this.foodPricePromotion = pricePromotionFood;
    }

  

    @Override
    public String toString() {
        return promotionKey + "," + promotionName + "," + promotionDay + "," + foodPricePromotion + '}';
    }


    /**
     * @return the promotionKey
     */
    public int getPromotionKey() {
        return promotionKey;
    }

    /**
     * @param promotionKey the promotionKey to set
     */
    public void setPromotionKey(int promotionKey) {
        this.promotionKey = promotionKey;
    }

    /**
     * @return the promotionName
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * @param promotionName the promotionName to set
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * @return the promotionDay
     */
    public String getPromotionDay() {
        return promotionDay;
    }

    /**
     * @param promotionDay the promotionDay to set
     */
    public void setPromotionDay(String promotionDay) {
        this.promotionDay = promotionDay;
    }

    /**
     * @return the foodPricePromotion
     */
    public float getFoodPricePromotion() {
        return foodPricePromotion;
    }

    /**
     * @param foodPricePromotion the foodPricePromotion to set
     */
    public void setFoodPricePromotion(float foodPricePromotion) {
        this.foodPricePromotion = foodPricePromotion;
    }

    /**
     * @param pricePurchases the pricePurchases to set
     */
    public void setPricePurchases(PurchasePrice[] pricePurchases) {
        this.pricePurchases = pricePurchases;
    }

    /**
     * @param foodCombos the foodCombos to set
     */
    public void setFoodCombos(FoodCombo[] foodCombos) {
        this.foodCombos = foodCombos;
    }

   
}