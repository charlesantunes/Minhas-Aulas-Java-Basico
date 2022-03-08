package orientacaoObjetos;

public class ClassePessoa {
//Atributos
    private float peso;
    private float altura;

//Metodos construtores - serve para iniciar atributos com valores padrão/defaul
public ClassePessoa(float peso,float altura){
this.peso = peso;
this.altura = altura;
}

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

//Metodos acessores
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getpeso() {
        return peso;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
}
