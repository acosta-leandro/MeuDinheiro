package com.leandroacosta.leandro.meudinheiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class AcoesActivity extends AppCompatActivity {

    Button btnAdd;
    Button btnDel;
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acoes);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDel = (Button) findViewById(R.id.btnDel);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Entrou!", Toast.LENGTH_LONG);
                System.out.println("teste");
                Intent myIntent = new Intent(AcoesActivity.this, AdicionarRendaFixaActivity.class);
                startActivity(myIntent);

            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Entrou!", Toast.LENGTH_LONG);
                System.out.println("teste");
                Intent myIntent = new Intent(AcoesActivity.this, RemoverRendaFixaActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
