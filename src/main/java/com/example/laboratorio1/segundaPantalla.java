package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class segundaPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
    }
    public void irAtras (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText( this , "Regresaste al inicio", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("segundaPantalla", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("segundaPantalla", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("segundaPantalla", "onDestroy");
    }
}