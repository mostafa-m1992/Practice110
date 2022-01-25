package com.shia.practice110.items2;

public class Item6 {

    private int userAvatar;
    private String userName;
    private String userMessage;
    private String userTime;

    public Item6(int userAvatar, String userName, String userMessage, String userTime) {
        this.userAvatar = userAvatar;
        this.userName = userName;
        this.userMessage = userMessage;
        this.userTime = userTime;
    }

    public int getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(int userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }
}
