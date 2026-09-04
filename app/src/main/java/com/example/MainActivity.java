package com.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Tela principal do aplicativo "Horário no Ponto" em Java.
 * Apresenta a Top App Bar moderna, introdução rápida, cards de ação horizontais
 * para consulta de horários nas empresas de transporte coletivo e navegação secundária.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialização dos cards de ação horizontais das empresas
        View cardSantaTerezinha = findViewById(R.id.btn_santa_terezinha);
        View cardJotur = findViewById(R.id.btn_jotur);
        View cardEstrela = findViewById(R.id.btn_estrela);
        View cardSobreApp = findViewById(R.id.btn_proxima_tela);

        // Card 1: Santa Terezinha -> Abre o site de horários no navegador padrão
        cardSantaTerezinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNavegador(getString(R.string.url_santa_terezinha));
            }
        });

        // Card 2: Jotur -> Abre o portal oficial de horários no navegador
        cardJotur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNavegador(getString(R.string.url_jotur));
            }
        });

        // Card 3: Estrela -> Abre o portal oficial de horários no navegador
        cardEstrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNavegador(getString(R.string.url_estrela));
            }
        });

        // Ação Secundária: Navega para a SecondActivity via Intent explícita
        cardSobreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Abre a URL especificada no navegador padrão do Android utilizando Intent.ACTION_VIEW.
     *
     * @param url Endereço da página de horários da empresa
     */
    private void abrirNavegador(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
