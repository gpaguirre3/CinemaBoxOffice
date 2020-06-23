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
    private int keyPromotion;
    private String namePromotion;
    private String dayPromotion;
    private float pricePromotionFood;
    private Ticket ticket;
    
    private PricePurchase pricePurchases[];
    private FoodCombo foodCombos[];

    public Promotion(String namePromotion, String dayPromotion, float pricePromotionFood) {
        this.keyPromotion = indexEnumerator + 1;
        indexEnumerator = indexEnumerator + 1;
        this.namePromotion = namePromotion;
        this.dayPromotion = dayPromotion;
        this.pricePromotionFood = pricePromotionFood;
    }
    
    public void showPromotionData(){
        
    }

    @Override
    public String toString() {
        return "Promotion{" + "keyPromotion=" + keyPromotion + ", namePromotion=" + namePromotion + ", dayPromotion=" + dayPromotion + ", pricePromotionFood=" + pricePromotionFood + '}';
    }

    /**
     * @return the indexEnumerator
     */
    public static int getIndexEnumerator() {
        return indexEnumerator;
    }

    /**
     * @param aIndexEnumerator the indexEnumerator to set
     */
    public static void setIndexEnumerator(int aIndexEnumerator) {
        indexEnumerator = aIndexEnumerator;
    }

    /**
     * @return the keyPromotion
     */
    public int getKeyPromotion() {
        return keyPromotion;
    }

    /**
     * @param keyPromotion the keyPromotion to set
     */
    public void setKeyPromotion(int keyPromotion) {
        this.keyPromotion = keyPromotion;
    }

    /**
     * @return the namePromotion
     */
    public String getNamePromotion() {
        return namePromotion;
    }

    /**
     * @param namePromotion the namePromotion to set
     */
    public void setNamePromotion(String namePromotion) {
        this.namePromotion = namePromotion;
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