package com.milenacabrera.sqlitedatabase.Models;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by mile on 11/05/17.
 */
// En esta Clase que toda la parte de conexión con la base de datos
public class Connection {
    DbHelper dbHelper;
    SQLiteDatabase db;

    public Connection(Context context) {
        //Llamo a mi conexión
        dbHelper = new DbHelper(context);
    }
    //Metodo que me permite abrir la base de datos en modo de escritura
    public void openDbWr()
    {
        db = dbHelper.getWritableDatabase();
    }
    //Metodo que me permite abrir la base de datos en modo de lectura
    public void openDbRd(){

        db = dbHelper.getReadableDatabase();
    }
    //Metodo que me permite cerrar la base de datos
    public void closeDb(){//Verificamos si la base de datos está vacia
        if (db != null) {

            db.close();
        }
    }
    // Metodo que me permite insertar los datos a la base de datos
     public  void insertRegistro(String id, String nombre, String apellido, String edad, String estadocivil, String genero, String idiomai, String idiomae){
         this.openDbWr();
         //El método insert nos pide nombre de la BD,

         ContentValues contentValues = new ContentValues();
         contentValues.put(Constants.COLUMN_ID, id);
         contentValues.put(Constants.COLUMN_NOMBRE, nombre);
         contentValues.put(Constants.COLUMN_APELLIDOS, apellido);
         contentValues.put(Constants.COLUMN_EDAD, edad);
         contentValues.put(Constants.COLUMN_ESTADO_CIVIL, estadocivil);
         contentValues.put(Constants.COLUMN_GENERO, genero);
         contentValues.put(Constants.COLUMN_IDIOMAE, idiomae);
         contentValues.put(Constants.COLUMN_IDIOMAI, idiomai);

         db.insert(Constants.TABLE_NAME, null, contentValues);


     }



}
