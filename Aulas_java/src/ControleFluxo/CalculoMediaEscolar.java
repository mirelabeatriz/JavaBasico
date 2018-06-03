package ControleFluxo;

import java.util.Scanner;

public class CalculoMediaEscolar {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;

		Scanner scanner = new Scanner(System.in);

		System.out.println("nota");
		nota1 = scanner.nextDouble();
		System.out.println("nota");
		nota2 = scanner.nextDouble();
		System.out.println("nota");
		nota3 = scanner.nextDouble();

		media = ((nota1 + nota2 + nota3) / 3);
		if (media >= 7) {
			System.out.println("passo misera");
		} else if (media >= 5 && media <= 6.9) {
			System.out.println("é mais ou menos");
		} else {
			System.out.println("flw");
		}
		scanner.close();
	}


}
