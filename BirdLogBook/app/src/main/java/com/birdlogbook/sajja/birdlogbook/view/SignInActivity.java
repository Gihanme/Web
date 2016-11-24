package com.birdlogbook.sajja.birdlogbook.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.birdlogbook.sajja.birdlogbook.R;
import com.birdlogbook.sajja.birdlogbook.validation.SpinnerListCreate;

import java.util.List;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        guiCreate();

        //set user List
        List<String> userList = SpinnerListCreate.setUserType();
        ArrayAdapter<String> userListArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,userList);
        userListArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        userTypeSpinner.setAdapter(userListArrayAdapter);
    }
    public void signInButtonOnclick(View view){
        startActivity(new Intent(this,MainMenuActivity.class));
    }

    private void guiCreate(){

        userTypeSpinner=(Spinner)findViewById(R.id.userTypeSpinner);

        progressDialog=new ProgressDialog(this);

        signInButton=(Button)findViewById(R.id.signInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signInButtonOnclick(view);
            }
        });



      /*  emailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // emailTextOnclick(v);

            }
        });
        passwordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // passwordOnclick(v);
            }
        });
        createAccButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // createAccButtonOnclick(v);
            }
        });
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  logInButtonOnClick(v);
            }
        });
        offlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // offLineButtonOnclick(v);
            }
        });*/

    }

    //guiDefine
    private TextView emailText;
    private TextView passwordText;
    private Button createAccButton;
    private Button offlineButton;
    private Button logInButton;
    private ProgressDialog progressDialog;
    private Button signInButton;
    private Spinner userTypeSpinner;
}

