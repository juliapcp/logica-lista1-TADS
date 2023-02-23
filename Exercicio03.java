
import java.util.Scanner;

// Desenvolva o algoritmo de um programa onde o usuário irá informar um número
// inteiro e o programa deve calcular e exibir quadrado do número informado pelo
// usuário.

public class Exercicio03 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro e o programa exibirá seu quadrado");
        int numero = in.nextInt();
        int quadrado = numero*numero;
        System.out.printf("O número ao quadrado é %d \n", quadrado);

    }
}
