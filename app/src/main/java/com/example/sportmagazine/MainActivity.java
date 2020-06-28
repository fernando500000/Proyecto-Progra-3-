package com.example.sportmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button   mButton;
    Button   register;
    EditText mEdit;
    EditText mEdit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mEdit   = (EditText)findViewById(R.id.user);
         mEdit2   = (EditText)findViewById(R.id.pasword);
         mButton = (Button)findViewById(R.id.login);
        register = (Button)findViewById(R.id.registro);
        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        System.out.println(mEdit.getText());
                        System.out.println(mEdit2.getText());
                        Intent activity2Intent = new Intent(getApplicationContext(), MenuActivity.class);
                        if(mEdit.getText().toString().equals("1") && mEdit2.getText().toString().equals("1") ){

                            startActivity(activity2Intent);
                        }else{
                            Toast.makeText(getApplicationContext(), "contaseña o usuario mal", Toast.LENGTH_SHORT).show();

                        }

                    }
                });
        register.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {

                        Intent activity2Intent = new Intent(getApplicationContext(), Formulario.class);

                            startActivity(activity2Intent);



                    }
                });
    }


}
