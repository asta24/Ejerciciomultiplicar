package com.example.ejerciciomultiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.txt_number1);
        et2 = (EditText) findViewById(R.id.txt_number2);
        tv1 = (TextView) findViewById(R.id.txt_simbolo);
        tv2 = (TextView) findViewById(R.id.txt_resultado);
    }

    public void multiplicacion(View view) {
        String resultado = "";
        String simbolo = "";
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();


        int nNum1 = Integer.parseInt(num1);
        int nNum2 = Integer.parseInt(num2);


        int multiplicacion = (nNum1 * nNum2);


        resultado = (" " + multiplicacion);
        simbolo = (" x ");


        tv2.setText(resultado);
        tv1.setText(simbolo);


    }

    public void suma(View view) {
        String resultado = "";
        String simbolo = "";
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();


        int nNum1 = Integer.parseInt(num1);
        int nNum2 = Integer.parseInt(num2);


        int suma = (nNum1 + nNum2);


        resultado = (" " + suma);
        simbolo = (" + ");


        tv2.setText(resultado);
        tv1.setText(simbolo);
    }

    public void resta(View view) {
        String resultado = "";
        String simbolo = "";
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();


        int nNum1 = Integer.parseInt(num1);
        int nNum2 = Integer.parseInt(num2);


        int resta = (nNum1 - nNum2);


        resultado = (" " + resta);
        simbolo = (" - ");


        tv2.setText(resultado);
        tv1.setText(simbolo);

    }

    public void division(View view) {
        String resultado = "";
        String simbolo = "";
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();


        int nNum1 = Integer.parseInt(num1);
        int nNum2 = Integer.parseInt(num2);


        int division = (nNum1 / nNum2);


        resultado = (" " + division);
        simbolo = (" % ");


        tv2.setText(resultado);
        tv1.setText(simbolo);

    }
}
