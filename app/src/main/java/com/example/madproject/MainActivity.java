package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtview = findViewById(R.id.txtviewD);
        txtview.setText(R.string.txtview);

        TextView ButtonItem = findViewById(R.id.btnitem);
        ButtonItem.setText(R.string.ButtonItem);

        Button button =(Button) findViewById(R.id.btnitem);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openItem();
            }
        });


        TextView ButtonUser = findViewById(R.id.btnuser);
        ButtonUser.setText(R.string.ButtonUser);

        Button button1 = (Button) findViewById(R.id.btnuser);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openUserpanel();
            }
        });

    }

    public void openItem() {

        Intent intent = new Intent(this, Item.class);
        startActivity(intent);
    }

    public void openUserpanel(){

        Intent intent = new Intent(this, Userpanel.class);
        startActivity(intent);
    }


}