/*
 1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os m�todos p�blicos necess�rios para getters e setters e tamb�m um m�todo para imprimir
todos dados de uma pessoa. Crie um m�todo para calcular a idade da pessoa. 
 */
package exerciciosPOO_01;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

Pessoa ObjetoPessoa = new Pessoa();


System.out.println("Qual seu nome?");
ObjetoPessoa.setNome(leitor.next());

System.out.println("Qual seu m�s de nascimento?");
ObjetoPessoa.setMesNascimento(leitor.nextInt());

System.out.println("Qual seu ano de nascimento?");
ObjetoPessoa.setAnoNascimento(leitor.nextInt());

System.out.println("Qual sua altura");
ObjetoPessoa.setAltura(leitor.nextFloat());

System.out.println(ObjetoPessoa.getNome()+", sua altura "+ObjetoPessoa.getAltura()+" e sua idade = "+ObjetoPessoa.CalcularIdade());

    }
}
