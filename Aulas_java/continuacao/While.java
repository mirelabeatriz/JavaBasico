package continuacao;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		int limite;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("digite um valor");
		limite = scanner.nextInt();

		do {
			System.out.println(limite);			
			limite++; 
		}
		
		while (limite < 3);
		

	}
	
}
