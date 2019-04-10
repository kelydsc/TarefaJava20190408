package br.com.digitalhouse.Tarefa01;

public class Gerente extends Funcionario{

    private String area;

    public Gerente(){

    }

    public Gerente(String nome, Data nascimento, float salario,String area) {
        super(nome, nascimento, salario);

        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public float calculaImposto() {

        setSalario(getSalario() - (getSalario() * 0.05f));

        return getSalario();
    }

    @Override
    public void imprimeDados() {

        System.out.println("Nome do Gerente: " + getNome());
        System.out.println("Data de nascimento: " + getNascimento().dia + "." +
                getNascimento().mes + "." + getNascimento().ano);
        System.out.println("Salario: " + getSalario());
        System.out.println("Area: " + getArea());
    }
}
