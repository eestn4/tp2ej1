package com.eetsn4.test.mensajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar(View v){
        mostrar_msg();
    }

    private void mostrar_msg(){
        Toast.makeText(this, "Este es un mensaje", Toast.LENGTH_LONG).show();
    }
}
