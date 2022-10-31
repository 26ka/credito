package com.example.salario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //definicion de objetos
    EditText jetnum_horas_trabajadas, jetvalor_hora, jetaños_trabajados,Jetdeducciones;
    TextView Jtvsalariobruto, Jtvbonificaciones, Jtvsalarioneto, jtvtotal;
    Button jbtcalcular, jbtlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //olcultar la barra de titulo por defecto
        //asociarlos objetos javacon los objetos xml

        getSupportActionBar().hide();
        jetnum_horas_trabajadas = findViewById(R.id.etnum_horas_trabajadas);
        jetvalor_hora = findViewById(R.id.etvalor_hora);
        jetaños_trabajados = findViewById(R.id.etaños_trabajados);
        Jetdeducciones = findViewById(R.id.etdeducciones);
        Jtvsalariobruto = findViewById(R.id.tvsalariobruto);
        Jtvbonificaciones = findViewById(R.id.tvbonificaciones);
        Jtvsalarioneto = findViewById(R.id.tvsalarioneto);
        jtvtotal = findViewById(R.id.tvtotal);
        jbtcalcular = findViewById(R.id.btcalcular);
        jbtlimpiar = findViewById(R.id.btlimpiar);
    }

    public void calcular_salario(View view) {

        String horas, valor_hora, año_tras ,deducciones;
         horas=jetnum_horas_trabajadas.getText().toString();
         valor_hora=jetvalor_hora.getText().toString();
         año_tras=jetaños_trabajados.getText().toString();
         deducciones=Jetdeducciones.getText().toString();
         if (horas.isEmpty()|| valor_hora.isEmpty()||año_tras.isEmpty()||deducciones.isEmpty()){
             Toast.makeText(this, "todos los campos son requeridos", Toast.LENGTH_SHORT).show();
            jetnum_horas_trabajadas.requestFocus();
         }
         else{
             float num_horas, val_hora, años_trabajados,
             deduccione, salariobruto, bonificaciones, salarioneto, tvtotal;
             num_horas=Float.parseFloat(horas);
             val_hora=Float.parseFloat(valor_hora);
             años_trabajados=Float.parseFloat(año_tras);
             deduccione=Float.parseFloat(deducciones);
             salariobruto=val_hora * num_horas;
             bonificaciones=años_trabajados*30000;
             salarioneto=salariobruto+bonificaciones-deduccione;
             Jtvsalariobruto.setText(String.valueOf(Jtvsalariobruto));
             Jtvsalarioneto.setText(String.valueOf(Jtvsalarioneto));
             Jtvbonificaciones.setText(String.valueOf(Jtvbonificaciones));

         }
    }
    public void limpiar_datos (View View){

        jetaños_trabajados.setText("");
        jetvalor_hora.setText("");
        jetnum_horas_trabajadas.setText("");
        Jetdeducciones.setText("");
        jtvtotal.setText("");
        Jtvsalariobruto.setText("");
        Jtvbonificaciones.setText("");
        Jtvsalarioneto.setText("");
        jtvtotal.setText("");

    }
}









