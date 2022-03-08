package estruturasCondicionais;

import java.util.Scanner;

public class estruturaSwitch {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Escolha '1' Masculino e '2' Feminino");
        byte sexo = leitorScanner.nextByte();

        /* Usa a estrutura de condição ESCOLHA(SWITCH), quando precisa escolher
        uma opção, tipo um menu com várias opções de escolha, no exemplo abaixo
        são 2 opções */
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
    }
}
