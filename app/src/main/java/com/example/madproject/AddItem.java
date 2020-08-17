package com.example.madproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AddItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        TextView AddItem = findViewById(R.id.txtAddItem);
        AddItem.setText(R.string.AddItem);

        TextView ImgButtonAdd = findViewById(R.id.btnimage);
        ImgButtonAdd.setText(R.string.ImgButtonAdd);
        ImgButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ActivityCompat.checkSelfPermission(AddItem.this,
                        Manifest.permission.READ_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED){

                    ActivityCompat.requestPermissions(AddItem.this,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            10);
                    return;
                }
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
                intent.setType("image/*");
                startActivityForResult(intent, 1);
            }
        });
        TextView Itemcode = findViewById(R.id.txtcode);
        Itemcode.setText(R.string.Itemcode);
        EditText Inputcode = (EditText) findViewById(R.id.inptcode);
        Inputcode.setHint(R.string.Inputcode);

        TextView ItemName = findViewById(R.id.txtname);
        ItemName.setText(R.string.ItemName);
        EditText InputName = (EditText) findViewById(R.id.InptName);
        InputName.setHint(R.string.InputName);

        TextView ItemModel = findViewById(R.id.txtmodule);
        ItemModel.setText(R.string.ItemModel);
        EditText InputModel = (EditText) findViewById(R.id.inptModule);
        InputModel.setHint(R.string.InputModel);

        TextView ItemDiscount = findViewById(R.id.txtDiscount);
        ItemDiscount.setText(R.string.ItemDiscount);
        EditText InputDiscount = (EditText) findViewById(R.id.inptDiscount);
        InputDiscount.setHint(R.string.InputDiscount);

        TextView ItemPrice = findViewById(R.id.txtPrice);
        ItemPrice.setText(R.string.ItemPrice);
        EditText InputPrice = (EditText) findViewById(R.id.inptPrice);
        InputPrice.setHint(R.string.InputPrice);

        TextView ItemDiscription = findViewById(R.id.txtdiscription);
        ItemDiscription.setText(R.string.ItemDiscription);
        EditText InputDescription = (EditText) findViewById(R.id.inptDiscription);
        InputDescription.setHint(R.string.InputDescription);

        TextView ItemStock = findViewById(R.id.txtStock);
        ItemStock.setText(R.string.ItemStock);
        EditText InputStock = (EditText) findViewById(R.id.inptStock);
        InputStock.setHint(R.string.InputStock);

        TextView SaveNewItem = findViewById(R.id.btnsave);
        SaveNewItem.setText(R.string.SaveNewItem);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode == 1 && resultCode == RESULT_OK ){

            final ImageView imageview = findViewById(R.id.imgbtnadd);
            final List<Bitmap> bitmaps = new ArrayList<>();
            ClipData clipdata = data.getClipData();
            if (clipdata != null){

                for(int i = 0; i < clipdata.getItemCount(); i++){
                    Uri imageUri = clipdata.getItemAt(i).getUri();
                    try {
                        InputStream is = getContentResolver().openInputStream(imageUri);

                        Bitmap bitmap = BitmapFactory.decodeStream(is);
                        bitmaps.add(bitmap);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                }

            }
            else{

                Uri imageUri = data.getData();
                try {
                    InputStream is = getContentResolver().openInputStream(imageUri);

                    Bitmap bitmap = BitmapFactory.decodeStream(is);
                    bitmaps.add(bitmap);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (final Bitmap b : bitmaps){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                imageview.setImageBitmap(b);
                            }
                        });

                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }
}
