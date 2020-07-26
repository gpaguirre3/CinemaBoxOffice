/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.utils;

/**
 *
 * @author Josue
 */
public class PasswordEncryptor {

    public String encryptPassword(String newPassword) {

        char[] charExtraction = newPassword.toCharArray();

        for (int i = 0; i < newPassword.length(); i++) {

            charExtraction[i] = newPassword.charAt(i);
            charExtraction[i]++;
        }

        newPassword = String.copyValueOf(charExtraction);
        return null;

    }

    public String decryptPassword(String comparedPassword) {
        boolean findPass = false;

        char[] charExtraction = comparedPassword.toCharArray();

        for (int i = 0; i < comparedPassword.length(); i++) {
            charExtraction[i] = comparedPassword.charAt(i);
            charExtraction[i]++;
        }
        comparedPassword = String.copyValueOf(charExtraction);

        return comparedPassword;
    }
}
