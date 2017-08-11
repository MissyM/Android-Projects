package com.milenacabrera.requestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

//{
//     "id":1,
//     "phone":"1-770-736-8031 x56442",
//     "username":"Bret",
//     "website":"hildegard.org",
//     "address":{
//          "geo":{"lng":"81.1496","lat":"-37.3159"},
//          "suite":"Apt. 556",
//          "zipcode":"92998-3874",
//          "city":"Gwenborough",
//          "street":"Kulas Light"
// },
//   "email":"Sincere@april.biz",
//   "company":{
//      "bs":"harness real-time e-markets",
//      "catchPhrase":"Multi-layered client-server neural-net",
//      "name":"Romaguera-Crona"},
//   "name":"Leanne Graham"
// }
public class MainActivity extends AppCompatActivity {
    //JsonObjectRequest jsonObjectRequest; es útil para traer objetos
    JsonArrayRequest jsonArrayRequest; // Es útil para traer listas de información
    //StringRequest stringRequest; Es util para traer cadenas, textos planos
    List<User> list;
    ListView listView;
    public static  String URL="https://jsonplaceholder.typicode.com/users";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lista);

        list = new ArrayList<>();
        getRequest();
    }

    public void getRequest() {
        SyngletonClass.getInstance(getApplicationContext()).getmRequestQueue();
        jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, (JSONObject) null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.e("LOGG","ESTO ES LO QUE TRAE: " + response.toString());
                try {
                    if (response.length() > 0) {
                        for (int i = 0; i < response.length(); i++) {
                            JSONObject user = response.getJSONObject(i);
                            User user1 = new User();
                            user1.setName(user.getString("name"));
                            user1.setUsername(user.getString("username"));
                            user1.setEmail(user.getString("email"));
                            user1.setPhone(user.getString("phone"));
                            user1.setWebsite(user.getString("website"));
                            list.add(user1);

                        }
                        ArrayAdapter<User> stringArrayAdapter = new ArrayAdapter<User>(MainActivity.this,android.R.layout.simple_expandable_list_item_1,list);
                        listView.setAdapter(stringArrayAdapter);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("LOGG", "Algo anda mal :(");
            }
        });
        SyngletonClass.getInstance(getApplicationContext()).addToRequestQueue(jsonArrayRequest);
    }
}
