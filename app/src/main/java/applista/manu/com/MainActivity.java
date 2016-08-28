package applista.manu.com;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.Arrays;
import java.util.List;

import applista.manu.com.Fragments.ListaFragments;

public class MainActivity extends AppCompatActivity {

    ListActivity la;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //A classe ActivityMain irá carregar o layout inicial
        //O layout dessa activity, carrega o cabeçalho da aplicação que é o icone dela e o nome dela.
        //basicamente um imageview + textview

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ListaFragments())
                    .commit(); //nesse bloco, estou inflando o layout do fragment ListaFragments
            //fragments é um bom uso da tela, ele permite reutilização do layout original permitindo trocar apenas
            //a parte desejada e economizando processamento na hora de carregar o layout da view por completo.

        }

    }
}
