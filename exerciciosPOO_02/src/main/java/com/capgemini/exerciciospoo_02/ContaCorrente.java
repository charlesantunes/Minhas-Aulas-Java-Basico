/*
2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package com.capgemini.exerciciospoo_02;

public class ContaCorrente {

    private int numConta;
    private String nomeCorrentista;
    private String novoNomeCorrentista;
    private float saldo;
    //private float deposito;
    private float saque;

    public ContaCorrente(int numConta, String nomeCorrentista, float saldo, String novoNomeCorrentista, float saque) {
        this.setNumConta(numConta);
        this.setNomeCorrentista(nomeCorrentista);
        this.setSaldo(saldo);
        this.setNovoNomeCorrentista(novoNomeCorrentista);
        this.setSaque(saque);
        //this.setDeposito(deposito);
    }

    public String AlterarNome() {
        if (nomeCorrentista != novoNomeCorrentista) {
            String novoNome = nomeCorrentista;
            return novoNome;
        } else {
            return nomeCorrentista;
        }
    }
//corrigir esse método
    public float Deposito(float deposito) {
        return deposito + saldo;        
    }

    public float saque() {
        saldo = saldo - saque;
        return saldo;
    }

    public String getNovoNomeCorrentista() {
        return novoNomeCorrentista;
    }

    public void setNovoNomeCorrentista(String novoNomeCorrentista) {
        this.novoNomeCorrentista = novoNomeCorrentista;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {

        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }
/*
    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }
*/
    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

}
