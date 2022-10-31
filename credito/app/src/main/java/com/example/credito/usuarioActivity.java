package com.example.credito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class usuarioActivity extends AppCompatActivity {
     TextView jetdentificacion,jetnombre,jetprofesion,jetempresa,jetsalario,jetingresoextra,jetgastos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        //ocultar la barra de menuy mostrar en un textview el usuario
        getSupportActionBar().hide();
        jetingresoextra=findViewById(R.id.etingresosextras);
        jetempresa=findViewById(R.id.etnombre);
        jetnombre=findViewById(R.id.etnombre);
        jetdentificacion=findViewById(R.id.etidentificacion);
        jetprofesion=findViewById(R.id.etprofesion);
        jetsalario=findViewById(R.id.etsalario);
        jetgastos=findViewById(R.id.etgastos);
         String usuario;
         usuario=getIntent().getStringExtra("datos");
         jetnombre.setText(usuario);
    }
}