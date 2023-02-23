import java.util.Scanner;

// Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
// média da viagem, informe o tempo que uma família levará saindo de sua cidade de
// férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
// calculado

public class Exercicio07 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância do trajeto em km");
        float distancia = in.nextFloat();

        System.out.println("Digite a velocidade media da viagem km/h");
        float velocidade = in.nextFloat();
        float tempo = velocidade > 0f ? distancia/velocidade : 0f;
        
        System.out.printf("O tempo de viagem é %f h \n", tempo);

    }
}
