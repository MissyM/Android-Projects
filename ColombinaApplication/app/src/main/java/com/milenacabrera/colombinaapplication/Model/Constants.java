package com.milenacabrera.colombinaapplication.Model;

/**
 * Created by mile on 30/05/17.
 */

public class Constants {
    public static String DB_NAME = "Products";
    public static int VERSION = 1;

    public static final String TABLE_NAME = "ListProducts";

    public static final String COLUMN_CODIGO = "Codigo";
    public static final String COLUMN_URL= "Url";
    public static final String COLUMN_NOMBRE = "Nombre";
    public static final String COLUMN_CANTIDAD = "Cantidad";
    public static final String COLUMN_EMPLEADO = "Empleado";




    public static final String NUMBER_TYPE = " NUMBER";
    public static final String COMMA_SEP = ",";
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + Constants.TABLE_NAME + "(" + Constants.COLUMN_CODIGO +
            " INTEGER PRIMARY KEY," +
            Constants.COLUMN_NOMBRE + NUMBER_TYPE + COMMA_SEP +
            Constants.COLUMN_URL + NUMBER_TYPE + COMMA_SEP +
            Constants.COLUMN_CANTIDAD + NUMBER_TYPE + COMMA_SEP +
            Constants.COLUMN_EMPLEADO + NUMBER_TYPE + " )";

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + Constants.TABLE_NAME;
}

