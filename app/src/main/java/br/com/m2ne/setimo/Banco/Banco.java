package br.com.m2ne.setimo.Banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nonilton on 25/02/16.
 *
 */

public class Banco extends SQLiteOpenHelper {

    private static final String BANCO_DADOS = "Setimo";
    private static final int VERSAO_BANCO = 1;

    public Banco(Context context) {
        super(context, BANCO_DADOS, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table contatos(id integer not null primary key autoincrement, " +
                "nome text, email text, telefone text);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //executado todas as vezes que a versao do banco de dados for alterada.
    }
}
