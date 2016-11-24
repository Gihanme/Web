package com.birdlogbook.sajja.birdlogbook.controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.birdlogbook.sajja.birdlogbook.db.DataBaseWrapper;
import com.birdlogbook.sajja.birdlogbook.model.LogNote;

import java.util.ArrayList;

/**
 * Created by sajja on 9/7/2016.
 */
public class LogNoteController {
    private static DataBaseWrapper dataBaseWrapper;
    private static SQLiteDatabase sqLiteDatabase;
    private static Context mContext;


    public LogNoteController(Context context){
        this.mContext=context;
        dataBaseWrapper=DataBaseWrapper.getHelper(mContext);

    }
    public static void openWritable(){
        if (sqLiteDatabase==null){
            dataBaseWrapper=DataBaseWrapper.getHelper(mContext);
        }
        sqLiteDatabase=dataBaseWrapper.getWritableDatabase();

    }
    public static void openReadable(){
        if (sqLiteDatabase==null){
            dataBaseWrapper=DataBaseWrapper.getHelper(mContext);
        }
        sqLiteDatabase=dataBaseWrapper.getReadableDatabase();

    }
    public void close(){
        sqLiteDatabase.close();
    }

    public static boolean addLogNote(LogNote logNote) {
        openWritable();
        ContentValues values=null;
        try {

            values = new ContentValues();
            values.put("iid", logNote.getiID());
            values.put("date", logNote.getDate());
            values.put("time", logNote.getTime());
            values.put("province", logNote.getProvince());
            values.put("nearestCity", logNote.getNearestCity());
            values.put("lx", logNote.getlX());
            values.put("ly", logNote.getlY());
            values.put("temperature", logNote.getTemperature());
            values.put("elevation", logNote.getElevation());
            values.put("habitat", logNote.getHabitat());
            values.put("name", logNote.getName());
            values.put("looksLike", logNote.getLooksLike());
            values.put("sizeWidth", logNote.getSizeWidth());
            values.put("sizeHight", logNote.getSizeHight());
            values.put("shape", logNote.getShape());
            values.put("colour", logNote.getColour());
            values.put("behaviour", logNote.getBehaviour());
            values.put("otherNote", logNote.getOtherNote());

            long result = sqLiteDatabase.insert("logNote", null, values);
            if (result > 0) {
                return true;
            }
            return false;
        }finally {
            if (values!=null){

            }
        }

    }
    public static boolean deleteLogNoteDetail(String lNID){
        openWritable();
        int result = sqLiteDatabase.delete("logNote", "inid=" + lNID, null);
        if (result>0){
            return true;
        }
        return false;
    }
    public static boolean upDateLogNote(LogNote logNote){
        openWritable();
        ContentValues values=null;
        try {

            values = new ContentValues();
            values.put("iid", logNote.getiID());
            values.put("date", logNote.getDate());
            values.put("time", logNote.getTime());
            values.put("province", logNote.getProvince());
            values.put("nearestCity", logNote.getNearestCity());
            values.put("lx", logNote.getlX());
            values.put("ly", logNote.getlY());
            values.put("temperature", logNote.getTemperature());
            values.put("elevation", logNote.getElevation());
            values.put("habitat", logNote.getHabitat());
            values.put("name", logNote.getName());
            values.put("looksLike", logNote.getLooksLike());
            values.put("sizeWidth", logNote.getSizeWidth());
            values.put("sizeHight", logNote.getSizeHight());
            values.put("shape", logNote.getShape());
            values.put("colour", logNote.getColour());
            values.put("behaviour", logNote.getBehaviour());
            values.put("otherNote", logNote.getOtherNote());

            long result = sqLiteDatabase.update("logNote", null,"lnid=?" ,new String[]{String.valueOf(logNote.getlNID())});
            if (result > 0) {
                return true;
            }
            return false;
        }finally {
            if (values!=null){

            }
        }

    }
    public LogNote searchByLNID(LogNote logNote){
        openReadable();
        try {
            Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM lognote WHERE lnid='"+logNote.getlNID()+"'",null);
           LogNote res = null;
            while (cursor.moveToNext()){
                res.setiID(cursor.getInt(1));
                res.setDate(cursor.getString(2));
                res.setDate(cursor.getString(3));
                res.setProvince(cursor.getString(4));
                res.setNearestCity(cursor.getString(5));
                res.setlX(cursor.getDouble(6));
                res.setlY(cursor.getDouble(7));
                res.setTemperature(cursor.getDouble(8));
                res.setElevation(cursor.getString(9));
                res.setHabitat(cursor.getString(10));
                res.setName(cursor.getString(12));
                res.setLooksLike(cursor.getString(13));
                res.setSizeWidth(cursor.getDouble(14));
                res.setSizeHight(cursor.getDouble(15));
                res.setShape(cursor.getString(16));
                res.setColour(cursor.getString(17));
                res.setBehaviour(cursor.getString(18));
                res.setOtherNote(cursor.getString(19));

            }
            return (LogNote) res;
        }finally {

        }
    }

   public ArrayList<LogNote> getAllByName(LogNote logNote){
       openReadable();
       try {
            Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM lognote WHERE lnid='"+logNote.getName()+"'",null);
            LogNote res = null;
            ArrayList<LogNote> logNotes=new ArrayList<>();
            while (cursor.moveToNext()){
                res.setiID(cursor.getInt(1));
                res.setDate(cursor.getString(2));
                res.setDate(cursor.getString(3));
                res.setProvince(cursor.getString(4));
                res.setNearestCity(cursor.getString(5));
                res.setlX(cursor.getDouble(6));
                res.setlY(cursor.getDouble(7));
                res.setTemperature(cursor.getDouble(8));
                res.setElevation(cursor.getString(9));
                res.setHabitat(cursor.getString(10));
                res.setName(cursor.getString(12));
                res.setLooksLike(cursor.getString(13));
                res.setSizeWidth(cursor.getDouble(14));
                res.setSizeHight(cursor.getDouble(15));
                res.setShape(cursor.getString(16));
                res.setColour(cursor.getString(17));
                res.setBehaviour(cursor.getString(18));
                res.setOtherNote(cursor.getString(19));

                logNotes.add(res);

            }
            return logNotes;
        }finally {

        }
    }

}
