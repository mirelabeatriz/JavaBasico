package ControleFluxo;

import java.util.Scanner;

public class VerificaNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
				System.out.println("é par " +numero);
		} else {
			System.out.println("é impar " +numero);
		}
		
		scanner.close();
	}

}
