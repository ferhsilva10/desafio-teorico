package desafio.QuartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int count = 0; count < n; count++) {
            String linha = scanner.nextLine();
            String descriptografia = descriptografia(linha);
            System.out.println(descriptografia);
        }
        
        scanner.close();
    }
    
    public static String descriptografia(String linha) {
        int tamanho = linha.length();
        int meio = tamanho / 2;
        StringBuilder descriptografia = new StringBuilder(tamanho);
        
        for (int i = meio - 1; i >= 0; i--) {
            descriptografia.append(linha.charAt(i));
        }
        
        for (int i = tamanho - 1; i >= meio; i--) {
            descriptografia.append(linha.charAt(i));
        }
        
        return descriptografia.toString();
    }
}
