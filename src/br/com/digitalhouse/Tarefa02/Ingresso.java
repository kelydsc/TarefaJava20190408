package br.com.digitalhouse.Tarefa02;

public class Ingresso {

    protected float valorReais;

    public Ingresso(){

    }

    public Ingresso(float valorReais) {
        this.valorReais = valorReais;
    }

    public float getValorReais() {
        return valorReais;
    }

    public void setValorReais(float valorReais) {
        this.valorReais = valorReais;
    }

    public void imprimeValor(){

        System.out.println("O valor do ingresso é: " + valorReais);

    }
}
