package com.birdlogbook.sajja.birdlogbook.controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.birdlogbook.sajja.birdlogbook.db.DataBaseWrapper;
import com.birdlogbook.sajja.birdlogbook.model.Image;

/**
 * Created by sajja on 10/17/2016.
 */
public class loginController {
    private static SQLiteDatabase sqliteDatabase;
    private static DataBaseWrapper dataBaseWrapper;
    private Context mContext;

    public loginController(Context context){
        this.mContext=context;
        dataBaseWrapper =DataBaseWrapper.getHelper(mContext);

    }

    public void open()throws SQLException {
        if (dataBaseWrapper==null){
            dataBaseWrapper=DataBaseWrapper.getHelper(mContext);
        }
        sqliteDatabase= dataBaseWrapper.getWritableDatabase();
    }
    public void close(){
        dataBaseWrapper.close();

    }


}
