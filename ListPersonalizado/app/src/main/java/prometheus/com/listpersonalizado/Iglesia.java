package prometheus.com.listpersonalizado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
// Iglesia Activity
public class Iglesia extends AppCompatActivity {

    Bundle extras;

    ImageView foto;
    TextView nom, dir, desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iglesia);

        foto = (ImageView) findViewById(R.id.imgIgleFoto);
        nom = (TextView) findViewById(R.id.txtIgleNom);
        desc = (TextView) findViewById(R.id.txtIgleDesc);
        dir = (TextView) findViewById(R.id.txtIgleDir);

        extras = getIntent().getExtras();
        foto.setImageResource((Integer) extras.get("img"));
        desc.setText(extras.getString("desc"));
        dir.setText(extras.getString("dir"));
        nom.setText(extras.getString("nom"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menulist,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent ventana;
        switch (item.getItemId())
        {
            case R.id.itmList:
                ventana = new Intent(Iglesia.this,ListaIglesias.class);
                startActivity(ventana);
                return true;
            case R.id.itmGrid:
                ventana = new Intent(Iglesia.this,GridIgles.class);
                startActivity(ventana);
                return true;
            default:
                return false;
        }
    }
}
