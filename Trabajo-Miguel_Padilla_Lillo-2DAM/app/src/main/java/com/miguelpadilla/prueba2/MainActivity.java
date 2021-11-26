package com.miguelpadilla.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rbFemenino = (RadioButton) findViewById(R.id.rbFemenino);
        RadioButton rbMasculino = (RadioButton) findViewById(R.id.rbMasculino);
        RadioButton rbNB = (RadioButton) findViewById(R.id.rbNoBinario);
        Button bBorrar = (Button) findViewById(R.id.bBorrar);
        Button bEnviar = (Button) findViewById(R.id.bEnviar);

        EditText etNombre = (EditText) findViewById(R.id.etNombre);
        EditText etPrimerApellido = (EditText) findViewById(R.id.etPrimerApellido);
        EditText etSegundoApellido = (EditText) findViewById(R.id.etSegundoApellido);
        EditText etEdad = (EditText) findViewById(R.id.etEdad);

        CheckBox cbAlergia = (CheckBox) findViewById(R.id.cbAlergia);
        CheckBox cbEnfermedad = (CheckBox) findViewById(R.id.cbEnfermedad);
        CheckBox cbDiscapacidad = (CheckBox) findViewById(R.id.cbDiscapacidad);

        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(rbFemenino)) {
                    rbMasculino.setChecked(false);
                    rbNB.setChecked(false);
                } else if (view.equals(rbMasculino)) {
                    rbFemenino.setChecked(false);
                    rbNB.setChecked(false);
                } else if (view.equals(rbNB)) {
                    rbFemenino.setChecked(false);
                    rbMasculino.setChecked(false);
                } else if (view.equals(bBorrar)) {
                    etNombre.setText(getString(R.string.nombre));
                    etPrimerApellido.setText(getString(R.string.primerapellido));
                    etSegundoApellido.setText(getString(R.string.segundoapellido));
                    etEdad.setText(getString(R.string.edad));

                    cbAlergia.setChecked(false);
                    cbEnfermedad.setChecked(false);
                    cbDiscapacidad.setChecked(false);

                    rbMasculino.setChecked(false);
                    rbFemenino.setChecked(false);
                    rbNB.setChecked(false);
                } else if (view.equals(bEnviar)) {
                    Toast.makeText(MainActivity.this,getString(R.string.formularioenviado), Toast.LENGTH_LONG).show();
                }
            }
        };

        rbFemenino.setOnClickListener(buttonListener);
        rbMasculino.setOnClickListener(buttonListener);
        rbNB.setOnClickListener(buttonListener);
        bBorrar.setOnClickListener(buttonListener);
        bEnviar.setOnClickListener(buttonListener);

    }
}