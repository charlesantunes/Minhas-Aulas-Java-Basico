/*
Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando 
duas listas com os nomes, um com os “maior de idade” e outra com os “menor de 
idade”. Considere a idade a partir de 18 anos como maior de idade;
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe18_for_listaNomes {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        String nome = "";
        String nomeTotalmaior = "";
        String nomeTotalmenor = "";
        String space = ", ";

        for (int i = 1; i < 4; i++) {
            System.out.println("Informe o nome da pessoa " + i);
            nome = leitor.next();

            System.out.println("Informe a idade da pessoa " + i);
            idade = leitor.nextInt();

            if (idade >= 18) {
                System.out.println(nome + " tem " + idade + " anos e é maior de idade");
                nomeTotalmaior = nomeTotalmaior + nome + space;
            } else {
                System.out.println(nome + " tem " + idade + " anos e é menor de idade");
                nomeTotalmenor = nomeTotalmenor + nome + space;
            }
        }
        System.out.println("As pessoas maiores de idade são: \n" + nomeTotalmaior);
        System.out.println("As pessoas menores de idade são: \n" + nomeTotalmenor);
    }
}
