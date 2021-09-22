package com.example.muerte;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable animacion;

    @Override public void onCreate (Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState );
        animacion = (AnimationDrawable)getResources().getDrawable (
                R.drawable.animacion);
        ImageView vista = new ImageView(this);
        vista.setBackgroundColor(Color.WHITE);
        vista.setImageDrawable(animacion);
        vista.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                animacion.start();
            }
        });
        setContentView(vista );
    }
}
