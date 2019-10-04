package com.example.contactappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetailsActivity extends AppCompatActivity {

    private ImageView photoIV;
    private TextView nameTV,phonenoTV;
    private String name, phone, photo, number;
    private int photoLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        
        init();

        getData();

        setData();
    }

    private void getData() {
        name = getIntent().getStringExtra("name");
        phone = getIntent().getStringExtra("phone");
        photo = getIntent().getStringExtra("image");
        photoLink = Integer.parseInt(photo);
    }

    private void setData() {
        nameTV.setText(name);
        phonenoTV.setText(phone);
        photoIV.setImageResource(photoLink);
    }


    private void init() {

        photoIV = findViewById(R.id.photoIV);
        nameTV = findViewById(R.id.nameTV);
        phonenoTV = findViewById(R.id.phonenoTV);
    }

}
