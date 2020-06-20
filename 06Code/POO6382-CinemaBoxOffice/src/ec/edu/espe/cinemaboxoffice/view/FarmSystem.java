/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class FarmSystem {

    public static void main(String[] args) throws IOException {
        Keyboard in = new Keyboard();
        boolean repeat = false;
        AdminSystem adminSystem = new AdminSystem();
        CustomerSystem customerSystem = new CustomerSystem();
        do {
            System.out.println(" 1: Admin \n 2: Customer \n 3: Exit");
            int option2 = in.getInt("enter option: ", 1);
            switch (option2) {
                case 1:
                    adminSystem.manager();
                    break;
                case 2:
                    customerSystem.buyer();
                    break;
                case 3:
                    repeat = true;
                    break;
                default:
                    System.out.println("incorrect option");
                    break;
            }
        } while (repeat == false);
    }
}
