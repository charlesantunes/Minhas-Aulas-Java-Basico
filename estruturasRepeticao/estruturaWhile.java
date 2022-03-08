package estruturasRepeticao;

import java.util.Scanner;

public class estruturaWhile {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
int totalAlunos = 10;

        /* usa a estrutura de repetição ENQUANTO(WHILE) no lugar do For, 
        quando não abemos exatamento quantas vezes teremos de repetir o laço */
       while(totalAlunos > 0){
System.out.println("Digite o nome do aluno");
String nomeAluno = leitorScanner.nextLine();

System.out.println("Digite a idade desse aluno");
int idadeAluno = leitorScanner.nextInt();

System.out.println("Nome do Aluno é " + nomeAluno + " e sua idade é " +idadeAluno);

totalAlunos = totalAlunos - 1;

} 
    }
}
