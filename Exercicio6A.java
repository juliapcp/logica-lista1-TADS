
import java.util.Scanner;

public class Exercicio6A {
    public static void main(String[] args) {
        final float PESO_PRIMEIRA_NOTA = 3;
        final float PESO_SEGUNDA_NOTA = 4;
        final float PESO_TERCEIRA_NOTA = 5;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        float primeiraNota = in.nextFloat();

        System.out.println("Digite a segunda nota");
        float segundaNota = in.nextFloat();

        System.out.println("Digite a terceira nota");
        float terceiraNota = in.nextFloat();

        float mediaPonderada = ((primeiraNota * PESO_PRIMEIRA_NOTA) + (segundaNota * PESO_SEGUNDA_NOTA) + (terceiraNota * PESO_TERCEIRA_NOTA))/(PESO_PRIMEIRA_NOTA+PESO_SEGUNDA_NOTA+PESO_TERCEIRA_NOTA);
        System.out.printf("A média ponderada das notas é %.2f \n", mediaPonderada);
    }
}