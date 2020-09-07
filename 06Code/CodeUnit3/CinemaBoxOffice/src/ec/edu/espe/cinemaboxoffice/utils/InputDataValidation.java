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
public class InputDataValidation {
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
}
