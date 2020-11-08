package com.example.mapasciudad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Parque, PueblitoPatojo, Museo, Unicauca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parque = findViewById(R.id.Parque);
        PueblitoPatojo = findViewById(R.id.PueblitoPatojo);
        Museo = findViewById(R.id.Museo);
        Unicauca = findViewById(R.id.Unicauca);
    }

    public void ubicacionParque(View view){

        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("Lugar","parque");
        startActivity(intent);

    }


}