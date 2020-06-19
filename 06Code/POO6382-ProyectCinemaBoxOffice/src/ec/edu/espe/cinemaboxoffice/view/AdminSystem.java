/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.model.Admin;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class AdminSystem {

    public static void manager(String[] args) {
        Admin admin = new Admin("", 0);
        admin.enterUser();
    }
}
