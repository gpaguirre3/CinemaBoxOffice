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
public abstract class  Ticket {

    protected String gender;
    protected String title;
    protected String ageRestriction;
    protected int duration;
    protected String namePoster;
    private int code;
    private MovieBillboard movie;

    public Ticket(String gender, String title, String ageRestriction, int duration, String namePoster) {
        this.gender = gender;
        this.title = title;
        this.ageRestriction = ageRestriction;
        this.duration = duration;
        this.namePoster = namePoster;
    }

    public Ticket(int code, MovieBillboard movie) {
        this.code = code;
        this.movie = movie;
    }  
}
