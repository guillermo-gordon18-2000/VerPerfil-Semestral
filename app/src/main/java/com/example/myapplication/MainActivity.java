package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
private LayerDrawable imagen ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //imagen =(LayerDrawable)findDrawableByLayerId(R.id.fot_1);
    ImageView  Imgane_persona = findViewById(R.id.Imgane_persona);
        // Para usar el redonde de imagenes de debe ajustar lo siguiente
        // Build gradle
        //    implementation 'com.github.bumptech.glide:glide:4.8.0'
        //    annotationProcessor 'com.github.bumptech.glide:compiler:4.8.0'
        //  gradle property ---->se debe agregar la siguiente line
        //    android.enableJetifier = true

            Glide.with(getBaseContext()).load(R.drawable.guillermo).apply(RequestOptions.circleCropTransform()).into(Imgane_persona);
    }
}