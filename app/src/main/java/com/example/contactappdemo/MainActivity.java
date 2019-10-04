package com.example.contactappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> contacts;
    private RecyclerView recyclerView;
    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setData();
    }

    private void setData() {

        contacts.add(new Contact("Batman", "01684111111", R.drawable.batman));
        contacts.add(new Contact("Black Panther", "01684111111", R.drawable.blackpanther));
        contacts.add(new Contact("Captain America", "01684111111", R.drawable.captainamerica));
        contacts.add(new Contact("Ironman", "01684111111", R.drawable.ironman));
        contacts.add(new Contact("Magneto", "01684111111", R.drawable.magneto));
        contacts.add(new Contact("Venom", "01684111111", R.drawable.vanom));

        adapter.notifyDataSetChanged();
    }

    private void init() {
        contacts = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclearview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ContactAdapter(contacts, this);
        recyclerView.setAdapter(adapter);
    }
}
