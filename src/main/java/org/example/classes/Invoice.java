package org.example.classes;

public class Invoice {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public Invoice(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getDesc(){
        return this.desc;
    }

    public String getId(){
        return this.id;
    }

    public int getQty(){
        return this.qty;
    }

    public double getTotal(){
        return this.qty * this.unitPrice;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

}