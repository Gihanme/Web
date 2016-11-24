package com.birdlogbook.sajja.birdlogbook.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.birdlogbook.sajja.birdlogbook.R;
import com.birdlogbook.sajja.birdlogbook.controller.ImageController;
import com.birdlogbook.sajja.birdlogbook.model.Image;

import java.io.File;

public class ViewImage extends AppCompatActivity {
    private  ImageController imageController=null;
    private Image image=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);
        guiCreate();
        //Intent i=getIntent();
        //File f=i.getExtras().getParcelable("img");
        String imageUri=getIntent().getStringExtra("img");
        imageView.setImageURI(Uri.parse(imageUri));


        //set image details
        try {
           imageController=new ImageController(this);
            image=new Image();

            //get image name from image uri
            String[] split = imageUri.split("/");

              // Toast.makeText(this, split[5],Toast.LENGTH_LONG).show();
               image.setphotoDir(split[5]);


            image = imageController.getAllByPhotoDir(image);

         if (image!=null){
               // Toast.makeText(this,image.getDate(),Toast.LENGTH_SHORT).show();
             lxView.setText(String.valueOf(image.getxI()));
                lyView.setText(String.valueOf( image.getyI()));
                dateView.setText(image.getDate());
                timeView.setText(image.getTime());
            }


        }finally {
         //   if (imageController!=null){
           //     imageController.close();
           // }
           // if (image!=null){

//            }
       }



    }
    private void guiCreate(){
        imageView=(ImageView)findViewById(R.id.imageView3);

        lxView=(TextView)findViewById(R.id.lxView);
        lyView=(TextView)findViewById(R.id.lyView);
        dateView=(TextView) findViewById(R.id.dateView);
        timeView=(TextView) findViewById(R.id.timeView);

    }

    //gui define
    private ImageView imageView;

    private TextView lxView;
    private TextView lyView;
    private TextView dateView;
    private TextView timeView;



}
