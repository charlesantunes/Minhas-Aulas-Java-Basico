/*
 1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa. 
 */
package exerciciosPOO_01;

import java.util.Date;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private int mesNascimento;
    private float altura;
    
int anoAtual = 2022;
int mesAtual = 02;
/*    
private Date anoHoje;
*/

public int CalcularIdade(){
int ano;
if(mesNascimento >= mesAtual){
ano = (anoAtual - anoNascimento)-1;
}else{
ano = (anoAtual - anoNascimento);
}
return ano;

}

//Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

}
