/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import ec.edu.espe.cinemaboxoffice.utils.SpecialValidation;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Bill {

    private Customer customer;
    private int idBill;
    private float priceToPay;

    Payment payment = new Payment();
    DataValidation in = new DataValidation();
    FileManagerLib file;

    public Bill(Customer customer, int idBill, float priceToPay) {
        this.customer = customer;
        this.idBill = idBill;
        this.priceToPay = priceToPay;
    }

    public String showBillData(float moviePriceTicket) {

        String customerId;
        String customerName;
        int customerAge;
        boolean statement = false;

        do {
            customerId = in.getString("Enter your ID:");
        } while (!SpecialValidation.validateCI(customerId));
        customerName = in.getString("Enter your name:");
        customerAge = in.getInt("Enter your age", 2);
        customer = new Customer(customerId, customerName, customerAge);
        payment.createPayment(statement);
        if (statement = true) {
            file = new FileManagerLib(customerName + ".csv");
            FileManagerLib.writeFile(customer.toString());
            FileManagerLib.writeFile(payment.toString());
            FileManagerLib.writeFile("The price to cancel is:" + moviePriceTicket);
        } else {
            System.out.println("Bill not created because the payment wasn't succesful");
        }
        return null;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public float getPriceToPay() {
        return priceToPay;
    }

    public void setPriceToPay(float priceToPay) {
        this.priceToPay = priceToPay;
    }
}
