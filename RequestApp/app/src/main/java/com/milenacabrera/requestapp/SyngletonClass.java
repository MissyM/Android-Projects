package com.milenacabrera.requestapp;

import android.app.DownloadManager;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by mile on 31/07/17.
 */

public class SyngletonClass {
    private static SyngletonClass mSyngletonClass;
    //Clase de voley que hace la petición. Le pasamos la lista de tareas
    public RequestQueue mRequestQueue;
    private static Context mContext;

    public SyngletonClass(Context context) {
        mContext = context;
        mRequestQueue = getmRequestQueue();
    }

    public static synchronized SyngletonClass getInstance( Context context) {
        if (mSyngletonClass == null) {
            mSyngletonClass = new SyngletonClass(context.getApplicationContext());
        }
        return mSyngletonClass;
    }

    public RequestQueue getmRequestQueue () {
        if(mRequestQueue == null) {
            mRequestQueue = Volley.  newRequestQueue(mContext);
        }
        return mRequestQueue;
    }

    public void addToRequestQueue(Request request) {
        getmRequestQueue().add(request);

    }

}
