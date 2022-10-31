package com.example.credito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      EditText jetusuario,jetclave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //olcultar la barra de titulosy asociar objetos java a objetos xml
        getSupportActionBar().hide();
        jetusuario=findViewById(R.id.etusuario);
        jetclave=findViewById(R.id.etclave);
    }
    public void  ingresa(View View){
        String usuario=jetusuario.getText().toString();
        Intent intmenu=new Intent(this,MenuActivity2.class);
        intmenu.putExtra("datos",usuario);
        startActivity(intmenu);


    }
    public void limpiar(View View){
        jetclave.setText("");
        jetusuario.setText("");
        jetusuario.requestFocus();
    }
}