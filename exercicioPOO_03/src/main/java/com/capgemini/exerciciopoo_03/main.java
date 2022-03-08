/*
 3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
 */
package com.capgemini.exerciciopoo_03;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        BombaCombustivel bc = new BombaCombustivel();
        int opcao;
        int opcaoCombustivel;
        float valorLitroGasolina = 6.75f;
        float valorLitroAlcool = 5.90f;

        System.out.println("Escolha o tipo de combustivel \n1 - Gasolina \n2 - Alcool");
        bc.setTipoCombustível(leitor.nextInt());

//falta informar a quantidade restante de combustivel em cada estrutura       
        System.out.println("Insira a quantidade de combustivel na bomba");
        bc.setQtdCombustivel(leitor.nextFloat());

        System.out.println("Escolha uma opção?\n1 - Abastecer por Litro "
                + "\n2 - Abastecer por Valor \n3 - Alterar Valor do litro do combustivel"
                + "\n4 - Alterar o tipo do combustivel \n5 - Aterar a quantidade de "
                + "combustivel restante na bomba \n6 - Sair");
        opcao = leitor.nextInt();

        while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5) {
            if (opcao == 4) {
                System.out.println("Escolha o tipo de combustivel \n1 - Gasolina \n2 - Alcool");
                bc.setTipoCombustível(leitor.nextInt());
            } else {

                if (opcao == 3) {
                    System.out.println("Escolha uma das opções para alterar o litro de qual combustivel? \n1 - Gasolina \n2 - Alcool ");
                    opcaoCombustivel = leitor.nextInt();
                    if (opcaoCombustivel == 1) {
                        valorLitroGasolina = 0;
                        System.out.println("Qual o novo valor do litro da gasolina?");
                        valorLitroGasolina = leitor.nextFloat();
                    } else {
                        valorLitroAlcool = 0;
                        System.out.println("Qual o novo valor do litro do alcool?");
                        valorLitroAlcool = leitor.nextFloat();
                    }
                } else {
                    if (bc.getTipoCombustível() == 1) {
                        bc.setValorPorLitro(valorLitroGasolina);
//parei em mandar o valor
                        switch (opcao) {
                            case 1:
                                System.out.println("Insira a quantidade de litros de combustível para abastecer");
                                bc.AbastecerPorValor(leitor.nextFloat());
                                System.out.println("Valor total a pagar em dinheiro é R$ " + bc.AbastecerPorLitro(valorLitroGasolina) + " reais\n");
                                break;
                            case 2:
                                System.out.println("Insira o valor em dinheiro para abastecer");
                                bc.AbastecerPorLitro(leitor.nextFloat());
                                System.out.println("Total do abastecimento em litros foram " + bc.AbastecerPorValor(valorLitroGasolina) + " litros\n");
                                break;
                            default:
                        }
                    } else {
                        if (bc.getTipoCombustível() == 2) {
                            bc.setValorPorLitro(valorLitroAlcool);
                            switch (opcao) {
                                case 1:
                                    System.out.println("Insira a quantidade de litros de combustível para abastecer");
                                    bc.AbastecerPorLitro(leitor.nextFloat());
                                    System.out.println("Valor total a pagar em dinheiro é R$ " + bc.AbastecerPorLitro(valorLitroAlcool) + " reais");
                                    break;
                                case 2:
                                    System.out.println("Insira o valor em dinheiro para abastecer");
//parei em mandar o valor
                                    bc.AbastecerPorValor(leitor.nextFloat());
                                    System.out.println("Total do abastecimento em litros foram " + bc.AbastecerPorValor(valorLitroAlcool) + " litros");
                                    break;
                                default:
                            }
                        } else {
                            System.out.println("Opção invalidade");
                        }
                    }
                }
            }
            System.out.println("Escolha uma opção?\n1 - Abastecer por Litro "
                    + "\n2 - Abastecer por Valor \n3 - Alterar Valor do litro do combustivel"
                    + "\n4 - Alterar o tipo do combustivel \n5 - Aterar a quantidade de "
                    + "combustivel restante na bomba \n6 - Sair");
            opcao = leitor.nextInt();
        }
    }
}
