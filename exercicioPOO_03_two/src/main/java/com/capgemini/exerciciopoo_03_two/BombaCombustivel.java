package com.capgemini.exerciciopoo_03_two;


public class BombaCombustivel {
  private float tipoDeCombustível;
 private float valorPorLitro;
 private float qtdDeCombustível;

    public BombaCombustivel(float tipoDeCombustível, float valorPorLitro, float qtdDeCombustível) {
        this.tipoDeCombustível = tipoDeCombustível;
        this.valorPorLitro = valorPorLitro;
        this.qtdDeCombustível = qtdDeCombustível;
    }

public float abastecerPorValor(float valorDinheiro){
return valorDinheiro / valorPorLitro;
}

public float abastecerPorLitro(float qtdLitro){
return qtdLitro * valorPorLitro;
}

// public float alterarValor(){}

public float alterarCombustivel(){
return tipoDeCombustível = 6.29f;
}



    public float getTipoDeCombustível() {
        return tipoDeCombustível;
    }

    public void setTipoDeCombustível(float tipoDeCombustível) {
        this.tipoDeCombustível = tipoDeCombustível;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQtdDeCombustível() {
        return qtdDeCombustível;
    }

    public void setQtdDeCombustível(float qtdDeCombustível) {
        this.qtdDeCombustível = qtdDeCombustível;
    }


 
}
