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
    System.out.println("enter the identificationCard: ");
        identificationCard = scanner.next();
        valid=validation.verifyID(identificationCard);
        if(valid){
            System.out.println("the identificationCard is : " +identificationCard);
        }else 
            System.out.println("the identificationCard is incorrect : ");
    */
        public static boolean verifyID(String identificationCard){
        if (identificationCard.length() != 10) {
        return false;
        }
        for (int i = 0; i < 10; i++) {
           if (!Character.isDigit(identificationCard.charAt(i))) {
                return false;
            }
        }

        int ultimo_digito = Character.getNumericValue((identificationCard.charAt
        (identificationCard.length() - 1)));
        int digito;
        int suma_pares = 0;
        int suma_impares = 0;

         for (int i = 0; i < 9; i++) {
            digito = Character.getNumericValue(identificationCard.charAt(i));

            if ((i + 1) % 2 == 0) {
                suma_pares += digito;
            } else {
                suma_impares += (digito * 2) > 9 ? (digito * 2) - 9 : (digito * 2);
            }
        }

        int total = suma_pares + suma_impares;
        int superior = (10 - (total % 10)) + total;

        if ((total % 10) == 0) {
            return ultimo_digito == 0;
        }

        return ultimo_digito == (superior - total);
            }

}
