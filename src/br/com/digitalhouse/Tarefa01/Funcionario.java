package br.com.digitalhouse.Tarefa01;

public class Funcionario extends Pessoa {

    private float salario;

    public Funcionario(){

    }

    public Funcionario(String nome, Data nascimento,float salario) {
        super(nome, nascimento);

        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaImposto(){

        this.salario = salario - (salario * 0.03f);

        return salario;
    }

    @Override
    public void imprimeDados() {

        System.out.println("Nome do Funcionário: " + getNome());
        System.out.println("Data de nascimento: " + getNascimento().dia + "." +
                getNascimento().mes + "." + getNascimento().ano);
        System.out.println("Salario: " + getSalario());

    }
}
