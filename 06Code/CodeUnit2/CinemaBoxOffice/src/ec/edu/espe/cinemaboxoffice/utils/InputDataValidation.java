/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.utils;

import java.util.ArrayList;
import java.util.Date;
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

    public static boolean checkCard(String card) {
        if (card.length() != 16) {
            return false;
        }
        int number = 0, sum = 0;
        for (int i = 0; i < 16; i++) {
            number = Character.getNumericValue(card.charAt(i));
            if (i % 2 == 0) {
                number *= 2;
                if (number > 9) {
                    number = number - 9;

                }
            }
            sum = sum + number;
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateCI(String CI) {
        if (CI.length() != 10) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(CI.charAt(i))) {
                return false;
            }
        }
        int lastDigit = Character.getNumericValue((CI.charAt(CI.length() - 1)));
        int digit, sumPairs = 0, oddSum = 0;

        for (int i = 0; i < 9; i++) {
            digit = Character.getNumericValue(CI.charAt(i));

            if ((i + 1) % 2 == 0) {
                sumPairs += digit;
            } else {
                oddSum += (digit * 2) > 9 ? (digit * 2) - 9 : (digit * 2);
            }
        }
        int total = sumPairs + oddSum;
        int higher = (10 - (total % 10)) + total;

        if ((total % 10) == 0) {
            return lastDigit == 0;
        }
        return lastDigit == (higher - total);
    }

    public Date getDate() {
        int day = getInt("Enter the day: ", 2);
        int month = getInt("Enter the month: ", 2);
        int year = getInt("Enter the year: ", 4);
        return new Date(year - 1900, month - 1, day);
    }
}
