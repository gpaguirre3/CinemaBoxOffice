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
public class Bill {
    private Customer customer;
    private int idBill;
    private float priceToPay;
    private Payment payment;

    public Bill(Customer customer, int idBill, float priceToPay, Payment payment) {
        this.customer = customer;
        this.idBill = idBill;
        this.priceToPay = priceToPay;
        this.payment = payment;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    public void showBillData(){
        
    }
    
    public void saveBill(){
        
    }
}
