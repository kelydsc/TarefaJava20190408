package br.com.digitalhouse.Tarefa01;

public abstract class Pessoa {

    private String nome;
    private Data nascimento;

    //construtor generico
    public Pessoa(){

    }

    //construtor especifico
    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    //metodo abstrato
    public abstract void imprimeDados();
}
