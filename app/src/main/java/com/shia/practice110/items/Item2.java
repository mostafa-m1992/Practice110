package com.shia.practice110.items;

public class Item2 {

    private String imgAvatar;
    private String txtName;
    private String txtTime;
    private String txtMessage;

    public Item2(String imgAvatar, String txtName, String txtTime, String txtMessage) {
        this.imgAvatar = imgAvatar;
        this.txtName = txtName;
        this.txtTime = txtTime;
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

    public String getTxtTime() {
        return txtTime;
    }

    public void setTxtTime(String txtTime) {
        this.txtTime = txtTime;
    }

    public String getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }
}
