package estruturasCondicionais;

public class ifElse {

    public static void main(String[] args) {
        int media = 10;

//estrutura de condição SE e SENÃO
        if (media >= 7) {
            if (media == 10) {
                System.out.println("Super Parabens, aluno Aprovado com nota máxima");
            } else {
                System.out.println("Parabens, aluno Aprovado");
            }
        } else {
            System.out.println("Infelizmente o aluno foi Reprovado");

        }
    }
}
