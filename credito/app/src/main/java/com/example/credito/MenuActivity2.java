package com.example.credito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity2 extends AppCompatActivity {
       TextView jtvusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        //ocultar la barra de menuy mostrar en un textview el usuario
        //actividad pasada
        getSupportActionBar().hide();
        jtvusuario=findViewById(R.id.tvusuario);
        String usuario;
        usuario=getIntent().getStringExtra("datos");
        jtvusuario.setText(usuario);
    }
    public void ingresousuario(View View) {
        String usuario=jtvusuario.getText().toString();
        Intent intusuario=new Intent(this,usuarioActivity.class);
        intusuario.putExtra("datos",usuario);
        startActivity(intusuario);

    }
    public void credito(View View){
        Intent intcredito=new Intent(this,creditoactivity.class);
        startActivity(intcredito);
    }
    public void salir(View View) {
        Intent intmain = new Intent(this, MainActivity.class);
        startActivity(intmain);
    }
    }
