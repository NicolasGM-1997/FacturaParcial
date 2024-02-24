package com.example.facturaparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity2 extends AppCompatActivity {
    public Factura factura = new Factura();
    public EditText tomate, cebolla;
    public TextView valor;
    public Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tomate = findViewById(R.id.tomates);
        cebolla = findViewById(R.id.cebollas);
        valor = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cant1 = Integer.parseInt(tomate.getText().toString());
                int cant2 = Integer.parseInt(cebolla.getText().toString());
                valor.setText(""+factura.total(cant1,cant2));
            }
        });
    }
}