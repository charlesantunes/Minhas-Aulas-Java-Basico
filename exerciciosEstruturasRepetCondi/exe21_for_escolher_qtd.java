/*
21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe21_for_escolher_qtd {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int saude, idade, sexo;
        int pessoasAptas1 = 0;
        int pessoasAptas2 = 0;
        int pessoasInaptas = 0;
        int totalPessoas = 0;

        System.out.println("Infome a quantidade pessoas para ser entrevistados no serviço militar");
        String nomePessoa;
        int qtdPssoas = leitor.nextInt();

        for (int i = 1; i <= qtdPssoas; i++) {
            System.out.println("Qual o nome da pessoa " + i);
            nomePessoa = leitor.next();
            System.out.println("Qual o sexo da pessoa " + i + "? \n1 - Masculino \n2 - Feminina");
            sexo = leitor.nextInt();
            System.out.println("Qual o idade da pessoa " + i);
            idade = leitor.nextInt();
            System.out.println("Qual o estado de sáude da pessoa " + i + "? \n1 - Bom \n2 - Ruim");
            saude = leitor.nextInt();

            totalPessoas = totalPessoas + 1;

            if (sexo == 1 && idade > 17 && idade < 27 && saude == 1) {
                System.out.println(nomePessoa + ", parabens! O jovem está apto a entrar no serviço militar \n");
                pessoasAptas1 = +1;
            } else {
                if (sexo == 2 && idade > 17 && idade < 23 && saude == 1) {
                    System.out.println(nomePessoa + ", Parabens ! A jovem está apta a entrar no serviço militar \n");
                    pessoasAptas2 = +1;
                } else {
                    System.out.println(nomePessoa + ", infelizmente você não está apto(a) a entrar no serviço militar \n");
                    pessoasInaptas = +1;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Total de pessoa(s) entrevistado(s) foi(ram): " + totalPessoas);
        System.out.println("Total de pessoa apta(s) foi(ram):            " + (pessoasAptas1 + pessoasAptas2));
        System.out.println("Total de pessoa inapta(s) foi(ram):          " + pessoasInaptas);
    }
}
