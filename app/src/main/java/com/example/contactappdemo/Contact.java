package com.example.contactappdemo;

public class Contact {

    private String name, phoneno;
    private int photo;

    public Contact() {
    }

    public Contact(String name, String phoneno, int photo) {
        this.name = name;
        this.phoneno = phoneno;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public int getPhoto() {
        return photo;
    }
}
