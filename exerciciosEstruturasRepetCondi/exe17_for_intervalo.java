/*
 Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);
 */
package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe17_for_intervalo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        int numIntervalo = 0;

        System.out.println("Sistema para verificar quantos numeros estão entre 10 e 150");

        for (int i = 1; i < 6; i++) {
            System.out.println("Informe o " + i + " número");
            numero = leitor.nextInt();
            if (numero >= 10 && numero <= 150) {
                numIntervalo = i;
            }
        }
        System.out.println(numIntervalo + " número(s) est(á)ão no intervalo entre 10 e 150");
    }
}
