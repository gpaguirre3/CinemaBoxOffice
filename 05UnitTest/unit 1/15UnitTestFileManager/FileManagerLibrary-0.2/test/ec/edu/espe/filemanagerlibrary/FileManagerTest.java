/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanagerlibrary;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author santi
 */
public class FileManagerTest {
    
    public FileManagerTest() {
    }

    /**
     * Test of createFile method, of class FileManager.
     */
    @Test
    public void testCreateFile1() {
        System.out.println("createFile");
        String fileName = "file.txt";
        boolean expResult = true;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile2() {
        System.out.println("createFile");
        String fileName = "file.csv";
        boolean expResult = true;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile3() {
        System.out.println("createFile");
        String fileName = "file.json";
        boolean expResult = true;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile4() {
        System.out.println("createFile");
        String fileName = "file.txt";
        boolean expResult = false;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile5() {
        System.out.println("createFile");
        String fileName = "file.csv";
        boolean expResult = false;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile6() {
        System.out.println("createFile");
        String fileName = "file.json";
        boolean expResult = false;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile7() {
        System.out.println("createFile");
        String fileName = "";
        boolean expResult = false;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile8() {
        System.out.println("createFile");
        String fileName = "file";
        boolean expResult = true;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile9() {
        System.out.println("createFile");
        String fileName = ".txt";
        boolean expResult = true;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateFile10() {
        System.out.println("createFile");
        String fileName = "file text.txt";
        boolean expResult = true;
        boolean result = FileManager.createFile(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteFile method, of class FileManager.
     */
    @Test
    public void testDeleteFile1() {
        System.out.println("deleteFile");
        String fileName = "file.txt";
        boolean expResult = true;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile2() {
        System.out.println("deleteFile");
        String fileName = "file.csv";
        boolean expResult = true;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile3() {
        System.out.println("deleteFile");
        String fileName = "file.json";
        boolean expResult = true;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile4() {
        System.out.println("deleteFile");
        String fileName = "file.txt";
        boolean expResult = false;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile5() {
        System.out.println("deleteFile");
        String fileName = "file.csv";
        boolean expResult = false;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile6() {
        System.out.println("deleteFile");
        String fileName = "file.json";
        boolean expResult = false;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile7() {
        System.out.println("deleteFile");
        String fileName = "";
        boolean expResult = false;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile8() {
        System.out.println("deleteFile");
        String fileName = "file";
        boolean expResult = true;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile9() {
        System.out.println("deleteFile");
        String fileName = ".txt";
        boolean expResult = true;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteFile10() {
        System.out.println("deleteFile");
        String fileName = "file text.txt";
        boolean expResult = false;
        boolean result = FileManager.deleteFile(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of writeFile method, of class FileManager.
     */
    @Test
    public void testWriteFile1() {
        System.out.println("writeFile");
        String fileName = "file.txt";
        String informationToSave = "software";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile2() {
        System.out.println("writeFile");
        String fileName = "file.csv";
        String informationToSave = "software";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile3() {
        System.out.println("writeFile");
        String fileName = "file.txt";
        String informationToSave = "code, test";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile4() {
        System.out.println("writeFile");
        String fileName = "file.csv";
        String informationToSave = "/*-+";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile5() {
        System.out.println("writeFile");
        String fileName = "file.txt";
        String informationToSave = "<,.-{}+´¿'";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile6() {
        System.out.println("writeFile");
        String fileName = "file.csv";
        String informationToSave = "12364";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile7() {
        System.out.println("writeFile");
        String fileName = "";
        String informationToSave = "software";
        boolean expResult = false;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile8() {
        System.out.println("writeFile");
        String fileName = "file";
        String informationToSave = "software";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile9() {
        System.out.println("writeFile");
        String fileName = ".txt";
        String informationToSave = "software";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testWriteFile10() {
        System.out.println("writeFile");
        String fileName = "file text.txt";
        String informationToSave = "software, 13+|";
        boolean expResult = true;
        boolean result = FileManager.writeFile(fileName, informationToSave);
        assertEquals(expResult, result);
    }

    /**
     * Test of readFile method, of class FileManager.
     */
    /*
    @Test
    public void testReadFile1() {
        System.out.println("readFile");
        String fileName = "file.txt";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReadFile2() {
        System.out.println("readFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReadFile3() {
        System.out.println("readFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReadFile4() {
        System.out.println("readFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReadFile5() {
        System.out.println("readFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReadFile6() {
        System.out.println("readFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReadFile7() {
        System.out.println("readFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReadFile8() {
        System.out.println("readFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileManager.readFile(fileName);
        assertEquals(expResult, result);
    }
*/
}
