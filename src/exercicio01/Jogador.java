package exercicio01;

import java.util.Scanner;

public class Jogador {

    //atributos ou variáveis de instância.
    int[] score = new int[3];
    //vetor estático, ou seja, obrigatório tamanho, não aumenta e nem diminúi.
    //A variável referencia um objeto.
    //score[i] é um cálculo com endereçamento de memória.

    String nome;
    /////////////////////////////////////////////////

    //método para calcular e retornar o score total.
    public int calcularScoreTotal() {
        //variável local tem que ser zerada
        int total = 0;

        for (int i : score) {
            total += i;
        }

        return total;
    }
}
