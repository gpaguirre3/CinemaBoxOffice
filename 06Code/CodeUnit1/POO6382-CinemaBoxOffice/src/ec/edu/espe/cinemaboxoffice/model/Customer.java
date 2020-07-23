/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Customer {

    private String id;
    private String name;
    private int age;

    public Customer(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Customer() {
        
    }

    @Override
    public String toString() {
        return "Client data:{" +id + ", name=" + name + ", age=" + age + '}';
    }

    public void exitBillboard() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
