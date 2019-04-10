package br.com.digitalhouse.Tarefa02;

public class CamaroteInferior extends Vip {

    private String localizacaoIngresso;

    public CamaroteInferior(){

    }

    public CamaroteInferior(float valorReais, float valorAdicional, String localizacaoIngresso) {

        super(valorReais, valorAdicional);

        this.localizacaoIngresso = localizacaoIngresso;

    }

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public void acessarLocalizacao(){

        getLocalizacaoIngresso();

    }

    public void imprimirLocalizacao(){

        System.out.println("Localização do camarote: " + getLocalizacaoIngresso());

    }

}
