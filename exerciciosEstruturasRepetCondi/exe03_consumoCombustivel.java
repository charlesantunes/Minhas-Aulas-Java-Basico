/* 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto; */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe03_consumoCombustivel {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        float distanciaPercorrida, qtdCombustivel, consumoMedio = 0.00f;

        System.out.println("===========Consumo médio de um automóvel===========");

        System.out.println("Qual a distancia percorrida em quilometros(Km)?");
        distanciaPercorrida = leitorScanner.nextFloat();

        System.out.println("Qual a quantidade de combustivel em litros (L)?");
        qtdCombustivel = leitorScanner.nextFloat();

        consumoMedio = distanciaPercorrida / qtdCombustivel;

        System.out.println("O consumo médio de " +distanciaPercorrida+ " KM  com "
            +qtdCombustivel+"  litros de combustivel é "+consumoMedio+ " Km/L");
    }
}
