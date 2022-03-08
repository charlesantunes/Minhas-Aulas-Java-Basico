/*
 Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética);
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe05_mediaAluno {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

float media;

System.out.println(" ====== Sistema para calcular a média das 3 notas do aluno ======");

System.out.println("Qual o nome do(a) Aluno(a)?");
String nomeAluno = leitorScanner.next();

System.out.println("Qual a primeira nota?");
        float nota1 = leitorScanner.nextFloat();

System.out.println("Qual a segunda nota?");
        float nota2 = leitorScanner.nextFloat();

System.out.println("Qual a terceira nota?");
        float nota3 = leitorScanner.nextFloat();

media = (nota1+nota2+nota3)/3;

System.out.println("O nome do(a) aluno(a) é "+nomeAluno);
System.out.println("Sua média é "+media);

}
}
