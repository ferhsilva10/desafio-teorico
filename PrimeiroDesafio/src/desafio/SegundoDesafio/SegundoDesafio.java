package desafio.SegundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor para troco: ");
        String trocoVal = scanner.next().replace(",", ".");
        double valor = Double.parseDouble(trocoVal);
        double valorCentavos = valor * 100;

        System.out.println("==== CAIXA ELETRÔNICO ====");
        System.out.println("NOTAS:");
        int nota100 = (int) (valorCentavos / 10000);
        valorCentavos %= 10000;
        System.out.println(nota100 + " nota(s) de R$ 100.00");

        int nota50 = (int) (valorCentavos / 5000);
        valorCentavos %= 5000;
        System.out.println(nota50 + " nota(s) de R$ 50.00");

        int nota20 = (int) (valorCentavos / 2000);
        valorCentavos %= 2000;
        System.out.println(nota20 + " nota(s) de R$ 20.00");

        int nota10 = (int) (valorCentavos / 1000);
        valorCentavos %= 1000;
        System.out.println(nota10 + " nota(s) de R$ 10.00");

        int nota5 = (int) (valorCentavos / 500);
        valorCentavos %= 500;
        System.out.println(nota5 + " nota(s) de R$ 5.00");

        int nota2 = (int) (valorCentavos / 200);
        valorCentavos %= 200;
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        int moeda1 = (int) (valorCentavos / 100);
        valorCentavos %= 100;
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");

        int moeda50 = (int) (valorCentavos / 50);
        valorCentavos %= 50;
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");

        int moeda25 = (int) (valorCentavos / 25);
        valorCentavos %= 25;
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");

        int moeda10 = (int) (valorCentavos / 10);
        valorCentavos %= 10;
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");

        int moeda5 = (int) (valorCentavos / 5);
        valorCentavos %= 5;
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");

        System.out.println(valorCentavos + " moeda(s) de R$ 0.01");
        System.out.println("Deseja retirar dinheiro?");
        String resposta = scanner.next().toLowerCase();
        if (resposta.equals("sim")) {
        	System.out.println("Tintin! Dinheiro saindo! :)");
        } else {
            System.out.println("Mão de vaca!");
        }
    }
}