package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, fechanacimiento, telefono, email, descripcion;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre          = (EditText)findViewById(R.id.editNombre);
        fechanacimiento =(EditText)findViewById(R.id.editFechaNacimiento);
        telefono        =(EditText)findViewById(R.id.editTelefono);
        email           =(EditText)findViewById(R.id.editEmail);
        descripcion     =(EditText)findViewById(R.id.editDescripcion);
        siguiente       =(Button) findViewById(R.id.editbutton2);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}