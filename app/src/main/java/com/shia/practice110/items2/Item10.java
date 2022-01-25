package com.shia.practice110.items2;

public class Item10 {

    private int productImage;
    private String productName;
    private String productMessage;
    private String productPrice;

    public Item10(int productImage, String productName, String productMessage, String productPrice) {
        this.productImage = productImage;
        this.productName = productName;
        this.productMessage = productMessage;
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMessage() {
        return productMessage;
    }

    public void setProductMessage(String productMessage) {
        this.productMessage = productMessage;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
