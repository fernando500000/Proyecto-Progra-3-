package com.example.sportmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listanoticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listanoticias);

        final ListView list = findViewById(R.id.lista);
        final ArrayList<Noticia> arrayList = new ArrayList<Noticia>();
        arrayList.add(new Noticia("Con goles de Cristiano y Dybala, Juventus venció al Bologna y se afirmó como líder de la Serie A", R.drawable.cristiano, "La Juventus se recuperó este lunes de la derrota ante Napoli en la final de la Copa Italia y venció por 2 a 0 al Bologna en el suelo correspondiente a la jornada 27 de la Serie A. Cristiano Ronaldo y Paulo Dybala fueron los autores de los tantos del equipo que sobre el final sufrió la expulsión de Danilo."));
        arrayList.add(new Noticia("MotoGP: Canceladas las dos primeras carreras del Mundial en Catar y Tailandia por el coronavirus", R.drawable.noti2," Se siguen cancelando eventos debido al miedo a la propagación del coronavirus y el último ha sido el mundial de motociclismo. Dorna ha decidido suspender la carrera de la máxima categoría, aunque las de Moto2 y Moto3 podrían disputarse debido a que los pilotos ya están en el circuito. La segunda prueba en Tailandia también ha sido suspendida unas horas después."));
        CustomAdapter arrayAdapter=new CustomAdapter(this,arrayList);

//assign adapter to listview
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent activity2Intent = new Intent(getApplicationContext(), mostrarnoticia.class);
                activity2Intent.putExtra("ID_EXTRA1", arrayList.get(i).getPortada());
                activity2Intent.putExtra("ID_EXTRA2", arrayList.get(i).getTitulo());
                activity2Intent .putExtra("ID_EXTRA3", arrayList.get(i).getTexto());
                startActivity(activity2Intent);
            }
        });

    }
}
