package LPA;

import java.util.Scanner;

public class at2 {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        
        // Variáveis para armazenar a soma e a média
        int soma = 0;
        double media;
        
        System.out.println("Digite 5 números:");
        
        // Loop para ler os 5 números e calcular a soma
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
      
			int numero = ler.nextInt();
            soma += numero;
        }

	}

}
