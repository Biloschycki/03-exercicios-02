package exercicio03;

public class Ponto {

    //atributos ou variáveis de instância
    int x;
    int y;
    /////////////////////////////////////

    //Método para calcular e retornar a distância entre dois pontos
    public double calcularDistancia(Ponto p){
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2)+Math.pow(y - p.y, 2));

        return distancia;
    }
    //Método para calcular a distância de um ponto até a origem.
    public double calcularDistanciaOrigem(){
        double distancia;
        Ponto origem = new Ponto();

        distancia=calcularDistancia(origem);
        return distancia;
    }
    //Método para retornar os dados do objeto no formato: (x,y).
    public String retornarDadosFormatados(){

    return "("+x+","+y+")";


    }
    //Método que receba como parâmetro dois pontos e retorne o ponto que está mais
    //próximo da origem.
    public static Ponto maisPertoDaOrigem(Ponto p1, Ponto p2){
        double dp1 = p1.calcularDistanciaOrigem();
        double dp2 = p2.calcularDistanciaOrigem();
        if(dp1<dp2){
            return p1;
        }else{
            return p2;
        }
    }

}