package com.capgemini.aulasIniciaisJava;

import java.util.Scanner;

public class tiposDeVariaveis {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

//int = números inteiros de grande porte
        System.out.println("Qual sua idade?");
        int idade = leitorScanner.nextInt();
        System.out.println("Você tem " + idade);

// char é uma string de um caracter e é representado por aspas simples ''

//byte = uma letra ou número, armazena um caracter ou número
        System.out.println("Escolha '1' Masculino e '2' Feminino");
        byte sexo = leitorScanner.nextByte();
        switch (sexo) {
            case 1:
                System.out.println("Você é Homem");
                break;
            case 2:
                System.out.println("Você é Mulher");
                break;
            default:
                System.out.println("Opção invalida");
        }

        //float = números fracionários até 6 casas décimais
        System.out.println("qual o valor do dolar hoje?, use vírgula na fração");
        float cotacaoDolar = leitorScanner.nextFloat();
        System.out.println("O dolar vale hoje " + cotacaoDolar);

//double =números fracionários de 10 casas décimais
        System.out.println("Qual o valor do euro, use vírgula na fração");
        double cotacaoEuro = leitorScanner.nextDouble();
        System.out.println("O euro vale hoje " + cotacaoEuro);

//println = O texto quebra para outra linha      
        System.out.println("exemplo de texto quebrado: digite 'O rato roeu a ',"
                + " depois de ENTER, em seguida escreva 'roupa do Rei de Roma',"
                + "depois ENTER de novo.");
        System.out.println("Digite o Texto 1");
        String nome1 = leitorScanner.nextLine();
        System.out.println("Digite o Texto 2");
        String nome2 = leitorScanner.nextLine();
        System.out.println(nome1 + nome2);

//print = O texto fica na mesma linha e não quebra para proxima linha
        System.out.println("exemplo de textona mesma linha: digite 'O rato "
                + "roeu a', depois de ENTER, em seguida"
                + " escreva 'roupa do Rei de Roma', depois ENTER de novo.");
        System.out.println("Digite o Texto 1");
        String texto1 = leitorScanner.nextLine();
        System.out.println("Digite o Texto 2");
        String texto2 = leitorScanner.nextLine();
        System.out.print(texto1 + " " + texto2);
    }
}
