package desafio.TerceiroDesafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerceiroDesafio {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int count = 0; count < n; count++) {
            arr[count] = scanner.nextInt();
        }

        Map<Integer, Integer> mapaContagem = new HashMap<>();

        for (int num : arr) {
        	mapaContagem.put(num, mapaContagem.getOrDefault(num, 0) + 1);
        }

        int parCount = 0;
        for (int num : arr) {
            int diferenca = num - k;
            if (mapaContagem.containsKey(diferenca) && mapaContagem.get(diferenca) > 0) {
                parCount++;
                mapaContagem.put(diferenca, mapaContagem.get(diferenca) - 1);
            }
        }

        System.out.println(parCount);

        scanner.close();
    }
}
