package com.example.sportmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Formulario extends AppCompatActivity {
    Button register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        register = (Button)findViewById(R.id.Registrar);

        register.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {

                        Intent activity2Intent = new Intent(getApplicationContext(), MainActivity.class);

                        startActivity(activity2Intent);



                    }
                });
    }
}
