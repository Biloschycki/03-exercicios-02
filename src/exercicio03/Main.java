package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] agrs){

        Scanner entrada = new Scanner (System.in);
        DecimalFormat fm = new DecimalFormat("0.000");

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //Entrada de dados
        System.out.println("Informe as coordenada x do Ponto 1:");
        p1.x=entrada.nextInt();
        System.out.println("Informe as coordenada y do Ponto 1:");
        p1.x=entrada.nextInt();
        System.out.println("Informe as coordenada x do Ponto 2:");
        p2.x=entrada.nextInt();
        System.out.println("Informe as coordenada y do Ponto 2:");
        p2.x=entrada.nextInt();

        //impressão da distância entre os dois pontos
        System.out.println();

        System.out.println("Distância de P1 para P2 "+fm.format(p1.calcularDistancia(p2)));
        System.out.println("Distância de P2 para P1 "+fm.format(p2.calcularDistancia(p1)));

        //Impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("Distância de P1 até a origem "+fm.format(p1.calcularDistanciaOrigem()));
        System.out.println("Distância de P2 até a origem "+fm.format(p2.calcularDistanciaOrigem()));

        //Ponto mais Proximo da origem
        System.out.println();
        System.out.println("Ponto mais próximo da origem");
        Ponto aux = p1.maisPertoDaOrigem(p1,p2);
        System.out.println(aux.retornarDadosFormatados());

    }

}
