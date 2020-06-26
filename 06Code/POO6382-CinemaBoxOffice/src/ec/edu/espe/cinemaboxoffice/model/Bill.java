/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Bill {

    private Customer customer;
    private int idBill;
    private float priceToPay;
    private Payment payment;

    Keyboard in = new Keyboard();
    FileManagerLib file;

    public Bill(Customer customer, int idBill, float priceToPay) {
        this.customer = customer;
        this.idBill = idBill;
        this.priceToPay = priceToPay;
    }

    public String showBillData(float moviePriceTicket) {

        boolean repeat = false;
        String customerId;
        String customerName;
        int customerAge;

        customerId = in.getString("Enter your ID:");
        customerName = in.getString("Enter your name:");
        customerAge = in.getInt("Enter your age", 2);
        customer = new Customer(customerId, customerName, customerAge);
        payment.createPayment();
        if () {
            file = new FileManagerLib(customerName + ".csv");
            FileManagerLib.writeFile(customer.toString());
            FileManagerLib.writeFile("The price to cancel is:" + moviePriceTicket);
        } else {
            System.out.println("Bill not created because the payment wasn't succesful");
        }
        return null;

    }

    public void saveBill() {

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
