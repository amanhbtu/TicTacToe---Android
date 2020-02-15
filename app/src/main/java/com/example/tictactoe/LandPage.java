package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LandPage extends AppCompatActivity {
    Button go;
    String Player1,Player2;
    EditText p1 ;
    EditText p2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.land_page);
        p1 = findViewById(R.id.editText);
        p2 = findViewById(R.id.editText2);go = findViewById(R.id.button);
            go.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    onGo(v);
                }
            });

    }
    public void onGo(View view){
        if(p1.getText().toString().matches("") &&p2.getText().toString().matches("") ) {
            Toast.makeText(this, "Name can not be empty", Toast.LENGTH_SHORT).show();
        }
        else {
            Player1 = p1.getText().toString().toUpperCase();
            Player2 = p2.getText().toString().toUpperCase();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("Player1name", Player1);
            intent.putExtra("Player2name", Player2);
            startActivity(intent);
            finish();
        }
    }
}
