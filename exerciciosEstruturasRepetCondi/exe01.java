//1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe01 {
  public static void main(String[] args) {
Scanner leitorScanner = new Scanner(System.in);

System.out.println("=========== Somar 2 números ===========");

int result;
System.out.println("Digite o primeiro numero para somar");
int n1 = leitorScanner.nextInt();
System.out.println("Digite o segundo numero para somar");
int n2 = leitorScanner.nextInt();
result = n1 + n2;
System.out.println("A soma entre " + n1 + " e " +n2 + " é igual a " + result);
}  
}
