package com.shia.practice110.items2;

public class Item9 {

    private int productImage;
    private String productName;
    private String productDetail;
    private String productPrice;

    public Item9(int productImage, String productName, String productDetail, String productPrice) {
        this.productImage = productImage;
        this.productName = productName;
        this.productDetail = productDetail;
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

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
