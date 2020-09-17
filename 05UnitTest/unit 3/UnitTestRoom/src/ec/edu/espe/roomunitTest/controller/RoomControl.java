/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.roomunitTest.controller;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alisson Clavijo
 */
public class RoomControl {

      public String defineRoom(int numberRoom) {
        if (numberRoom > 0 & numberRoom <= 7) {
            if (numberRoom > 0 & numberRoom <= 4) {
                return "2D";
            } else {
                return "3D";
            }
        }
        return "-";
    }
}
