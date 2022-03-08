/*
Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
*/    
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe24_while {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {

            System.out.println("Escolha um número e descubra se é POSITIVO ou NEGATIVO");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O número é Zero");
            }
            if (numero % 2 == 0) {
                System.out.println(" O Número " + numero + " é POSITIVO \n");
            } else {
                System.out.println(" O Número " + numero + " é NEGATIVO \n");
            }
            System.out.println("Deseja Continuar S - sim / N - não");
        //a função charArt() informa que será usado a primeira letra da palavra.
            continuar = leitorScanner.next().charAt(0);
        }
    }
}
