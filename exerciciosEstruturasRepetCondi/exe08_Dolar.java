/*
Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com o usuário;
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;


public class exe08_Dolar {
public static void main(String[] args) {  

Scanner leitorScanner = new Scanner(System.in);
float cotacaoDolar = 5.12f;

System.out.println("===== Sistema para calcular a quantidade de dolares (US$)"
 + " que possui informando o valor em real(R$) ====== ");  

System.out.println("Informe um valor em Reais(R$), use virgula para separar os centavos?");
 float valorReal = leitorScanner.nextFloat();

System.out.println("A cotação do dolar hoje 18/02/2022 é US$ = "+cotacaoDolar);
System.out.println("Você possui possui em dolares US$ = "+(valorReal/cotacaoDolar)+" dolares");

}    
}
