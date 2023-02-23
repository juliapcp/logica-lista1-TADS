
import java.util.Scanner;

//Desenvolva o algoritmo de um programa onde o usuário irá informar um número
// inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
// número digitado pelo usuário.
public class Exercicio01 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro e o programa exibirá seu número antecessor");

        int numero = in.nextInt();
        int numeroAntecessor = numero - 1;
        
        System.out.printf("O número antecessor é %d \n", numeroAntecessor);
    }
}