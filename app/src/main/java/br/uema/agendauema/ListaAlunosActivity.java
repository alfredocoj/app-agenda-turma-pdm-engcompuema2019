package br.uema.agendauema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] listaAlunos = {"Bruno", "Flavio", "Rita", "Antonio"};

        ListView listView = findViewById(R.id.lista_alunos);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listaAlunos);

        listView.setAdapter(arrayAdapter);
    }
}
