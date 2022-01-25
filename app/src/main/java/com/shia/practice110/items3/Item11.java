package com.shia.practice110.items3;

public class Item11 {

    private int productImage;
    private String productName;
    private String productMessage;
    private String productDetail;

    public Item11(int productImage, String productName, String productMessage, String productDetail) {
        this.productImage = productImage;
        this.productName = productName;
        this.productMessage = productMessage;
        this.productDetail = productDetail;
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

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
}
