package com.example.rosa.examen1_app_apm_nombre_grupo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad1 extends Activity {


    EditText Pesos;

    String convertirPesos1 = "";
    int convertirPesos2 = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Pesos = (EditText) findViewById(R.id.pesos);

    }

    public void onClickConvertir(View v) {
        Intent envia = new Intent(this, Actividad2.class);

        convertirPesos1 = Pesos.getText().toString();
        convertirPesos2 = Integer.parseInt(convertirPesos1);
        total = convertirPesos2 + 15;

        Bundle datos = new Bundle();
        datos.putInt("Pesos", total);
        envia.putExtras(datos);
        finish();
        startActivity(envia);

    }

}

