/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.utils;

import java.util.Scanner;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Keyboard {

    Scanner string;
    
    Validation validate = new Validation();
    
    public Keyboard() {
        string = new Scanner(System.in);
    }

    public String getString(String title) {
        String data = "";
        while (data.equals("")) {
            System.out.println(title);
            data = string.nextLine();
            if((!data.matches("^[ A-Za-z0-9]+$"))){
                data = "";
                System.out.println("Special Characters Not Allowed");
            }
        }
        validate.checkCard(data);
        return data;
    }
    
    public String getStringAnswer(String title) {
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
                System.out.println("\nIncorrect data, please repeat the ");
            }
        }
        return Integer.parseInt(data);
    }
    
    public float getFloat(String title, int characters) {
        String data = "";
        while (data.equals("")) {
            System.out.println(title);
            data = string.nextLine();
            if (!data.matches("[[0-9][,]]{" + characters + "}")) {
                data = "";
            }
        }
        return Float.parseFloat(data);
    }
}