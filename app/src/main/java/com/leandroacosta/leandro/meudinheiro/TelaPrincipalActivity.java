package com.leandroacosta.leandro.meudinheiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaPrincipalActivity extends AppCompatActivity {

    Button btnRendaFixa;
    Button btnAcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        btnAcoes = (Button) findViewById(R.id.btnAcoes);
        btnRendaFixa = (Button) findViewById(R.id.btnRendaFixa);

        btnAcoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Entrou!", Toast.LENGTH_LONG);
                System.out.println("teste");
                Intent myIntent = new Intent(TelaPrincipalActivity.this, AcoesActivity.class);
                startActivity(myIntent);

            }
        });
        btnRendaFixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Entrou!", Toast.LENGTH_LONG);
                System.out.println("teste");
                Intent myIntent = new Intent(TelaPrincipalActivity.this, RendaFixaActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
