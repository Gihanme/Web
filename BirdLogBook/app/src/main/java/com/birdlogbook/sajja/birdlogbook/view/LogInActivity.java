package com.birdlogbook.sajja.birdlogbook.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.birdlogbook.sajja.birdlogbook.R;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        guiCreat();
    }
    private void offLineButtonOnclick(View view){

        startActivity(new Intent(this,MainMenuActivity.class));
    }
    private void createAccButtonOnclick(View view){
        startActivity(new Intent(this,SignInActivity.class));

    }
    private void loginButtonOnclick(View view){
        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();

        if(!email.equals("") && !password.equals("")){
            startActivity(new Intent(this,MainMenuActivity.class));
        }else {
            Toast.makeText(this,"enter email and password", Toast.LENGTH_SHORT).show();
        }


    }
    private void guiCreat(){
        emailText=(TextView) findViewById(R.id.emailText);
        passwordText=(TextView)findViewById(R.id.passwordText);
        createAccButton=(Button)findViewById(R.id.createAccBtn);
        logInButton=(Button)findViewById(R.id.logInBtn);
        offlineButton=(Button)findViewById(R.id.offLineBtn);

        progressDialog=new ProgressDialog(this);


        emailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //emailTextOnclick(v);

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
                createAccButtonOnclick(v);
            }
        });
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // logInButtonOnClick(v);
            }
        });
        offlineButton.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               offLineButtonOnclick(v);
            }
        });

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginButtonOnclick(view);
            }
        });

    }

    //guiDefine
    private TextView emailText;
    private TextView passwordText;
    private Button createAccButton;
    private Button offlineButton;
    private Button logInButton;
    private ProgressDialog progressDialog;

}
