package com.example.web.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView txtVisor;
    private Button btnC, btnP,btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2,btn1, btn0, btnSoma, btnDiv;
    private Button btnMult, btnSub, btnVirg, btnIgual;
    private String captura = "";
    private double soma = 0;
    private double subtracao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn9.setOnClickListener(this);

        txtVisor = (TextView) findViewById(R.id.txtVisor);
        btnC = (Button) findViewById(R.id.btnC);
        btnP = (Button) findViewById(R.id.btnP);
        btn9 = (Button) findViewById(R.id.btn9);
        btn8 = (Button) findViewById(R.id.btn8);
        btn7 = (Button) findViewById(R.id.btn7);
        btn6 = (Button) findViewById(R.id.btn6);
        btn5 = (Button) findViewById(R.id.btn5);
        btn4 = (Button) findViewById(R.id.btn4);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn0 = (Button) findViewById(R.id.btn0);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnVirg = (Button) findViewById(R.id.btnVirg);
        btnIgual = (Button) findViewById(R.id.btnIgual);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB3();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB4();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB5();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB6();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB7();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB8();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB9();
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarB0();
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpar();
            }
        });
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somar();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dividir();
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicar();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtrair();
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                porcent();
            }
        });
        btnVirg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                virula();
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total();
            }
        });

    }

        private void mostrarB1(){
            String valor = btn1.getText().toString();
            txtVisor.setText(valor);
        }

        private void mostrarB2(){
        String valor = btn2.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB3(){
        String valor = btn3.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB4(){
        String valor = btn4.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB5(){
        String valor = btn5.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB6(){
        String valor = btn6.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB7(){
        String valor = btn7.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB8(){
        String valor = btn8.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB9(){
        String valor = btn9.getText().toString();
        txtVisor.setText(valor);
    }

    private void mostrarB0(){
        String valor = btn0.getText().toString();
        txtVisor.setText(valor);
    }

    private void limpar(){
       txtVisor.setText("");
    }

    private void somar(){
        captura = txtVisor.getText().toString();
        soma = soma + (Double.parseDouble(captura));

        txtVisor.setText(Double.toString(soma));
        //String txt = "total é: " + soma;
       // Toast.makeText(getBaseContext(), txt, Toast.LENGTH_LONG).show();

    }

    private void subtrair(){

        captura = txtVisor.getText().toString();
        subtracao = (Double.parseDouble(captura)) - subtracao;

        txtVisor.setText(Double.toString(subtracao));

    }

    private void dividir(){

    }

    private void multiplicar(){

    }



    private void porcent(){
        String valor = btnP.getText().toString();
        txtVisor.setText(valor);
    }

    private void virula(){
        String valor = btnVirg.getText().toString();
        txtVisor.setText(valor);
    }

    private void total(){
        String valor = btnIgual.getText().toString();
        txtVisor.setText(valor);
    }


    }



