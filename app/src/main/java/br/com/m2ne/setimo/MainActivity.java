package br.com.m2ne.setimo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText mensagem;
    private TextView visualizar;
    private Button enviar;
    private List<String> listaMensagen;
    private ArrayAdapter<String> adp;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagem = (EditText) findViewById(R.id.edmensagem);
        enviar = (Button) findViewById(R.id.btEnviar);
        lista = (ListView) findViewById(R.id.lista);

        this.listaMensagen = new ArrayList<>();


        this.adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, this.listaMensagen);
        this.lista.setAdapter(this.adp);

       /* this.lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                removeMensagem(position);
            }
        }); */


        this.lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                removeMensagem(position);
                return true;
            }
        });
    }

    public void mostrarMensagem(View v){

        if (this.mensagem.getText().toString().equals("")){
            Toast.makeText(this, "Por favor informe o texto da mensagem", Toast.LENGTH_SHORT).show();
            return;
        }

        this.listaMensagen.add(mensagem.getText().toString());
        this.adp.notifyDataSetChanged();
    }

    private void removeMensagem(int position){
        this.listaMensagen.remove(position);
        this.adp.notifyDataSetChanged();

    }


}
