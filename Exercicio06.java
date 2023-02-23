import java.util.Scanner;

//Desenvolva o algoritmo de um programa para calcular a média de duas notas das
//avaliações de um aluno.

public class Exercicio06 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        float primeiraNota = in.nextFloat();

        System.out.println("Digite a segunda nota");
        float segundaNota = in.nextFloat();
        float media = (primeiraNota+segundaNota)/2;
        
        System.out.printf("A média é %f \n", media);

    }
}
