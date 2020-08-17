package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        TextView TxtUpdate = findViewById(R.id.txtupdate);
        TxtUpdate.setText(R.string.TxtUpdate);


        TextView DIcode = findViewById(R.id.txtUCode);
        DIcode.setText(R.string.DIcode);
        TextView DDCode = findViewById(R.id.dUcode);
        DDCode.setText(R.string.DDCode);


        TextView DIName = findViewById(R.id.txtUName);
        DIName.setText(R.string.DIName);
        TextView DDName = findViewById(R.id.DUName);
        DDName.setText(R.string.DDName);


        TextView DIBrand = findViewById(R.id.txtBrand);
        DIBrand.setText(R.string.DIBrand);
        TextView DDBrand = findViewById(R.id.txtDBrand);
        DDBrand.setText(R.string.DDBrand);


        TextView DIDiscription = findViewById(R.id.txtDescription);
        DIDiscription.setText(R.string.DIDiscription);
        TextView DDDiscription = findViewById(R.id.dUcode);
        DDDiscription.setText(R.string.DDDiscription);

        TextView UpDiscount = findViewById(R.id.UpDiscount);
        UpDiscount.setText(R.string.UpDiscount);
        EditText UpdDiscount = (EditText) findViewById(R.id.upDiscount);
        UpdDiscount.setHint(R.string.UpdDiscount);

        TextView upPrice = findViewById(R.id.UpPrice);
        upPrice.setText(R.string.upPrice);
        EditText updPrice = (EditText) findViewById(R.id.upPrice);
        updPrice.setHint(R.string.updPrice);

        TextView upStock = findViewById(R.id.UpStock);
        upStock.setText(R.string.upStock);
        EditText updstock = (EditText) findViewById(R.id.uppStock);
        updstock.setHint(R.string.updstock);

        TextView ButtonUpdate = findViewById(R.id.btnUpdate);
        ButtonUpdate.setText(R.string.ButtonUpdate);



    }
}