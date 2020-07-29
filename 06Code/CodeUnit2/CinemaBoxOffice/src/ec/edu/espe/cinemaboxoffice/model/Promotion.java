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
public class Promotion {

    private String promotionDescription;
    private String promotionDate;
    private float promotionPrice;

    public Promotion(String promotionDescription, String promotionDate, float promotionPrice) {
        this.promotionDescription = promotionDescription;
        this.promotionDate = promotionDate;
        this.promotionPrice = promotionPrice;
    }
}
