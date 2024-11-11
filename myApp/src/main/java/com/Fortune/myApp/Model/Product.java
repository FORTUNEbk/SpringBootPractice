package com.Fortune.myApp.Model;


public class Product {
    private int prodId;
    private String prodName;
    private int Price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        Price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return Price;
    }
}
