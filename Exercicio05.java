import java.util.Scanner;

// Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
// graus Celsius.

public class Exercicio05 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit");
        float temperaturaFahrenheit = in.nextFloat();
        float temperaturaCelsius = ((temperaturaFahrenheit-32)/9)*5;
        System.out.printf("A temperatura em Celsius é %f \n", temperaturaCelsius);

    }
}
