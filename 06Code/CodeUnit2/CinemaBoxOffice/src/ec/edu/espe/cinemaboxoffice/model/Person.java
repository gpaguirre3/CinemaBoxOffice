/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public abstract class Person {

    protected String CI;
    protected String name;

    public Person(String id, String name) {
        this.CI = CI;
        this.name = name;
    }

    public String getCI() {
        return CI;
    }

    public String getName() {
        return name;
    }
    
    
}
