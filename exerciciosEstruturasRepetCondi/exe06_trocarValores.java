/*
 Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
possuir o valor da variável B e a variável B passe a possuir o valor da variável A.Apresentar os valores
trocados; 
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;


public class exe06_trocarValores {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

System.out.println("===== Sistema para trocar valores entre as variáveis A e B ====== ");
int troca;

System.out.println("Insira um numero para A");
        int A = leitorScanner.nextInt();

System.out.println("Insira um numero para B");
        int B = leitorScanner.nextInt();
troca = A;
A = B;
B = troca;

System.out.println("com a troca entre A e B, agora a variável A = "+A+" e a B = "+B);
} 
}
