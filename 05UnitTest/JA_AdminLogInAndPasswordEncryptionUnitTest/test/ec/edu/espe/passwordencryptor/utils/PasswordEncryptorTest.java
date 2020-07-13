/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.passwordencryptor.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue
 */
public class PasswordEncryptorTest {

    public PasswordEncryptorTest() {
    }

    /**
     * Test of encryptPassword method, of class PasswordEncryptor.
     */
    @Test
    public void testEncryptPassword() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "cinema";
        String expectedResult = "djofnb";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword2() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "josuea";
        String expectedResult = "kptvfb";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword3() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "espe";
        String expectedResult = "1234";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword4() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "intel";
        String expectedResult = "joufm";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword5() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "android";
        String expectedResult = "iutiolp";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword6() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "12345";
        String expectedResult = "54321";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword7() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "boundary";
        String expectedResult = "cpvoebsz";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword8() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "life";
        String expectedResult = "death";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword9() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "%(*=ad";
        String expectedResult = "&)+>be";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEncryptPassword10() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "aaaaa";
        String expectedResult = "bbbbb";
        String actualResult;
        actualResult = encrypt.encryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of decryptPassword method, of class PasswordEncryptor.
     */
    @Test
    public void testDecryptPassword() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "djofnb";
        String expectedResult = "cinema";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword2() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "kptvfb";
        String expectedResult = "josuea";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword3() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "1234";
        String expectedResult = "0123";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword4() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "joufm";
        String expectedResult = "intel";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword5() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "iutilop";
        String expectedResult = "htshkno";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword6() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "54321";
        String expectedResult = "12345";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword7() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "cpvoebsz";
        String expectedResult = "boundary";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword8() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "death";
        String expectedResult = "cd`sg";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword9() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "&)+>be";
        String expectedResult = "%(*=ad";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDecryptPassword10() {
        PasswordEncryptor encrypt = new PasswordEncryptor();
        String password = "bbbbb";
        String expectedResult = "aaaaa";
        String actualResult;
        actualResult = encrypt.decryptPassword(password);
        assertEquals(expectedResult, actualResult);
    }

}
