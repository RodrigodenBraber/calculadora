package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";

    private TextView resultado;
    private Button Key_Pad0,Key_Pad1,Key_Pad2,Key_Pad3,Key_Pad4,Key_Pad5,Key_Pad6,Key_Pad7,Key_Pad8,Key_Pad9;
    private Button Key_PadSubstract, Key_PadSum, Key_PadDivision, Key_PadMultiply, Key_PadClear,Key_PadEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.solucion);
        Key_Pad0 = findViewById(R.id.num_cero);
        Key_Pad1 = findViewById(R.id.num_uno);
        Key_Pad2 = findViewById(R.id.num_dos);
        Key_Pad3 = findViewById(R.id.num_tres);
        Key_Pad4 = findViewById(R.id.num_cuatro);
        Key_Pad5 = findViewById(R.id.num_cinco);
        Key_Pad6 = findViewById(R.id.num_seis);
        Key_Pad7 = findViewById(R.id.num_siete);
        Key_Pad8 = findViewById(R.id.num_ocho);
        Key_Pad9 = findViewById(R.id.num_nueve);

        Key_PadSubstract = findViewById(R.id.num_resta);
        Key_PadSum = findViewById(R.id.num_suma);
        Key_PadDivision = findViewById(R.id.num_divisor);
        Key_PadMultiply = findViewById(R.id.num_producto);
        Key_PadClear = findViewById(R.id.num_borrar);
        Key_PadEqual = findViewById(R.id.num_igual);

        //setear
        Key_Pad0.setOnClickListener(this);
        Key_Pad1.setOnClickListener(this);
        Key_Pad2.setOnClickListener(this);
        Key_Pad3.setOnClickListener(this);
        Key_Pad4.setOnClickListener(this);
        Key_Pad5.setOnClickListener(this);
        Key_Pad6.setOnClickListener(this);
        Key_Pad7.setOnClickListener(this);
        Key_Pad8.setOnClickListener(this);
        Key_Pad9.setOnClickListener(this);

        Key_PadSubstract.setOnClickListener(this);
        Key_PadSum.setOnClickListener(this);
        Key_PadDivision.setOnClickListener(this);
        Key_PadMultiply.setOnClickListener(this);
        Key_PadClear.setOnClickListener(this);
        Key_PadEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                resultado.setText(numero);
                break;
            case R.id.num_uno:
                numero = numero + "1";
                resultado.setText(numero);
                break;
            case R.id.num_dos:
                numero = numero + "2";
                resultado.setText(numero);
                break;
            case R.id.num_tres:
                numero = numero + "3";
                resultado.setText(numero);
                break;
            case R.id.num_cuatro:
                numero = numero + "4";
                resultado.setText(numero);
                break;
            case R.id.num_cinco:
                numero = numero + "5";
                resultado.setText(numero);
                break;
            case R.id.num_seis:
                numero = numero + "6";
                resultado.setText(numero);
                break;
            case R.id.num_siete:
                numero = numero + "7";
                resultado.setText(numero);
                break;
            case R.id.num_ocho:
                numero = numero + "8";
                resultado.setText(numero);
                break;
            case R.id.num_nueve:
                numero = numero + "9";
                resultado.setText(numero);
                break;
            //Operaciones
            case R.id.num_resta:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_suma:
                symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_producto:
                symbol = "*";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_divisor:
                symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_borrar:
                symbol = "";
                numero = "";
                num1 = 0;
                num2 = 0;
                resultado.setText("");
                break;
            case R.id.num_igual:
                num2 = Integer.parseInt(numero);

                switch(symbol){
                    case "-":
                        resultado.setText("resultado" + (num1 - num2));
                        break;
                    case "+":
                        resultado.setText("resultado" + (num1 + num2));
                        break;
                    case "/":
                        resultado.setText("resultado" + (num1 / num2));
                        break;
                    case "*":
                        resultado.setText("resultado" + (num1 * num2));
                        break;
                }
                numero = "";
                num1 = 0;
                num2 = 0;

            break;
        }
    }
}
