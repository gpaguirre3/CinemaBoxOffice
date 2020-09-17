/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.login.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue Aleman ESPE.
 */
public class PasswordEncryptorTest {

    public PasswordEncryptorTest() {
    }

    /**
     * Test of encryptPassword method, of class PasswordEncryptor.
     */
    @Test
    public void testEncryptPassword() {
        String newPassword = "cinema";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "djofnb";
        String result = instance.encryptPassword(newPassword);
        assertEquals(expResult, result);
    }

    public void testEncryptPassword2() {
        String newPassword = "josuea";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "kptvfb";
        String result = instance.encryptPassword(newPassword);
        assertEquals(expResult, result);
    }

    public void testEncryptPassword3() {
        String newPassword = "espe";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "1234";
        String result = instance.encryptPassword(newPassword);
        assertEquals(expResult, result);
    }

    public void testEncryptPassword4() {
        String newPassword = "intel";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "jouxm";
        String result = instance.encryptPassword(newPassword);
        assertEquals(expResult, result);
    }

    public void testEncryptPassword5() {
        String newPassword = "android";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "iutiolp";
        String result = instance.encryptPassword(newPassword);
        assertEquals(expResult, result);
    }

    /**
     * Test of decryptPassword method, of class PasswordEncryptor.
     */
    @Test
    public void testDecryptPassword() {
        String comparedPassword = "djofnb";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "cinema";
        String result = instance.decryptPassword(comparedPassword);
        assertEquals(expResult, result);

    }

    @Test
    public void testDecryptPassword2() {
        String comparedPassword = "kptvfb";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "josuea";
        String result = instance.decryptPassword(comparedPassword);
        assertEquals(expResult, result);

    }

    @Test
    public void testDecryptPassword3() {
        String comparedPassword = "ftqf";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "espe";
        String result = instance.decryptPassword(comparedPassword);
        assertEquals(expResult, result);

    }

    @Test
    public void testDecryptPassword4() {
        String comparedPassword = "hmsdk";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "glrcj";
        String result = instance.decryptPassword(comparedPassword);
        assertEquals(expResult, result);

    }

    @Test
    public void testDecryptPassword5() {
        String comparedPassword = "boespje";
        PasswordEncryptor instance = new PasswordEncryptor();
        String expResult = "android";
        String result = instance.decryptPassword(comparedPassword);
        assertEquals(expResult, result);

    }

}
