package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        TextView txtviewItem = findViewById(R.id.txtVitem);
        txtviewItem.setText(R.string.txtviewItem);

        TextView btnAddItem = findViewById(R.id.btnAddItem);
        btnAddItem.setText(R.string.btnAddItem);

        Button button = (Button) findViewById(R.id.btnAddItem);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                openAddItem();

            }
        });

        EditText SearchItem = (EditText) findViewById(R.id.searchItem);
        SearchItem.setHint(R.string.SearchItem);

        TextView ButtonSearch = findViewById(R.id.btnsearch);
        ButtonSearch.setText(R.string.ButtonSearch);

        Button button1 =(Button) findViewById(R.id.btnsearch);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                openItemDetails();
            }
        });

    }

    public void openItemDetails(){

        Intent intent = new Intent(this, ItemDetails.class);
        startActivity(intent);
    }

   public void openAddItem() {

        Intent intent = new Intent(this, AddItem.class);
        startActivity(intent);
    }
}