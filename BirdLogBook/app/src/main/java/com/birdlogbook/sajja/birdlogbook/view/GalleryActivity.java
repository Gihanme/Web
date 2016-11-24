package com.birdlogbook.sajja.birdlogbook.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.birdlogbook.sajja.birdlogbook.R;

import java.io.File;
import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {

    private ArrayList<File> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        //Toast.makeText(this,file.toString(),Toast.LENGTH_SHORT).show();

        File file=this.getDir("birdLogBookMyPhoto", Context.MODE_PRIVATE);
        list=imageReader(file);
        guiCreate();

    }
    ArrayList<File> imageReader(File root){
        ArrayList<File> a=new ArrayList<>();
        File[] files=root.listFiles();
        for (int i=0;i<files.length;i++){
            if (files[i].isDirectory()){
                a.addAll(imageReader(files[i]));

            }else {
                if (files[i].getName().endsWith(".jpeg")){
                    a.add(files[i]);
                }
            }
        }
        return a;
    }
    private void viewInMapBtnOnclick(View view){
        Intent intent=new Intent(this,MapGalleryActivity.class);
        startActivity(intent);
    }
    private void guiCreate(){
        gridView=(GridView)findViewById(R.id.gridView);
        viewInMapBtn=(Button)findViewById(R.id.viewInMapBtn);

        viewInMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewInMapBtnOnclick(v);
            }
        });

        gridView.setAdapter(new GridAdapter());
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    startActivity(new Intent(getApplicationContext(),ViewImage.class).putExtra("img",list.get(i).toString()));
            }
        });
    }
    class GridAdapter extends  BaseAdapter{

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.single_grid,viewGroup,false);
            ImageView imageView= (ImageView) view.findViewById(R.id.imageView2);
            imageView.setImageURI(Uri.parse(getItem(i).toString()));
            return view;
        }
    }


    //gui define
    GridView gridView;
    Button viewInMapBtn;

}
