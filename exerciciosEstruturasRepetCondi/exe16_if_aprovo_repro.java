/*
 Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe16_if_aprovo_repro {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        float media = 0.0f;

        System.out.println(" ====== Sistema para calcular a média e aprovado ou reprovado aluno ======");

        System.out.println("Qual o nome do(a) Aluno(a)?");
        String nomeAluno = leitorScanner.next();

        System.out.println("Qual a primeira nota?");
        float nota1 = leitorScanner.nextFloat();

        System.out.println("Qual a segunda nota?");
        float nota2 = leitorScanner.nextFloat();

        System.out.println("Qual a terceira nota?");
        float nota3 = leitorScanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno(a), " + nomeAluno + " com a média " + media + " está APROVADO");
        
            }else{
                if (media <= 5) {
            System.out.println("O aluno(a), " + nomeAluno + " com a média " + media + " está REPROVADO");
            } else {
            System.out.println("O aluno(a), " + nomeAluno + " com a média " + media + " está em RECUPERAÇÃO");
            }
        }
    }
}
