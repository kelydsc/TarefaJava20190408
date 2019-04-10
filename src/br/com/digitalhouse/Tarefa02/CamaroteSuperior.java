package br.com.digitalhouse.Tarefa02;

public class CamaroteSuperior extends Vip {

    public CamaroteSuperior(){

    }

    public CamaroteSuperior(float valorReais, float valorAdicional) {

        super(valorReais, valorAdicional);
    }

    public float retornarValorIngresso(){

        valorReais = valorReais + getValorAdicional();

        return valorReais;
    }
}
