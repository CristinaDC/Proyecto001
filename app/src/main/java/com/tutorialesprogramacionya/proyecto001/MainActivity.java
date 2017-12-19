package com.tutorialesprogramacionya.proyecto001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ventanaDeTexto = findViewById(R.id.ventanaDeTextoHelloWorld);

        View holaMundoBoton = findViewById(R.id.clickHolaMundo);
        holaMundoBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ventanaDeTexto.setText("holita!!");
            }
        });
    }
}
