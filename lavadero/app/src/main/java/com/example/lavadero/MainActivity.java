package com.example.lavadero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText jettaxis,jetbuses,jetmotos,jetparticulares;
    TextView jtvtaxis,jtvbuses,jtvmotos,jtvparticulares,jtvtotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ocultar la barra de titulo por defecto
        getSupportActionBar().hide();

        //asociar los objetos java con los objetos xml
        jettaxis=findViewById(R.id.ettaxis);
         jetbuses=findViewById(R.id.etbuses) ;
         jetmotos=findViewById(R.id.etmotos);
         jetparticulares=findViewById(R.id.etparticulares);
         jtvtaxis=findViewById(R.id.tvtaxis);
         jtvmotos=findViewById(R.id.tvbuses);
         jtvmotos=findViewById(R.id.tvmotos);
         jtvparticulares=findViewById(R.id.tvparticulares);
         jtvtotal=findViewById(R.id.tvtotal_dia);
    }

    public void Calcular_dinero(View view){
        String taxis,motos,buses,particulares;
        taxis=jettaxis.getText().toString();
        motos=jetmotos.getText().toString();
        buses=jetbuses.getText().toString();
        particulares=jetparticulares.getText().toString();
        if (taxis.isEmpty() || buses.isEmpty() || motos.isEmpty() || particulares.isEmpty()) {
            Toast.makeText(this, "todos los datos son requeridos ", Toast.LENGTH_SHORT).show();
            jettaxis.requestFocus();
        }
        else{
            int cant_taxis,cant_motos,cant_buses,cant_particulares,
                    total_taxis,total_motos,total_particulares,total_buses,total_dia;
            cant_taxis=Integer.parseInt(taxis);
            cant_motos=Integer.parseInt(motos);
            cant_buses=Integer.parseInt(buses);
            cant_particulares=Integer.parseInt(particulares);
            total_taxis=cant_taxis*3000;
            total_buses=cant_buses*10000;
            total_particulares=cant_particulares*5000;
            total_motos=cant_motos*2000;
            total_dia=total_buses*total_particulares*total_taxis*total_motos;
            //imprimir resultados
            jettaxis.setText(String.valueOf(total_taxis));
            jetbuses.setText(String.valueOf(total_buses));
            jetmotos.setText(String.valueOf(total_motos));
            jetparticulares.setText(String.valueOf(total_particulares));
            jtvtotal.setText(String.valueOf(total_dia));

        }
    }
     public void limpiar_campos (View view){
       jettaxis.setText("");
        jetmotos.setText("");
        jetbuses.setText("");
        jetparticulares.setText("");
        jtvtotal.setText("");
        jtvmotos.setText("");
        jtvparticulares.setText("");
        jtvtaxis.setText("");
        jtvbuses.setText("");
        jettaxis.requestFocus();

}


}