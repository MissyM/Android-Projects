package com.milenacabrera.colombinaapplication.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.milenacabrera.colombinaapplication.Control.Producto;

import java.util.ArrayList;

/**
 * Created by mile on 30/05/17.
 */

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
    public  void insertProduct(int codigo, String nombre, String url, int cantidad, String empleado){
        this.openDbWr();
        //El método insert nos pide nombre de la BD,

        ContentValues contentValues = new ContentValues();

        contentValues.put(Constants.COLUMN_CODIGO, codigo);
        contentValues.put(Constants.COLUMN_NOMBRE, nombre);
        contentValues.put(Constants.COLUMN_URL, url);
        contentValues.put(Constants.COLUMN_CANTIDAD, cantidad);
        contentValues.put(Constants.COLUMN_EMPLEADO, empleado);

        db.insert(Constants.TABLE_NAME, null, contentValues);
        closeDb();
    }

    //Método que me permite obtener las posiciones guardadas
    public ArrayList<Producto> getProducts(){
        openDbRd();
        Cursor c = db.rawQuery("SELECT " + Constants.COLUMN_CODIGO + Constants.COMMA_SEP
                + Constants.COLUMN_NOMBRE
                + Constants.COMMA_SEP
                + Constants.COLUMN_URL
                + Constants.COMMA_SEP
                + Constants.COLUMN_CANTIDAD
                + Constants.COMMA_SEP
                + Constants.COLUMN_EMPLEADO
                + " FROM " + Constants.TABLE_NAME, new String[]{});
        ArrayList<Producto> productList = new ArrayList<Producto>();
        if(c.moveToFirst()){
            do{
                //assing values
                int codigo = c.getInt(0);
                String nombre = c.getString(1);
                String url = c.getString(2);
                int cantidad = c.getInt(3);
                String empleado = c.getString(4);

                //Do something Here with values
                Producto producto = new Producto(codigo, nombre, url, cantidad, empleado);

                productList.add(producto);

            }while(c.moveToNext());
        }
        closeDb();
        return productList;
    }

    public Producto getProduct(int codigo){
        openDbRd();
        Cursor c = db.rawQuery("SELECT "
                + Constants.COLUMN_NOMBRE
                + Constants.COMMA_SEP
                + Constants.COLUMN_URL
                + Constants.COMMA_SEP
                + Constants.COLUMN_CANTIDAD
                + Constants.COMMA_SEP
                + Constants.COLUMN_EMPLEADO
                + " FROM " + Constants.TABLE_NAME + " WHERE " + Constants.COLUMN_CODIGO +
                " = " + Integer.toString(codigo), new String[]{});

        Producto producto = null;
        if (c.moveToFirst()){
            //assing values
            String nombre = c.getString(0);
            String url = c.getString(1);
            int cantidad = c.getInt(3);
            String empleado = c.getString(4);

            //Do something Here with values
            producto = new Producto(codigo, nombre, url, cantidad, empleado);
        }
        closeDb();
        return producto;
    }

    public void setCantidad(){

    }

    public void deletAllProducts() {
        openDbWr();
        db.delete(Constants.TABLE_NAME, null, null);
        closeDb();
    }
    public void deleteProduct(int codigo) {
        openDbWr();
        db.delete(Constants.TABLE_NAME, Constants.COLUMN_CODIGO + " = " + codigo, null);
        closeDb();
    }
}
