package com.example.sportmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button mButtonsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mButtonsiguiente = (Button)findViewById(R.id.siguiente);
        mButtonsiguiente.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent activity2Intent = new Intent(getApplicationContext(), Menutool.class);

                            startActivity(activity2Intent);
                        }

                });



    }



}
