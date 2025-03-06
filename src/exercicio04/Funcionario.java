package exercicio04;

public class Funcionario {

    //Variáveis

    String nome;
    String cargo;
    double salario;

    //construtor
    public Funcionario  (String nome, String cargo, double salario){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }


    //método para aplicar um aumento no salário
    public void aumentarSalario(double percAumento) {

        salario += (salario * percAumento) / 100;

    }

    //método de aumento de acordo com o cargo
    public void aumentarSalario(double percAumento, String cargo){
        if(this.cargo.equalsIgnoreCase(cargo)){
            salario += (salario * percAumento) / 100;
        }
    }
    //método para promoção
    public void promover(String cargo){
        this.cargo=cargo;

    }
}
