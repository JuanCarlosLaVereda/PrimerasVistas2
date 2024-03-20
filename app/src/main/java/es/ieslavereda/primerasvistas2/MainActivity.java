package es.ieslavereda.primerasvistas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
    }

    public void pulsaSi(View view){
        Toast toast = Toast.makeText(this, "Has pulsado SI", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void pulsaNo(View view){
        Toast.makeText(this, "Has pulsado NO", Toast.LENGTH_LONG).show();
    }
}