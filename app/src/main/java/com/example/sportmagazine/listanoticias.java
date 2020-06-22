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
        arrayList.add(new Noticia("Futbol", R.drawable.noti1, "ntes de comenzar a teclear en tu computador es imprescindible que tengas muy claro: Qué quieres contar, a quién se lo vas a contar y cómo lo vas a contar. Si logras tener un esquema mental de cómo será la noticia, la tarea de redactarla se hará mucho más sencilla. Recuerda siempre los dos objetivos: informar con la mayor veracidad posible y satisfacer el interés del lector."));
        arrayList.add(new Noticia("Moto", R.drawable.noti2,"Cualquier acontecimiento puede ser tratado de diferentes maneras, desde distintas perspectivas. Haz la prueba: ponte de acuerdo con tres o cuatro compañeros y propónles relatar por escrito un mismo acontecimiento del que hallan sido protagonistas o testigos. Seguro que cuando lean lo que cada uno ha escrito encontrarán muchas diferencias."));
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
