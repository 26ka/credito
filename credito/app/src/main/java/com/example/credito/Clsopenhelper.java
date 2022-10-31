package com.example.credito;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Clsopenhelper extends SQLiteOpenHelper {
    public Clsopenhelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table  tblcliente(identificacion text primary key ,nombre text not null,profesion text not null,empresa tex not null," +
                "salario integer not null,ingreso_extra integer not null,gasto integer not null,activo text not null default 'si')");
        db.execSQL("create table tblcredito (cod_credito text primary key  not null,identificacion text not null, valor_prestamo integer not null , activo text not null default'si'," +
                "constraint pk_credito foreign  key (identificacion )references tblclientes(identificacion))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table tblcliente");
        db.execSQL("drop table tblcredito");{
        onCreate(db);}

    }
}
