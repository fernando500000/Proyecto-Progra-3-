package com.example.sportmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuTool extends AppCompatActivity {
Button noticias,gym;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutool);
        noticias = (Button)findViewById(R.id.button1);
        gym = (Button)findViewById(R.id.buttonGym);

        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityGym = new Intent(getApplicationContext(),GymActivity.class);
                startActivity(activityGym);
            }
        });
         noticias.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent activity2Intent = new Intent(getApplicationContext(), ListaNoticias.class);
                        startActivity(activity2Intent);
                    }
                });




    }
}
