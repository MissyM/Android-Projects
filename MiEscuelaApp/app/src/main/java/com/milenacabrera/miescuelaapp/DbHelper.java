package com.milenacabrera.miescuelaapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by mile on 18/05/17.
 */
//Clase que me ayuda a hacer la conexión con la base de datos
public class DbHelper extends SQLiteOpenHelper {
    //Constructor
    public DbHelper(Context context) {
        super(context, Constants.DB_NAME, null, Constants.VERSION);
    }

    //Método que me ayuda a crear tablas en mi base de datos
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Constants.SQL_CREATE_ENTRIES);
    }

    //Si cambiamos la versión se ejecuta este método
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Constants.SQL_DELETE_ENTRIES);
        onCreate(db);

    }
}
