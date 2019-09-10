package com.example.plantao;

public class Calculo {
    public double Media (double[] valores){
        double soma = 0;

        for (int i = 0; i < valores.length; i++){

            soma += valores.length;
        }

        return soma/valores.length;
    }

    public double Maior (double[] valores){
        double maior = valores [0];

        for (int i = 1; i < valores.length; i++) {

            if (valores[i] > maior)
                maior = valores[i];
        }
    }
}
