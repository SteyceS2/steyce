package LPA;

import java.util.Scanner;

public class steyce {

	public static void main(String[] args) {
     Scanner ler  = new Scanner(System.in);
     int inicio, fim;
        
        System.out.println("Informe o intervalo de valores:");
       
	inicio = ler.nextInt();
        
        System.out.print("Valor final: ");
        fim = ler.nextInt();
        
        while (inicio <= fim) {
        	if (inicio % 2 !=0) {
        		
        System.out.println("Numeros impares no intervalo de " + inicio + "a" + fim + ":");
            }
        	
        	ler.close();
        }
        
       
    }
	}

