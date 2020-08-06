/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.defineroomformat.controller;

/**
 *
 * @author Jhoel Chicaiza
 */
public class DefineRoomFormat {
    public String defineRoomFormat(int roomNumberForMovie) {
        do {
            if (roomNumberForMovie < 10 & roomNumberForMovie > -1) {
                if (roomNumberForMovie > -1 & roomNumberForMovie < 5) {
                    return "2D";
                } else {
                    return "3D";
                }
            }
        } while (!(roomNumberForMovie < 10 & roomNumberForMovie > -1));
        return "The room doesn't exist";
    }
    
    public String defineRoomFormat3D(int roomNumberForMovie3D) {
        do {
            if (roomNumberForMovie3D < 10 & roomNumberForMovie3D > -1) {
                if (roomNumberForMovie3D > -1 & roomNumberForMovie3D < 5) {
                    return "3D";
                } 
            }
        } while (!(roomNumberForMovie3D < 10 & roomNumberForMovie3D > -1));
        return "The room doesn't exist";
    }
}
