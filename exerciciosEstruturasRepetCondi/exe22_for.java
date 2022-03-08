package exerciciosEstruturasRepetCondi;

import java.util.Scanner;

public class exe22_for {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        float precoCusto;
        float precoVenda;
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;
        String produto;            
        
        int i = 0;
        for (; i < 40; i++) {
            System.out.println("Informe o produto " + i);
            produto = leitorScanner.next();

            System.out.println("Informe o preço de custo do produto " + i + ", use vírgula nas frações ");
            precoCusto = leitorScanner.nextFloat();

            System.out.println("Informe o preço da Venda do produto " + i + ", use vírgula nas frações ");
            precoVenda = leitorScanner.nextFloat();

            mediaCusto = mediaCusto + precoCusto;
            mediaVenda = mediaVenda + precoVenda;
            

            System.out.println("Produto " + produto);
            System.out.println("O preço de venda é R$ " + precoVenda);
            System.out.println("O preço de Custo é R$ " + precoCusto);

            if (precoCusto == precoVenda) {
                System.out.println("Houve empate entre Custo e Venda");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Tivemos Prejuizo de R$ " + (precoVenda - precoCusto));
                }
                if (precoCusto < precoVenda) {
                    System.out.println("Tivemos Lucro de R$ " + (precoVenda - precoCusto));
                }

            }

        }
        System.out.println("A média do preço de Venda é " + (mediaVenda / i));
        System.out.println("A média do preço de Custo é " + (mediaCusto /i));

    }
}
