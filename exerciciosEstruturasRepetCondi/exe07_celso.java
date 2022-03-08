/*
 Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius; 
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe07_celso {
public static void main(String[] args) {  

Scanner leitorScanner = new Scanner(System.in);
float F = 0.0f;

System.out.println("===== Sistema para converter graus Celsius para Fahrenheit ====== ");  

System.out.println("Informe a temperatura em graus Celsius?");
 float C = leitorScanner.nextFloat();

F = (9*C+160) / 5;

System.out.println("A temperatura de "+C+"Cº para Fahrenheit é "+F+"Fº");
}
}