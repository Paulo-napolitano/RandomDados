package com.example.paulogsnapolitano.randomdados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDado;
    private ImageView imageViewDadoDois;
    private TextView textViewResultado;
    private int dadoUm;
    private int dadoDois;
    private int resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDado = findViewById(R.id.imageViewDado);

        imageViewDadoDois = findViewById(R.id.imageViewDado2);

        textViewResultado = findViewById(R.id.textViewResultado);

    }

    public void gerarDados(View v){

        Random dado = new Random();
        int valor = dado.nextInt(6)+1;

        dadoUm = valor;

        gerardados2(v);
        resultadoDados(v);

        if (valor == 1 ){
            imageViewDado.setImageResource(R.drawable.dado1);

        }
        else if (valor == 2){
            imageViewDado.setImageResource(R.drawable.dado2);
        }
        else if (valor == 3){
            imageViewDado.setImageResource(R.drawable.dado3);
        }
        else if (valor == 4){
            imageViewDado.setImageResource(R.drawable.dado4);
        }
        else if (valor == 5){
            imageViewDado.setImageResource(R.drawable.dado5);
        }
        else if (valor == 6){
            imageViewDado.setImageResource(R.drawable.dado6);
        }

    }

    public void gerardados2(View v){

        Random dado2 = new Random();
        int valor2 = dado2.nextInt(6)+1;

        dadoDois = valor2;

        if (valor2 == 1 ){
            imageViewDadoDois.setImageResource(R.drawable.dado1);
        }
        else if (valor2 == 2){
            imageViewDadoDois.setImageResource(R.drawable.dado2);
        }
        else if (valor2 == 3){
            imageViewDadoDois.setImageResource(R.drawable.dado3);
        }
        else if (valor2 == 4){
            imageViewDadoDois.setImageResource(R.drawable.dado4);
        }
        else if (valor2 == 5){
            imageViewDadoDois.setImageResource(R.drawable.dado5);
        }
        else if (valor2 == 6){
            imageViewDadoDois.setImageResource(R.drawable.dado6);
        }


    }

    public void resultadoDados(View view){

        resultado = dadoDois + dadoUm;

        textViewResultado.setText(Integer.toString(resultado));
    }



}



