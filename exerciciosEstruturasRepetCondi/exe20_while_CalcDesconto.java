/*
20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe20_while_CalcDesconto {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double carroDesconto = 0.00f;
        int anoCarro = 0;
        float valorCarro = 0;
        char continua = 'S';
        int carrosAte2000 = 0;
        int carrosTotal = 0;

        while (continua == 'S' || continua == 's') {

            System.out.println("Qual o valor do carro ?");
            valorCarro = leitor.nextFloat();

            System.out.println("Qual o ano do carro ?");
            anoCarro = leitor.nextInt();

            if (anoCarro <= 2000) {
                carroDesconto = valorCarro - (valorCarro * 0.12);
                carrosAte2000++;

            } else {
                carroDesconto = valorCarro - (valorCarro * 0.07);

            }
            carrosTotal++;

            System.out.println("O valor do carro é R$ " + carroDesconto + " reais \n");

            System.out.print("Deseja ver o preço de outro carro?\nS - Sim\nN - não\n\n");
            continua = leitor.next().charAt(0);
        }
        System.out.println("Total de carro(s) até o ano de 2000 é(são): " + carrosAte2000 + " carro(s)");
        System.out.println("Total geral de carro(s) é(são): " + carrosTotal + " carro(s)");
    }
}
