package LPA;

import java.util.Scanner;

public class atv {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double soma = 0, media, i = 0;
		
		while(i < 5) {
			i++;
		System.out.print("Digite um número: ");
			soma += ler.nextDouble();
		}
		media = soma / 5;

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

		ler.close();
		}

}
