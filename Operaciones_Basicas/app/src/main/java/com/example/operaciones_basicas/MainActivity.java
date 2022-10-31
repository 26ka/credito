package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {
    //definir objetos java equibalentes a los objetos xml
    //programables
    EditText jetnumero1,jetnumero2;
    TextView jtsuma ,jtresta ,jtmultiplicacion,jtdivison;
    Button jbtoperaciones ,jbtlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ocultar la barra de titulo por defecto
        //asociar los objetos java con los objetos xml
        getActionBar().hide();
        jetnumero1=findViewById(R.id.etnumero1);
        jetnumero2=findViewById(R.id.etnumero2);
        jtsuma=findViewById(R.id.tvsuma);
        jtresta=findViewById(R.id.tvresta);
        jtmultiplicacion=findViewById(R.id.tvmultiplicacion);
        jtdivison=findViewById(R.id.tvdivision);
        jbtoperaciones=findViewById(R.id.btoperaciones);
        jbtlimpiar=findViewById(R.id.btlimpiar);
    }

    public void calcular_operaciones(View view ) {
        String numero1,numero2;
        numero1=jetnumero1.getText().toString();
        numero2=jetnumero2.getText().toString();
        if(numero1.isEmpty()|| numero2.isEmpty()){
            Toast.makeText(this,"los dos numero son requeridos", Toast.LENGTH_LONG ).show();
            jetnumero1.requestFocus();
        }
        else{
            float num1, num2, suma, resta, multiplicacion,division;
            num1=Float.parseFloat(numero1);
            num2=Float.parseFloat(numero2);
            suma=num1+num2;
            resta=num1-num2;
            multiplicacion=num1*num2;
            jtsuma.setText(String.valueOf(suma));
            jtresta.setText(String.valueOf(resta));
            jtmultiplicacion.setText(String.valueOf(multiplicacion));
            if (num2==0)
                Toast.makeText(this, "division no valida", Toast.LENGTH_SHORT).show();
            else{
                division=num1/num2;
                jtdivison.setText(String.valueOf(division));

            }
        }
    }
    public void  limpiar_datos(View View){
        jetnumero1.setText("");
        jetnumero2.setText("");
        jtsuma.setText("");
        jtresta.setText("");
        jtmultiplicacion.setText("");
        jtdivison.setText(""0);
        jetnumero1.requestFocus();

    }
}