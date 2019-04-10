package br.com.digitalhouse.Tarefa02;

public class Vip extends Ingresso {

    protected float valorAdicional;

    public Vip (){

    }

    public Vip(float valorReais, float valorAdicional) {

        super(valorReais);

        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float retornarValorIngresso(){

        valorReais = valorReais + this.valorAdicional;

        return valorReais;
    }
}
