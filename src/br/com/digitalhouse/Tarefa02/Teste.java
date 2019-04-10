package br.com.digitalhouse.Tarefa02;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Integer tipoIngresso;
        Integer tipoCamarote;

        System.out.println("Digite 1 para ingresso normal e 2 para ingresso VIP");
        Scanner scanner = new Scanner(System.in);
        tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1) {

            Normal ingressoNormal = new Normal(1000.00f);

            ingressoNormal.imprimeIngresso();
            ingressoNormal.imprimeValor();

        } else if (tipoIngresso == 2) {

            System.out.println("O ingresso escolhido é do tipo Vip");

            System.out.println("Digite 1 para camarote superior ou 2 para  camarote inferior");
            tipoCamarote = scanner.nextInt();

            if (tipoCamarote == 1) {

                System.out.println("O camarote escolhido foi o camarote superior");

                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(1000.00f,200.00f);

                camaroteSuperior.retornarValorIngresso();

                camaroteSuperior.imprimeValor();

            } else if (tipoCamarote == 2) {

                System.out.println("O camarote escolhido foi o camarote inferior");

                CamaroteInferior camaroteInferior = new CamaroteInferior(1000.00f,100.00f,
                        "Na frente");

                camaroteInferior.retornarValorIngresso();
                camaroteInferior.acessarLocalizacao();
                camaroteInferior.imprimirLocalizacao();
                camaroteInferior.imprimeValor();

            } else {
                System.out.println("Tipo de camarote inválido");
            }
        } else {
            System.out.println("Tipo de ingresso inválido");
        }
    }
}
