package com.example.conversorjardaparacm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_jardas;
    Button bt_converter;
    TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_jardas = findViewById(R.id.et_jardas);
        bt_converter = findViewById(R.id.bt_converter);
        tv_resultado = findViewById(R.id.tv_resultado);

        bt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //91,44
                Double jardas = Double.parseDouble(et_jardas.getText().toString());
                Double centimetro = jardas*91.44;

                tv_resultado.setText("A conversão da Jarda: " + jardas + " para Centímetros é: " + centimetro);
                Toast.makeText(MainActivity.this, "O valor em centímetros é: " + centimetro, Toast.LENGTH_SHORT).show();
            }
        });
    }
}