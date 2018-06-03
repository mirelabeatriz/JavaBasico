package ControleFluxo;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		int primo; 
		int divisoes = 0; 
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Digite um numero para verificar se é primo: ");
		primo = scanner.nextInt();
		
		for (int i = 1; i <= primo; i ++) {
			if (primo % i ==0)
				divisoes++;
			
		}			
		if (divisoes <= 2) {
			System.out.println(primo + " é um numero primo. É divisivel por " + divisoes + " numeros");
		}else {
			System.out.println(primo + " é um numero primo. É divisivel por " + divisoes + " numeros");
			
		}
		scanner.close();
		

	}

}
