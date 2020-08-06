/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.showbilldata.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.cinemaboxoffice.utils.CardAndCIValidation;
import java.util.ArrayList;

/**
 *
 * @author Jhoel Chicaiza
 */
public class Bill {

    private Customer customer;
    private int billId;
    private float priceToPay;

    Payment payment = new Payment();
    InputValidation in = new InputValidation();
    FileManager file;

    

    public String showBillData(float moviePriceTicket) {
        
        Gson gson =new GsonBuilder().setPrettyPrinting().create();
        String customerId;
        String customerName;
        int customerAge;
        boolean statement = false;

        do {
            customerId = in.getString("3");
        } while (!CardAndCIValidation.validateCI(customerId));
        customerName = in.getString("Enter your name: ");
        customerAge = in.getInt("Enter your age: ", 2);
        ArrayList<Customer> bills = new ArrayList<>();
        bills.add(new Customer(customerId, customerName, customerAge));
        payment.createPayment(statement);
        if (statement == true) {
            file = new FileManager();
            String JsonString = gson.toJson(bills);
            FileManager.writeFile(customerName + ".json", JsonString);
            String JsonStringPayment = gson.toJson(payment);
            FileManager.writeFile(customerName + ".json", JsonStringPayment);
            FileManager.writeFile(customerName + ".json", "The price to cancel is:" + moviePriceTicket);
        } else {
            System.out.println("Bill not created because the payment wasn't succesful");
        }
        return null;

    }
}
