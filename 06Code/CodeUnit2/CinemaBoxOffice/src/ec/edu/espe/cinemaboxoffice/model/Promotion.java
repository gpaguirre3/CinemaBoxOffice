/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.util.Date;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Promotion {

    private String promotionDescription;
    private Date promotionDate;
    private float promotionPrice;

    public Promotion(String promotionDescription, Date promotionDate, float promotionPrice) {
        this.promotionDescription = promotionDescription;
        this.promotionDate = promotionDate;
        this.promotionPrice = promotionPrice;
    }
}
