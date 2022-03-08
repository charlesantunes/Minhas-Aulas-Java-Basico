/*2. Faça um algoritmo que receba dois números e ao final mostre a soma, 
subtração, multiplicação e a divisão dos dois números lidos; */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe02 {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
float n1,n2,soma,subtracao,multiplicacao,divisao;

System.out.println("====== Calcular a soma, subtração, multiplicação e a divisão ======");

System.out.println("Digite o primeiro");
n1 = leitorScanner.nextFloat();

System.out.println("Digite o segundo");
n2 = leitorScanner.nextFloat();

soma = n1 + n2;
subtracao = n1 - n2;
multiplicacao = n1 * n2;
divisao = n1 / n2;

System.out.println("A soma entre " + n1 + " + " +n2 + " é igual a " + soma);
System.out.println("A subtração entre " + n1 + " - " +n2 + " é igual a " + subtracao);
System.out.println("A multiplicação entre " + n1 + " X " +n2 + " é igual a " + multiplicacao);
System.out.println("A divisão entre " + n1 + " ÷ " +n2 + " é igual a " + divisao);
}
}
