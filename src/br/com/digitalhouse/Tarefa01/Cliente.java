package br.com.digitalhouse.Tarefa01;

public class Cliente extends Pessoa{

    private int codigo;

    public Cliente(){

    }

    public Cliente(String nome, Data nascimento,int codigo) {
        super(nome, nascimento);

        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {

        System.out.println("Nome do Cliente: " + getNome());
        System.out.println("Data de nascimento: " + getNascimento().dia + "." +
                            getNascimento().mes + "." + getNascimento().ano);
        System.out.println("Codigo do Cliente: " + getCodigo());
    }
}
