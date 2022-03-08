/*
35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe35_energia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float residencia = 0.60f;
        float comercial = 0.48f;
        float industria = 1.29f;
        float consumoMensal = 0.00f;
        float consumoTotal = 0.00f;

        System.out.println("Informe o tipo de cliente");
        System.out.println("1 - Cliente Residencial \n2 - Cliente Comercial \n"
                + "3 - Cliente Industrial \n4 - Sair");
        int tipoCliente = leitor.nextInt();

        while (tipoCliente == 1 || tipoCliente == 2 || tipoCliente == 3) {

            switch (tipoCliente) {
                case 1:
                    System.out.println("Você escolheu === Cliente Residencial === \nQual o consumo desse mês em Kw/h da sua residência?");
                    consumoMensal = leitor.nextFloat();
                    consumoTotal = consumoMensal * residencia;
                    System.out.println("O valor da sua conta de luz nesse será R$ " + consumoTotal + " reais, sem imppostos\n");
                    break;
                case 2:
                    System.out.println("Você escolheu === Cliente Comércial === \nQual o consumo desse mês em Kw/h do seu comércio?");
                    consumoMensal = leitor.nextFloat();
                    consumoTotal = consumoMensal * comercial;
                    System.out.println("O valor da sua conta de luz nesse mês será R$ " + consumoTotal + " reais, sem impostos\n");
                    break;
                case 3:
                    System.out.println("Você escolheu === Cliente Industrial === \nQual o consumo desse mês em Kw/h da sua industria?");
                    consumoMensal = leitor.nextFloat();
                    consumoTotal = consumoMensal * industria;
                    System.out.println("O valor da sua conta de luz nesse mês será R$ " + consumoTotal + " reais, sem impostos\n");
                    break;
                default:

            }
            System.out.println("Informe o tipo de cliente");
            System.out.println("1 - Cliente Residencial \n2 - Cliente Comercial \n"
                    + "3 - Cliente Industrial \n4 - Sair");
            tipoCliente = leitor.nextInt();
        }
        System.out.println("Obrigado por usar nosso sistema, até a próxima");
    }
}
