package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        TextView DesplayItem = findViewById(R.id.txtItemdetails);
        DesplayItem.setText(R.string.DesplayItem);

        TextView DesplayCode = findViewById(R.id.displayCode);
        DesplayCode.setText(R.string.DesplayCode);
        TextView DataCode = findViewById(R.id.datacode);
        DataCode.setText(R.string.DataCode);

        TextView DesplayName = findViewById(R.id.displyname);
        DesplayName.setText(R.string.DesplayName);
        TextView DataName = findViewById(R.id.Dataname);
        DataName.setText(R.string.DataName);

        TextView DesplayBrand = findViewById(R.id.dsplyBrand);
        DesplayBrand.setText(R.string.DesplayBrand);
        TextView DataBrand = findViewById(R.id.DataBrand);
        DataBrand.setText(R.string.DataBrand);

        TextView DesplayDiscount = findViewById(R.id.dsplyDiscount);
        DesplayDiscount.setText(R.string.DesplayDiscount);
        TextView DataDiscount = findViewById(R.id.DataDiscount);
        DataDiscount.setText(R.string.DataDiscount);

        TextView DesplayPrice = findViewById(R.id.dsplyPrice);
        DesplayPrice.setText(R.string.DesplayPrice);
        TextView DataPrice = findViewById(R.id.DataPrice);
        DataPrice.setText(R.string.DataPrice);

        TextView DesplayStock = findViewById(R.id.dsplyStock);
        DesplayStock.setText(R.string.DesplayStock);
        TextView DataStock = findViewById(R.id.dataStock);
        DataStock.setText(R.string.DataStock);

        TextView Desplaydiscription = findViewById(R.id.dsplyDescription);
        Desplaydiscription.setText(R.string.Desplaydiscription);
        TextView dataDiscription = findViewById(R.id.dataDescription);
        dataDiscription.setText(R.string.dataDiscription);

        TextView buttondelete = findViewById(R.id.btnDelete);
        buttondelete.setText(R.string.buttonDelete);

        TextView buttonUpdate = findViewById(R.id.btnUpdate);
        buttonUpdate.setText(R.string.buttonUpdate);

        Button button = (Button) findViewById(R.id.btnUpdate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpdate();
            }
        });

    }
    public void openUpdate(){

        Intent intent = new Intent(this, Update.class);
        startActivity(intent);
    }

}