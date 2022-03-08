/*
15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe15_if_intervalo {
   public static void main(String[] args) {  

Scanner leitorScanner = new Scanner(System.in);

int numero;

System.out.println("Informe o número");
numero = leitorScanner.nextInt();

if(numero < 100 || numero > 200){
System.out.println("O número "+numero+", está fora do intervalo entre 100 e 200");
}else{
System.out.println("O número "+numero+", está dentro do intervalo entre 100 e 200");

}


} 
}
