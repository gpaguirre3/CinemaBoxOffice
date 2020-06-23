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
        public static boolean verifyID(String identificationCard){ 
     int total = 0;  
     int sizeCardLength = 10;  
     int[] coefficient = {2, 1, 2, 1, 2, 1, 2, 1, 2};  
     int provinceNumber = 24;  
     int thirdDigit = 6;  
     
     if (identificationCard.matches("[0-9]*") && identificationCard.length() == sizeCardLength) {  
       int province = Integer.parseInt(identificationCard.charAt(0) + "" + identificationCard.charAt(1));  
       int digitThree = Integer.parseInt(identificationCard.charAt(2) + "");  
       
       if ((province > 0 && province <= provinceNumber) && digitThree < thirdDigit) {  
         int verifiedDigit = Integer.parseInt(identificationCard.charAt(9) + ""); 
         
         for (int i = 0; i < coefficient.length; i++) {  
           int value = Integer.parseInt(coefficient[i] + "") * Integer.parseInt(identificationCard.charAt(i) + "");  
           total = value >= 10 ? total + (value - 9) : total + value;  
         } 
         
         int verifiedDigitObtained = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;  
         if (verifiedDigitObtained == verifiedDigit) {  
           return true;  
         }  
       }  
       return false;  
     }  
     return false;  
   } 
}
