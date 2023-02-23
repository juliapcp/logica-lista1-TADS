
import java.util.Scanner;

// Considere que você deseja uma comemoração especial para o seu aniversário e
// assim irá convidar familiares a amigos para um churrasco na sua residência. Você
// irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
// de uma forma de calcular a quantidade certa a ser adquirida.
// Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
// bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
// consomem uma quantidades diferentes de carne.
// Consumo de carne médio
// (http://www.embaixadordochurrasco.com.br/calculochurrasco):
// Homens: 400 gramas
// Mulheres: 320 gramas
// Crianças: 200 gramas
// *Observação: geralmente é adicionada uma margem de segurança na quantidade
// de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
// de 20% no total de carne a ser adquirida.
public class Exercicio09 {
    public static void main (String[] args){
        final float CONSUMO_CARNE_HOMENS = 400;
        final float CONSUMO_CARNE_MULHERES= 320;
        final float CONSUMO_CARNE_CRIANCAS= 200;
        final float MARGEM_SEGURANCA= 20;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de convidados homens");
        int nroHomens = in.nextInt();
        
        System.out.println("Digite o número de convidadas mulheres");
        int nroMulheres = in.nextInt();

        System.out.println("Digite o número de convidados crianças");
        int nroCriancas= in.nextInt();

        float carneCompra = ((nroHomens * CONSUMO_CARNE_HOMENS) + (nroMulheres * CONSUMO_CARNE_MULHERES) + (nroCriancas * CONSUMO_CARNE_CRIANCAS)) * 1+(MARGEM_SEGURANCA /100);
        System.out.printf("A quantidade de carne a ser comprada é %f%% \n", carneCompra);
    }
}