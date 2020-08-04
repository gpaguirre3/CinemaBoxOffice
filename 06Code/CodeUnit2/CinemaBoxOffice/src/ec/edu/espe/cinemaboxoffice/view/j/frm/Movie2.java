/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view.j.frm;

/**
 *
 * @author Josue
 */
public class Movie2 {

    private String title;
    private String duration;
    private String ageRestriction;
    private String sinopsis;
    private String gender;

    public Movie2(String name, String gender, String duration, String ageString, String sinopsis) {
        this.title = name;
        this.duration = duration;
        this.ageRestriction = ageString;
        this.sinopsis = sinopsis;
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + title + ", duration=" + duration + ", ageRestriction=" + ageRestriction + ", sinopsis=" + sinopsis + ", gender=" + gender + '}';
    }

}
