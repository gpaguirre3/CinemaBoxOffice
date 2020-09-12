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
import ec.edu.espe.cinemaboxoffice.model.CinemaRoom;
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

    
    public void saveUsers(String username, String password, String id, String name) {
        BasicDBObject document = new BasicDBObject();
        document.put("userName", username);
        document.put("password", password);
        document.put("id", id);
        document.put("name", name);
        collectionName.insert(document);
    }

    public void saveMovies(String title, String gender, String age,
            int duration, String namePoster, String sinopsis, Date date, String price, CinemaRoom room) {
        BasicDBObject document = new BasicDBObject();
        document.put("title", title);
        document.put("gender", gender);
        document.put("ageRestriction", age);
        document.put("price", price);
        document.put("duration", duration);
        //document.put("roomNumber", room);
        document.put("sinopsis", sinopsis);
        document.put("Date", date);
        document.put("NamePoster", namePoster);
        collectionName.insert(document);
    }

    public void saveNextPremier(String title, String gender, String age, int duration, String namePoster, Date dateNextPremier) {
        BasicDBObject document = new BasicDBObject();
        document.put("title", title);
        document.put("gender", gender);
        document.put("ageRestriction", age);
        document.put("duration", duration);
        document.put("NamePoster", namePoster);
        document.put("Date", dateNextPremier);
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
