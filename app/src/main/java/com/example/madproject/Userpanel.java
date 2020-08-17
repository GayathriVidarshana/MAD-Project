package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Userpanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpanel);

        TextView buttonuser = findViewById(R.id.btnAddUser);
        buttonuser.setText(R.string.AddUser);

        Button button = (Button)findViewById(R.id.btnAddUser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 openAddNewUser();
            }
        });

        EditText searchUser = (EditText)findViewById(R.id.inputUsrename);
        searchUser.setHint(R.string.SearchUsre);

        TextView buttonsearchr = findViewById(R.id.btnSearch);
        buttonsearchr.setText(R.string.btnSearch);

        Button button1 = (Button)findViewById(R.id.btnSearch);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserDetails();
            }
        });

        TextView texVUser = findViewById(R.id.txtVuser);
        texVUser.setText(R.string.TxtVUsre);
    }


    public void openAddNewUser(){

        Intent intent = new Intent(this, AddNewUser.class);
        startActivity(intent);
    }

    public void openUserDetails(){

        Intent intent = new Intent(this, UserDetails.class);
        startActivity(intent);
    }
}