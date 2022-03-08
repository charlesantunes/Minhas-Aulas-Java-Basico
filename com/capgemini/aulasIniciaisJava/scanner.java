package com.capgemini.aulasIniciaisJava;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

    //Scanner serve para solicitar ao usuário do editor, uma entrada de dados 
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = leitorScanner.nextLine();

        System.out.println("Seu nome é " + nome);
    }
}
