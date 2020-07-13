/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * CopyrightESPE-DECC
 */
package ec.edu.espe.filemanagerlibrary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>This is kevin Chuquimarca FileManager class</h1>
 * Create, read, delete, and search for file information
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 * @version 0.1
 * @since 2020-06-24
 */
public class FileManager {

    private static File file;
    private static boolean answer = false;

    /**
     * This method is used to create a file verifying if it exists
     *
     * @param fileName
     * @return false if the file it was not create
     */
    public static boolean createFile(String fileName) {
        file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                answer = true;
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return answer;
    }

    /**
     * This method is used to delete a file verifying if it exists
     *
     * @param fileName
     * @return
     */
    public static boolean deleteFile(String fileName) {
        file = new File(fileName);
        if (file.exists()) {
            file.delete();
            answer = true;
        }
        return answer;
    }

    /**
     * This method is used to write a text string to a file
     *
     * @param fileName
     * @param informationToSave is the String of characters to save for
     * @return false if the could not write or find file
     */
    public static boolean writeFile(String fileName, String informationToSave) {
        createFile(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(informationToSave);
            printWriter.close();
            answer = true;
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }

    /**
     * This method is used to read the information contained in a file
     *
     * @param fileName
     * @return false if could not read the file
     */
    public static ArrayList<String> readFile(String fileName) {
        createFile(fileName);
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            answer = true;
            String line;
            while ((line = bufferReader.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
}
