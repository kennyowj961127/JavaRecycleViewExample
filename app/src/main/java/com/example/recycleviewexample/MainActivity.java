package com.example.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Kenny", "kenny@gmail.com", "https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg"));
        contacts.add(new Contact("Kenny1", "kenny1@gmail.com", "https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg"));
        contacts.add(new Contact("Kenny2", "kenny2@gmail.com", "https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg"));
        contacts.add(new Contact("Kenny3", "kenny3@gmail.com", "https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg"));
        contacts.add(new Contact("Kenny4", "kenny4@gmail.com", "https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg"));
        contacts.add(new Contact("Kenny5", "kenny5@gmail.com", "https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg"));
        contacts.add(new Contact("Kenny6", "kenny6@gmail.com", "https://t4.ftcdn.net/jpg/00/53/45/31/360_F_53453175_hVgYVz0WmvOXPd9CNzaUcwcibiGao3CL.jpg"));

        ContactsRecViewAdapter contactsRecViewAdapter = new ContactsRecViewAdapter(this);
        contactsRecViewAdapter.setContacts(contacts);

        contactsRecView.setAdapter(contactsRecViewAdapter);
        // Default is vertical
        // contactsRecView.setLayoutManager(new LinearLayoutManager(this));
        // Change to horizontal
        // contactsRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        // Grid Layout with 2 column
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2 ));
    }
}