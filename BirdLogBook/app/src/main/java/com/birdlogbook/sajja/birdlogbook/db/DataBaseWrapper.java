package com.birdlogbook.sajja.birdlogbook.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sajja on 9/7/2016.
 */
public class DataBaseWrapper extends SQLiteOpenHelper {
    private static DataBaseWrapper instance;


    private final  String table_image="CREATE TABLE IF NOT EXISTS image(" +
            "iid INTEGER PRIMARY KEY AUTOINCREMENT," +
            "photoDir TEXT,"+
            "lx DECIMAL," +
            "ly DECIMAL," +
            "date TEXT," +
            "time TEXT);";
    private final String table_logNote="CREATE TABLE IF NOT EXISTS logNote(" +
            "lnid INTEGER PRIMARY KEY AUTOINCREMENT," +
            "iid INTEGER,"+
            "date TEXT,"+
            "time TEXT,"+
            "province TEXT,"+
            "nearestCity TEXT,"+
            "lx DECIMAL," +
            "ly DECIMAL," +
            "temperature DECIMAL," +
            "elevation TEXT," +
            "habitat TEXT,"+
            "name TEXT," +
            "looksLike TEXT," +
            "sizeWidth DECIMAL," +
            "sizeHight DECIMAL," +
            "shape TEXT," +
            "colour TEXT," +
            "behaviour TEXT,"+
            "otherNote TEXT );";
    private final String table_user= "CREATE TABLE IF NOT EXISTS user(" +
            "userid TEXT,"+
            "firstname TEXT," +
            "lastname TEXT," +
            "email TEXT," +
            "usertype TEXT," +
            "country TEXT," +
            "password TEXT);";
    private final String table_login= "CREATE TABLE IF NOT EXISTS login(" +
            "log boolean); ";

    private DataBaseWrapper(Context context) {

        super(context, "birdlogbook11", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(table_login);
        db.execSQL(table_image);
        db.execSQL(table_logNote);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXIST login");
        db.execSQL("DROP TABLE IF EXIST image");
        db.execSQL("DROP TABLE IF EXIST logNote");

        onCreate(db);
    }
    public static synchronized DataBaseWrapper getHelper(Context context){
        if (instance==null){
            instance=new DataBaseWrapper(context);
        }
        return instance;
    }

}
