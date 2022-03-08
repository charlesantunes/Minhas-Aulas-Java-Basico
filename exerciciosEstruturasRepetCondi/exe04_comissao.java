/* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês; */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe04_comissao {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println(" ====== Sistema para informa o nome do funcionário, "
 + "o salário fixo e salário com a comissão no final do mês ======");

        System.out.println(" Qual o nome do vendedor?");
        String vendedor = leitorScanner.next();

        System.out.println("Qual o salário do vendedor");
        float salario = leitorScanner.nextFloat();

        System.out.println("Qual o total de vendas em dinheiro (R$), esse vendedor realizou no mês?");
        float vendaMes = leitorScanner.nextFloat();

        System.out.println("Seu nome é " + vendedor);
        System.out.println("Seu salário é " + salario);
        System.out.println("Salário com a comissão de suas vendas nesse "
                + "mês é " + (salario + (vendaMes * 0.15)));

    }
}
