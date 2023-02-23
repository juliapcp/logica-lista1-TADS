import java.util.Scanner;

// Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
// variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
// triângulo.

public class Exercicio04 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do triângulo");
        float base = in.nextFloat();
        System.out.println("Digite a altura do triângulo");
        float altura = in.nextFloat();
        float area = (base * altura)/2;
        System.out.printf("A área do triângulo é %f \n", area);

    }
}
