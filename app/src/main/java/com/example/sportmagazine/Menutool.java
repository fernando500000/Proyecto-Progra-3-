package com.example.sportmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menutool extends AppCompatActivity {
Button noticias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutool);
        noticias = (Button)findViewById(R.id.button1);
         noticias.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent activity2Intent = new Intent(getApplicationContext(), listanoticias.class);
                        startActivity(activity2Intent);
                    }
                });



    }
}
