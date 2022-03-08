package orientacaoObjetos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ClassePessoa objetoPessoa = new ClassePessoa(68.0f,1.68f);

        System.out.println("Qual seu peso?");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.println("Qual sua altura");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("Seu indice de massa corporal é " + objetoPessoa.calcularIMC());

    }
}
