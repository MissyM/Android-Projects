package com.milenacabrera.miescuelaapp.Model;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;


/**
 * Created by mile on 18/05/17.
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
    public  void insertLocation(double latitud, double longitud){
        this.openDbWr();
        //El método insert nos pide nombre de la BD,

        ContentValues contentValues = new ContentValues();

        contentValues.put(Constants.COLUMN_LATITUD, latitud);
        contentValues.put(Constants.COLUMN_LONGITUD, longitud);

        db.insert(Constants.TABLE_NAME, null, contentValues);
        closeDb();
    }

    //Método que me permite obtener las posiciones guardadas
    public ArrayList<LocationModel> getLocations(){
        openDbRd();
        Cursor c = db.rawQuery("SELECT " + Constants.COLUMN_ID + Constants.COMMA_SEP
                + Constants.COLUMN_LATITUD
                + Constants.COMMA_SEP
                + Constants.COLUMN_LONGITUD
                + " FROM " + Constants.TABLE_NAME, new String[]{});
        ArrayList<LocationModel> locationList = new ArrayList<LocationModel>();
        if(c.moveToFirst()){
            do{
                //assing values
                Long id = c.getLong(0);
                Double lat = c.getDouble(1);
                Double lng = c.getDouble(2);

                //Do something Here with values
                LocationModel locationModel = new LocationModel(id, lat, lng);


                locationList.add(locationModel);

            }while(c.moveToNext());
        }
        closeDb();
        return locationList;
    }

    public void deletAllLocations() {
        openDbWr();
        db.delete(Constants.TABLE_NAME, null, null);
        closeDb();
    }
    public void deleteLocation(Long id) {
        openDbWr();
        db.delete(Constants.TABLE_NAME, Constants.COLUMN_ID + " = " + id.toString(), null);
        closeDb();
    }
}

