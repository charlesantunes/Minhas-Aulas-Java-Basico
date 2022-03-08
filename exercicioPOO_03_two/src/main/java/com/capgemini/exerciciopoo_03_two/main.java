/*
//array
String[] funcionarios = {"c", "m"};
System.err.println("Insira 2 nomes");
funcionarios[0]= leitor.next();
funcionarios[1]= leitor.next();
        System.err.println("Os 3 nomes são" + funcionarios[0] + funcionarios[1]);

String valorGasolina;
       valorGasolina = JOptionPane.showInputDialog("Qual seu nome princesa");
JOptionPane.showConfirmDialog(null,"seu nome é "+ valorGasolina+"?");
 */
package com.capgemini.exerciciopoo_03_two;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float result;
        BombaCombustivel bc = new BombaCombustivel(1, 6.75f, 1000);

        int opcaoAbastecimento;
        int combustivel;

        System.out.println("Escolha o tipo de combustivel \n1 - Gasolina \n2 - Alcool");
        combustivel = leitor.nextInt();
        if (combustivel == 2) {
            bc.setTipoDeCombustível(bc.alterarCombustivel());
        } else {
        }

        System.out.println("Escolha como deseja abastecer: \n1 - Dinheiro R$ \n2 - Litro");
        opcaoAbastecimento = leitor.nextInt();

        if (opcaoAbastecimento == 1) {
            System.out.println("Informe o valor em dinheiro R$ para abastecer?");
            result = bc.abastecerPorValor(leitor.nextFloat());
            System.out.println("Você abasteceu " + result + " litros");
        } else {
            System.out.println("Informe o valor em dinheiro R$ para abastecer?");
            result = bc.abastecerPorLitro(leitor.nextFloat());
            System.out.println("Você abasteceu " + result + " litros");
        }
    }
}
