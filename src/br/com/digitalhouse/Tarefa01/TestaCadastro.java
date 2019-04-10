package br.com.digitalhouse.Tarefa01;

public class TestaCadastro {

    public static void main(String[] args) {

        //Dados do cliente01:
        Data dataNascimento01 = new Data(16,1,1980);
        Cliente cliente01 = new Cliente("Kely",dataNascimento01,1);
        Funcionario funcionario01 = new Funcionario("Kely",dataNascimento01,1000.00f);
        Gerente gerente01 = new Gerente("Kely",dataNascimento01,2000.00f,"RH");

        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        cadastroPessoas.cadastraPessoa(cliente01);
        cadastroPessoas.cadastraPessoa(funcionario01);
        cadastroPessoas.cadastraPessoa(gerente01);

        cliente01.imprimeDados();
        funcionario01.calculaImposto();
        funcionario01.imprimeDados();
        gerente01.calculaImposto();
        gerente01.imprimeDados();

        //Dados do cliente02:
        Data dataNascimento02 = new Data(20,5,2000);
        Cliente cliente02 = new Cliente("Fabio",dataNascimento02,2);

        cadastroPessoas.cadastraPessoa(cliente02);

        cliente02.imprimeDados();

        //Dados do Funcionario02:
        Data dataNascimento03 = new Data(21,6,2001);
        Funcionario funcionario02 = new Funcionario("Maria",dataNascimento03,500.00f);

        cadastroPessoas.cadastraPessoa(funcionario02);

        funcionario02.calculaImposto();
        funcionario02.imprimeDados();

        //Dados do Gerente02:
        Data dataNascimento04 = new Data(15,7,2002);
        Gerente gerente02 = new Gerente("Mario",dataNascimento04,900.00f,"TI");

        cadastroPessoas.cadastraPessoa(gerente02);

        gerente02.calculaImposto();
        gerente02.imprimeDados();

        cadastroPessoas.imprimeCadastro();
    }
}
