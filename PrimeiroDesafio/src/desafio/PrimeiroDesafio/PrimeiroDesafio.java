package desafio.PrimeiroDesafio;

import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = 0;

        int[] par = new int[10];
        int[] impar = new int[10];
        int countPar = 0;
        int countImpar = 0;

        for (int count = 0; count < par.length; count++) {
            valor = scanner.nextInt();
            if (valor % 2 == 0) {
                par[countPar++] = valor;
            } else {
                impar[countImpar++] = valor;
            }
        }

        ordena(par, countPar);
        ordena(impar, countImpar);
        inverte(impar, countImpar);

        for (int i = 0; i < countPar; i++) {
            System.out.println(par[i]);
        }

        for (int i = 0; i < countImpar; i++) {
            System.out.println(impar[i]);
        }
    }

    private static void ordena(int[] arr, int tamanho) {
        for (int i = 1; i < tamanho; i++) {
            int chave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }

    private static void inverte(int[] arr, int tamanho) {
        int inicio = 0;
        int fim = tamanho - 1;
        while (inicio < fim) {
            int temp = arr[inicio];
            arr[inicio] = arr[fim];
            arr[fim] = temp;
            inicio++;
            fim--;
        }
    }
}
