package br.com.m2ne.setimo.Entidade;

import android.content.ContentValues;

import br.com.m2ne.setimo.Padroes.IBeans;

/**
 * Created by nonilton on 29/02/16.
 */
public class Contato implements IBeans {
    private long id;
    private String nome;
    private String email;
    private String telefone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ContentValues getContentValues(){
        ContentValues cv = new ContentValues();
        cv.put("nome", this.getNome());
        cv.put("email", this.getEmail());
        cv.put("telefone", this.getTelefone());

        return cv;

    }
}
