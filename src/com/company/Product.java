 package com.company;

import java.util.Scanner;

public class Product {
    private int productCode;
    private String productName;
    private float price;
    private float discount;

    //Constructor
    public Product() {

    }
    public Product(int productCode, String productName, float price, float discount) {
        super();
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
    }

    //Getters and Setters
    public int getProductCode() {
        return productCode;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    //Method accept product
    public void acceptProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter code:");
        setProductCode(input.nextInt());
        input.nextLine();
        System.out.println("Enter name: ");
        setProductName(input.nextLine());
        System.out.println("Enter price: ");
        setProductName(input.nextLine());
        System.out.println("Enter discount: ");
        setProductName(input.nextLine());



    }
    //Method print() to show product details
    public void print() {
        System.out.println("Code: "+this.productCode);
        System.out.println("Name: "+ this.productName);
        System.out.println("Price: "+this.price);
        System.out.println("Discount: "+this.discount+"%");
    }
    //Method getRealPrice()
    public float getRealPrice() {
        float realPrice = (price - price * discount/100);
        return realPrice;
    }

}