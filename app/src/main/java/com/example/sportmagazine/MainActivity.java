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
    EditText mEdit;
    EditText mEdit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mEdit   = (EditText)findViewById(R.id.user);
         mEdit2   = (EditText)findViewById(R.id.pasword);
         mButton = (Button)findViewById(R.id.login);




         final String [] usuarios = {"fernando" , "kevin" ,"uh","1"};
         final String [] passwords = {"123456789","1"};

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        System.out.println(mEdit.getText());
                        System.out.println(mEdit2.getText());
                        Intent activity2Intent = new Intent(getApplicationContext(), MenuTool.class);
                        if(mEdit.getText().toString().equals(usuarios[3]) && mEdit2.getText().toString().equals(passwords[1]  ) ){

                            startActivity(activity2Intent);
                        }else{
                            Toast.makeText(getApplicationContext(), "contaseña o usuario mal", Toast.LENGTH_SHORT).show();

                        }

                    }
                });



    }


}
