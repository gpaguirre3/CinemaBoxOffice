/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.utils;

/**
 *
 * @author Gabriel Aguirre
 */
public class Validation {
    /*
    String card;
    boolean valid;
    System.out.println("Enter the card: ");
    card = scanner.next();
    valid=Validation.checkCard(card);
    if(valid){
    System.out.println("the card ir : " +card);
    */
    public static boolean checkCard(String card){
    if(card.length() != 16){
        return false;
    }
    int number =0 ,sum = 0;
    for(int i = 0; i < 16; i++){
        if(i%2 == 0){
            number = Integer.valueOf(card.charAt(i)) * 2;
            if(number >= 10)
                number = (number - 10) + 1;
        }
        number = Integer.valueOf(card.charAt(i));
        sum = sum + number;
    }
    if(sum%10 == 0){
        return true;
    }else
    return false;
    } 
    
    /*
        String identificationCard;
        boolean valid;  
        System.out.println("enter the identificationCard: ");
        identificationCard = scanner.next();
        valid=validation.verifyID(identificationCard);
        if(valid){
            System.out.println("the identificationCard is : " +identificationCard);
        }else 
            System.out.println("the identificationCard is incorrect : ");
    */
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
    int digit;
    int sumPairs = 0;
    int oddSum = 0;

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
