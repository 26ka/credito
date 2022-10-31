package com.example.credito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class creditoactivity extends AppCompatActivity {
    TextView jtvcodigoCredito,jtvIdentificacion,jtvusuario,jtvprofesion,jtvsalario,jtvingresoextra,jtvvalorPrestamo,jtvgastos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditoactivity);
        //ocultar la barra de menuy mostrar en un textview el usuario
       getSupportActionBar().hide();
       jtvingresoextra=findViewById(R.id.tvingresoextra);
       jtvusuario=findViewById(R.id.tvusuario);
       jtvIdentificacion=findViewById(R.id.tvIdentificacion);
       jtvprofesion=findViewById(R.id.tvprofesion);
       jtvsalario=findViewById(R.id.tvsalario);
       jtvcodigoCredito=findViewById(R.id.tvcodigoCredito);
       jtvvalorPrestamo=findViewById(R.id.tvvalorPrestamo);
       jtvgastos=findViewById(R.id.tvgastos);

    }
}