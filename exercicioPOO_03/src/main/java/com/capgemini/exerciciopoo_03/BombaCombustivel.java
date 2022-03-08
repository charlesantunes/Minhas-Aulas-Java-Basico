package com.capgemini.exerciciopoo_03;

public class BombaCombustivel {

    private int tipoCombustível;
    private float valorPorLitro;
    private float qtdCombustivel;


public float AbastecerPorValor(float valor){
qtdCombustivel = qtdCombustivel - valor;
return valor / valorPorLitro;
}


public float AbastecerPorLitro(float litros){
qtdCombustivel = qtdCombustivel - litros;
return litros * valorPorLitro;
}
/*
public float AlterarValor(){
return;
}

public int AlterarCombustivel(){
return;
}

public float AlterarQtdCombustivel(){
return;
}

*/
    public int getTipoCombustível() {
        return tipoCombustível;
    }

    public void setTipoCombustível(int tipoCombustível) {
        this.tipoCombustível = tipoCombustível;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }






}
