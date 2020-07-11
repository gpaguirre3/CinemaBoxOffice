/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanagerlibrary;

import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class TestClass {
    public static void main(String[] args) {
        ArrayList<String> as = new  ArrayList<>();
        FileManagerLib file = new FileManagerLib("test.txt");
        as.add("esto,es,una,prueba");
        as.add("esto2,es2,una2,prueba2");
        as.add("esto3,es3,una3,prueba3");
        FileManagerLib.rewriteFile(as);
        as = FileManagerLib.readFile();
        System.out.println("res = " + as.toString());
        System.out.println(FileManagerLib.findRecord("prueba"));
    }
}
