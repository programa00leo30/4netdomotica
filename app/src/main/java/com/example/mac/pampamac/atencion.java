package com.example.mac.pampamac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class atencion extends AppCompatActivity {
    Button encender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atencion);
           encender = (Button) findViewById(R.id.volver3);
            encender.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (atencion.this, MainActivity.class);
                    startActivity(intent);
                }
            });
    }
}
