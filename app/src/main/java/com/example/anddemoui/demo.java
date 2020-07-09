package com.example.anddemoui;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class demo extends AppCompatActivity {
    private Button btnCallActivityB;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1);
        btnCallActivityB = (Button) findViewById(R.id.button);
        btnCallActivityB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(demo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
