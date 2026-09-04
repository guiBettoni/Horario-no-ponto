package com.example;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

/**
 * Segunda tela da aplicação ("Sobre o aplicativo") em Java.
 * Apresenta informações sobre o aplicativo, linhas e empresas integradas,
 * além de navegação para retornar à tela principal.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Configuração da Toolbar com seta de retorno convencional do Android
        MaterialToolbar toolbar = findViewById(R.id.toolbar_second);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        // Botão de ação "Voltar ao início"
        View btnVoltar = findViewById(R.id.btn_voltar);
        if (btnVoltar != null) {
            btnVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }
}
