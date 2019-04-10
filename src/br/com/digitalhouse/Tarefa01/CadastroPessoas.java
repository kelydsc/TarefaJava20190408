package br.com.digitalhouse.Tarefa01;

import java.util.ArrayList;

public class CadastroPessoas {

    private int qtdAtual;

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    ArrayList<Pessoa> listaPessoa = new ArrayList<>();

    public void cadastraPessoa(Pessoa pessoa){

        //incrementa o Array List= listaPessoa
        listaPessoa.add(pessoa);

        qtdAtual = qtdAtual + 1;
    }

    public void imprimeCadastro(){

        System.out.println("Cadastro de Pessoas: ");

        for(int contador = 0; contador < listaPessoa.size();contador++){

            System.out.println("Nome: " + listaPessoa.get(contador).getNome());
            System.out.println("Data de nascimento: " + listaPessoa.get(contador).getNascimento().dia +
                                                  "." + listaPessoa.get(contador).getNascimento().mes +
                                                  "." + listaPessoa.get(contador).getNascimento().ano);
        }
        System.out.println("Total de registros cadastrados é: " +qtdAtual);
    }
}
