import java.util.Scanner;

// O algoritmo deve ter como entrada um número real e a saída deve ser o valor
// atualizado com os 20%

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valor, resultado;
        final float TAXA_EM_PORCENTAGEM = 20;

        System.out.println("Informe um valor para ser corrigido a " + TAXA_EM_PORCENTAGEM + "%");
        valor = in.nextFloat();

        resultado = valor * (1 + TAXA_EM_PORCENTAGEM/100);
        System.out.println("Seu valor acrescido de " + TAXA_EM_PORCENTAGEM + "% é igual a " + resultado);

    }
}