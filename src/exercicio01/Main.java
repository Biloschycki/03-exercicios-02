package exercicio01;

import java.util.Scanner;

public class Main {



    public static void main(String[] agrs){

        Scanner entrada = new Scanner (System.in);

        Jogador jogador = new Jogador();

        ////////////////////////////////////Entrada de dados.
        System.out.println("Informe o nome do Jogador");
        jogador.nome = entrada.next();

        //.length coleta o tamanho do vetor///////////////////////////////////
        for(int i =0; i < jogador.score.length;i++){
            System.out.println("Score " + (i+1) +": ");
            jogador.score[i] = entrada.nextInt();
        }

        //Saída de dados.
        System.out.println("Jogador: "+jogador.nome);
        System.out.println("Pontuação total: "+ jogador.calcularScoreTotal());
    }

}
