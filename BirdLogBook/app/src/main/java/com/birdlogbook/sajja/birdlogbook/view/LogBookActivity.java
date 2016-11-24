package com.birdlogbook.sajja.birdlogbook.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.birdlogbook.sajja.birdlogbook.R;
import com.birdlogbook.sajja.birdlogbook.controller.LogNoteController;
import com.birdlogbook.sajja.birdlogbook.model.LogNote;
import com.birdlogbook.sajja.birdlogbook.validation.SpinnerListCreate;

import java.util.ArrayList;
import java.util.List;

public class LogBookActivity extends AppCompatActivity {
    private LogNoteController logNoteController=null;
    private LogNote logNote=null;
    private ArrayList<LogNote> logNotesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_book);
        guiCreate();

        //set serchby Spinner
        List<String> searchByList = SpinnerListCreate.setSearchBy();
        ArrayAdapter<String> seachByArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,searchByList);
        seachByArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        searchSpinner.setAdapter(seachByArrayAdapter);


    }
    private void searchByButtonOnclick(View view){
        String selectItem = searchSpinner.getSelectedItem().toString();
        if(selectItem=="date"){



        }else if(selectItem=="Province") {

        }
        else if(selectItem=="City") {

        }
        else if(selectItem=="Bird Name") {
            try {
                logNote=new LogNote();
                logNote.setName(selectItem);
                logNoteController=new LogNoteController(this);
                logNotesList= logNoteController.getAllByName(logNote);

            }finally {
                if (logNoteController!=null){
                    logNoteController.close();
                }

            }

        }
        else if(selectItem=="Habitat") {

        }
        else if(selectItem=="Elevation") {

        }
        else if(selectItem=="Temperature") {

        }
        else if(selectItem=="Shape") {

        }
    }



    private void guiCreate(){
        searchButton=(Button)findViewById(R.id.searchButton);

        searchSpinner=(Spinner)findViewById(R.id.searchBySpinner);

        searchText=(EditText)findViewById(R.id.searchText);

        imageView=(ImageView)findViewById(R.id.logBookImageView);

        textView1=(TextView)findViewById(R.id.logBookTextView1);
        textView2=(TextView)findViewById(R.id.logBookTextView2);
        textView3=(TextView)findViewById(R.id.logBookTextView3);

        gridView=(GridView)findViewById(R.id.logBookGridView);
        gridView.setAdapter(new GridAdapter());

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchByButtonOnclick(view);
            }
        });

    }
    class GridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }

    //gui define
    private EditText searchText;
    private Spinner searchSpinner;
    private Button searchButton;

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    private ImageView imageView;

    private GridView gridView;

}
