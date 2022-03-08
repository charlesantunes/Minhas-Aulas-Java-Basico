/*
2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package com.capgemini.exerciciospoo_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        ContaCorrente cc = new ContaCorrente(777666, "Carlos", 120.00f, "", 0.00f);

        System.out.println("===== Sistema para cadastro cliente com conta corrente =====\n");
        System.out.println("Selecione uma das opções \n1 - Cadastrar cliente correntista \n"
                + "2 - Cadastrar conta do cliente correntista, sem dígito \n3 - Alterar nome do correntista \n4 - Realizar um depósito \n5 - Saldo \n6 - Sair");
        opcao = leitor.nextInt();

        while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5) {

            if (opcao == 1) {
                System.out.println("Você escolheu cadastrar cliente correntista \nQual o nome do cliente?\n");
                cc.setNomeCorrentista(leitor.next());
            } else {
                if (opcao == 2) {
                    System.out.println("Você escolheu alterar cliente correntista \nQual o novo nome do cliente?\n");
                    cc.setNumConta(leitor.nextInt());
                } else {
                    if (opcao == 3) {
                        System.out.println("Você escolheu alterar cliente correntista \nQual o novo nome do cliente?\n");
                        cc.setNovoNomeCorrentista(leitor.next());
                    } else {
                        if (opcao == 4) {
                            System.out.println("Você escolheu Realizar um depósito \nQual o valor do novo depósito?\n");
                            cc.Deposito(leitor.nextFloat());
                        } else {
                            if (opcao == 5) {
                                System.out.println("Você escolheu consultar saldo\nSeu saldo é " + cc.getSaldo()+"\n");
                            } else {
                                System.out.println("Opção invalida");
                            }
                        }
                    }
                }
            }
            System.out.println("===== Sistema para cadastro cliente com conta corrente =====\n");
            System.out.println("Selecione uma das opções \n1 - Cadastrar cliente correntista \n"
               + "2 - Cadastrar conta do cliente correntista, sem dígito \n"
               + "3 - Alterar nome do correntista \n4 - Realizar um depósito \n5 - Saldo \n6 - Sair");
            opcao = leitor.nextInt();
        }
        System.out.print("Seu nome é " + cc.getNomeCorrentista()
                + "\nO número da sua conta é " + cc.getNumConta() + "\nSeu saldo é " + cc.getSaldo());
    }
}
