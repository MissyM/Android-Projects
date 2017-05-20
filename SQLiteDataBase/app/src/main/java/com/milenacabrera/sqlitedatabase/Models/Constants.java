package com.milenacabrera.sqlitedatabase.Models;

import android.provider.BaseColumns;

/**
 * Created by mile on 11/05/17.
 */

public class Constants {
    public static String DB_NAME = "Usuarios";
    public static int VERSION = 2;

    public static final String TABLE_NAME = "Registro";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOMBRE = "nombre";
    public static final String COLUMN_APELLIDOS = "apellido";
    public static final String COLUMN_EDAD = "edad";
    public static final String COLUMN_ESTADO_CIVIL = "estado_civil";
    public static final String COLUMN_GENERO= "genero";
    public static final String COLUMN_IDIOMAE= "idiomaesp";
    public static final String COLUMN_IDIOMAI= "idiomaing";

    private static final String TEXT_TYPE = " TEXT";
    private static final String INTEGER_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + Constants.TABLE_NAME + "(" + Constants.COLUMN_ID +
            " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            Constants.COLUMN_NOMBRE + TEXT_TYPE + COMMA_SEP +
            Constants.COLUMN_APELLIDOS + TEXT_TYPE + COMMA_SEP +
            Constants.COLUMN_EDAD + INTEGER_TYPE + COMMA_SEP +
            Constants.COLUMN_ESTADO_CIVIL + TEXT_TYPE + COMMA_SEP +
            Constants.COLUMN_GENERO + TEXT_TYPE + COMMA_SEP +
            Constants.COLUMN_IDIOMAE + TEXT_TYPE + COMMA_SEP +
            Constants.COLUMN_IDIOMAI + TEXT_TYPE + " )";
            //registro(id INTEGER,  +"Nombre TEXT, Apellido TEXT, Edad INTEGER, Estado Civil TEXT, Genero TEXT, Idioma TEXT)";

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + Constants.TABLE_NAME;
}
