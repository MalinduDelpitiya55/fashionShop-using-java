/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_COURSE_WORK;

/**
 *
 * @author pc
 */
public class CustomerDetails {
    private String orderID;
    private String cusID;
    private double amount;
    private int qty;
    private String status;
    private String size;
    
    public CustomerDetails(String orderID, String cusID, double amount, int qty, String size, String status) {
        this.orderID = orderID;
        this.cusID = cusID;
        this.amount = amount;
        this.qty = qty;
        this.status = status;
        this.size = size;
    }
    public CustomerDetails() {
    }
    public String getOdrId() {
        return orderID;
    }
    public String getCusID() {
        return cusID;
    }
    public double getAmount() {
        return amount;
    }
    public int getQTY() {
        return qty;
    }
    public String getStatus() {
        return status;
    }
    public String getSize() {
        return size;
    }
    public void setOdrId(String orderID) {
        this.orderID = orderID;
    }
    public void setCusID(String cusID) {
        this.cusID = cusID;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setQTY(int qty) {
        this.qty = qty;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "Order ID    : " + orderID + "\n" + "Phone Number   : " + cusID + "\n" + "Size : " + size + "\n" + "QTY   : " + qty + "\n" + "Amount  : " + amount + "\n" + "Status  : " + status + "\n\n";
    }
}



