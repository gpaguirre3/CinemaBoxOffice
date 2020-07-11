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

    private static String fileName;
    private static File file;
    private static boolean answer = true;

    /**
     * This Este método es el constructor de la clase FileManagerLib que nos
     * permite crear un objeto con el nombre del archivo
     *
     * @param fileName file name with file type extension for
     */
    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method is used to create a file verifying if it exists
     *
     * @return false if the file it was not create
     */
    public static boolean createFile() {
        file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
                answer = false;
            }
        }
        return answer;
    }

    /**
     * This method is used to delete a file verifying if it exists
     *
     */
    public static void deleteFile() {
        file = new File(fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("The file " + file + " was delete");
        } else {
            System.out.println("The file " + file + " don't exist");
        }
    }

    /**
     * This method is used to write a text string to a file
     *
     * @param informationToSave is the String of characters to save for
     * @return false if the could not write or find file
     */
    public static boolean writeFile(String informationToSave) {
        createFile();
        try (FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(informationToSave);
            printWriter.close();
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
                answer = false;
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            answer = false;
        }
        return answer;
    }

    /**
     * This method is used to read the information contained in a file
     *
     * @return false if could not read the file
     */
    public static ArrayList<String> readFile() {
        createFile();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            while (bufferReader.readLine() != null) {
                arrayList.add(bufferReader.readLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            answer = false;
        }
        return arrayList;
    }
}
