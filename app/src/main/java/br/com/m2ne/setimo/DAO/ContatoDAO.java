package br.com.m2ne.setimo.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import br.com.m2ne.setimo.Banco.Banco;
import br.com.m2ne.setimo.Entidade.Contato;

/**
 * Created by nonilton on 29/02/16.
 */
public class ContatoDAO extends Contato {

    private Banco banco;
    private ContentValues contentValues;

    public ContatoDAO(Context context){
        this.banco = new Banco(context);
        this.contentValues = new ContentValues();
    }

    public long salvar(){
        return this.banco.getWritableDatabase().
                insert("contatos", null, this.getContentValues());
    }

    public int excluir(long id){
        return this.banco.getWritableDatabase().delete("contatos","id=?",new String[]{id+""} );
    }

    public List<Contato> getContatos(){
        List<Contato> lista = new ArrayList<>();
        Cursor cursor = this.banco.getWritableDatabase().rawQuery("select * from contatos",null);

        while(cursor.moveToNext()){
            Contato contato = new Contato();
            contato.setId(cursor.getInt(0));
            contato.setNome(cursor.getString(1));
            contato.setEmail(cursor.getString(2));
            contato.setTelefone(cursor.getString(3));

            lista.add(contato);
        }

        return lista;
    }


}
