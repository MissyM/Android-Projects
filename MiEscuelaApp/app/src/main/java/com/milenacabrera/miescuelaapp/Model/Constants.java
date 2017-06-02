package com.milenacabrera.miescuelaapp.Model;


/**
 * Created by mile on 18/05/17.
 */

public class Constants {
    public static String DB_NAME = "Marks";
    public static int VERSION = 1;

    public static final String TABLE_NAME = "ListMark";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_LATITUD = "latitud";
    public static final String COLUMN_LONGITUD = "longitud";


    public static final String NUMBER_TYPE = " NUMBER";
    public static final String COMMA_SEP = ",";
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + Constants.TABLE_NAME + "(" + Constants.COLUMN_ID +
            " INTEGER PRIMARY KEY," +
            Constants.COLUMN_LATITUD + NUMBER_TYPE + COMMA_SEP +
            Constants.COLUMN_LONGITUD + NUMBER_TYPE + " )";

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + Constants.TABLE_NAME;
}
