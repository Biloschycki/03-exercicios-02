package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);

        Funcionario f;

        String nome, cargo;
        double salario, percAumento;

        System.out.println("Nome do funcionário:");
        nome = entrada.next();

        System.out.println("Cargo do funcionário:");
        cargo = entrada.next();

        System.out.println("Salário do funcionário:");
        salario = entrada.nextDouble();

        f = new Funcionario(nome, cargo, salario);

        //aumentar o salário
        System.out.println("Disgite a porcentagem de aumento (Em números inteiros 0 à 100):");
        percAumento=entrada.nextDouble();

        f.aumentarSalario(percAumento);

        System.out.println("Novo salário R$ "+ f.salario);

        //aumentar o salário de acordo com o cargo
        System.out.println();
        System.out.println("Digite a porcentagem de aumento (Em números inteiros 0 à 100):");
        percAumento=entrada.nextDouble();

        System.out.println("Digite o cargo que terá aumento:");
        cargo = entrada.next();

        f.aumentarSalario(percAumento, cargo);

        System.out.println("Novo salário R$ "+ f.salario);


    }

}
