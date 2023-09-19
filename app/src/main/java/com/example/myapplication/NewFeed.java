package com.example.myapplication;

public class NewFeed {

    private  String userName, content, avatar, img;

    public NewFeed() {
    }

    public NewFeed(String userName, String content, String avatar, String img) {
        this.userName = userName;
        this.content = content;
        this.avatar = avatar;
        this.img = img;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "NewFeed{" +
                "userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

}
