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
    private int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
