/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.cinemaboxoffice.model.Admin;
import ec.edu.espe.cinemaboxoffice.model.CinemaRoom;
import ec.edu.espe.cinemaboxoffice.model.MovieBillboard;
import ec.edu.espe.cinemaboxoffice.model.NextPremier;
import ec.edu.espe.cinemaboxoffice.view.FrmAdminLogin;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josue Aleman ESPE.
 */
public class DBManager {

    Mongo mongo;
    DB CinemaBox;
    DBCollection collectionName;

    public void connectToMongo() {
        try {
            mongo = new Mongo("localhost", 27017);
        } catch (UnknownHostException ex) {
            Logger.getLogger(FrmAdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveFile(String collection) {

        connectToMongo();
        this.CinemaBox = mongo.getDB("CinemaBox");
        this.collectionName = this.CinemaBox.getCollection(collection);

    }
    
    public void saveAdmin(Admin admin){
        BasicDBObject document = new BasicDBObject();
        document.put("userName", admin.getUserName());
        document.put("password", admin.getPassword());
        document.put("id", admin.getId());
        document.put("name", admin.getName());
        collectionName.insert(document);
    }
    
    public void saveMovie(MovieBillboard movie){
        BasicDBObject document = new BasicDBObject();
        document.put("title", movie.getTitle());
        document.put("gender", movie.getGender());
        document.put("ageRestriction", movie.getAgeRestriction());
        document.put("price", movie.getPrice());
        document.put("duration", movie.getDuration());
        //document.put("roomNumber", room);
        document.put("sinopsis", movie.getSinopsis());
        document.put("Date", movie.getDate());
        document.put("NamePoster", movie.getNamePoster());
        collectionName.insert(document);
    }
    
    public void saveNextPremier(NextPremier premier){
        BasicDBObject document = new BasicDBObject();
        document.put("title", premier.getTitle());
        document.put("gender", premier.getGender());
        document.put("ageRestriction", premier.getAgeRestriction());
        document.put("duration", premier.getDuration());
        document.put("NamePoster", premier.getNamePoster());
        document.put("Date", premier.getDate());
        collectionName.insert(document);
    }

    public void saveBill(String customerName, String iCard, String title, String price) {

        BasicDBObject document = new BasicDBObject();
        document.put("Customer", customerName);
        document.put("Identify Card", iCard);
        document.put("Movie title", title);
        document.put("Price", price);
        collectionName.insert(document);
    }
}
