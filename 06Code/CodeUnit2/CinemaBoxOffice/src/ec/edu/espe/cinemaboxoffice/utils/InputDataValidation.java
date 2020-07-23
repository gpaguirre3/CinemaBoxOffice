/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.utils;

import java.util.Scanner;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class InputDataValidation {

    Scanner string;

    public InputDataValidation() {
        string = new Scanner(System.in);
    }

    public String getString(String title) {
        String data = "";
        while (data.equals("")) {
            System.out.println(title);
            data = string.nextLine();
            if ((!data.matches("^[ A-Za-z0-9]+$"))) {
                data = "";
                System.out.println("Special Characters Not Allowed\n");
            }
        }
        return data;
    }

    public String getYesOrNo(String title) {
        String data = "";
        while (data.equals("")) {
            System.out.print(title);
            data = string.nextLine();
            if (!"yes".equals(data) & !"no".equals(data)) {
                data = "";
            }
        }
        return data;
    }
    
    public int getInt(String title, int characters) {
        String data = "";
        while (data.equals("")) {
            System.out.println(title);
            data = string.nextLine();
            if (!data.matches("[0-9]{" + characters + "}")) {
                data = "";
                System.out.println("\nIncorrect data\n");
            }
        }
        return Integer.parseInt(data);
    }
    
    public float getFloat(String title) {
        System.out.println(title);
        String data = string.nextLine();
        return Float.parseFloat(data);
    }
}
