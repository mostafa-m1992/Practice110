package com.shia.practice110.items;

public class Item1 {

    private String imgAvatar;
    private String txtName;
    private String txtData;
    private String txtMessage;

    public Item1(String imgAvatar, String txtName, String txtData, String txtMessage) {
        this.imgAvatar = imgAvatar;
        this.txtName = txtName;
        this.txtData = txtData;
        this.txtMessage = txtMessage;
    }

    public String getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(String imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtData() {
        return txtData;
    }

    public void setTxtData(String txtData) {
        this.txtData = txtData;
    }

    public String getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }
}
