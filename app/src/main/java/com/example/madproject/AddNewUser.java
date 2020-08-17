package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddNewUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_user);

        TextView txtVaddnewUser = findViewById(R.id.txtVaddNewUser);
        txtVaddnewUser.setText(R.string.txtVAddUser);

        TextView txtaddnewUser = findViewById(R.id.addUName);
        txtaddnewUser.setText(R.string.UserName);
        EditText inputusrename =(EditText) findViewById(R.id.EnterUName);
        inputusrename.setHint(R.string.EnterUserName);

        TextView userPhone = findViewById(R.id.uPhone);
        userPhone.setText(R.string.userPhone);
        EditText InputPhone =(EditText) findViewById(R.id.inputPhone);
        InputPhone.setHint(R.string.InputPhone);

        TextView UserEmail = findViewById(R.id.Uemail);
        UserEmail.setText(R.string.UserEmail);
        EditText InputEmail =(EditText) findViewById(R.id.inputEmail);
        InputEmail.setHint(R.string.InputEmail);

        TextView UserPassword = findViewById(R.id.Upaswrd);
        UserPassword.setText(R.string.UserPassword);
        EditText inputPswrd =(EditText) findViewById(R.id.inputpawrd);
        inputPswrd.setHint(R.string.inputPswrd);

        TextView btnsave = findViewById(R.id.btnSave);
        btnsave.setText(R.string.saveUser);







    }
}