package com.example.arriendos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     //definicion de objetos
    EditText jetcantidad;
    TextView jtvtotal,Jtvarriendo,jtvparqueadero;
    RadioButton jrbcasa,jrbapartamento,jrbfinca;
    CheckBox jcbparqueadero;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        jetcantidad=findViewById(R.id.etcantidad);
        jtvtotal=findViewById(R.id.tvtotal);
        jtvparqueadero=findViewById(R.id.tvparqueadero);
        Jtvarriendo=findViewById(R.id.tvarriendo);
        jrbfinca=findViewById(R.id.rbfinca);
        jrbapartamento=findViewById(R.id.rbapartamento);
        jrbcasa=findViewById(R.id.rbcasa);
        jcbparqueadero=findViewById(R.id.cbparqueadero);
    }
    public void calcular_arriendo (View View){
        String cantidad_habitaciones=jetcantidad.getText().toString();
        if (cantidad_habitaciones.isEmpty()){
            Toast.makeText(this, "la cantidad de habitaciones es requerida", Toast.LENGTH_SHORT).show();
            jetcantidad.requestFocus();
        }


    }
}