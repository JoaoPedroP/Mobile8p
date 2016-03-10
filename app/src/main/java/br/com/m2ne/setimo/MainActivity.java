package br.com.m2ne.setimo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mensagem;
    private TextView visualizar;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagem = (EditText) findViewById(R.id.edmensagem);
        enviar = (Button) findViewById(R.id.btEnviar);
        visualizar = (TextView) findViewById(R.id.txtretorno);

     /*   enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualizar.setText(mensagem.getText().toString());
            }
        });
       */
    }

    public void mostrarMensagem(View v){
        Toast.makeText(this, mensagem.getText().toString(), Toast.LENGTH_SHORT).show();
        //visualizar.setText(mensagem.getText().toString());
    }
}
