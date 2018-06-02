package continuacao;

import java.util.Scanner;

public class ControleDecisao {

	public static void main(String[] args) {
		
		int numero;
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("  1 OU 2");
		numero = scanner.nextInt();
		
		switch (numero) {
		case '1':
			System.out.println("vogal A");
			break; 
		case '2':
			System.out.println("vogal E");
			break; 
		}
		
	}

}
