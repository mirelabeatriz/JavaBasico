package ControleFluxo;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		double altura, peso, imc;

		Scanner scanner = new Scanner(System.in);

		System.out.println("altura em M");
		altura = scanner.nextDouble();
		System.out.println("peso em KG ");
		peso = scanner.nextDouble();
		
		imc = (peso/(altura*altura));

		if (imc >= 18.5) {
			System.out.println("abaixo");
		} else if (imc >= 18.6 && altura <= 25) {
			System.out.println("normal");}
			else if (imc >= 25.1 && altura <= 30) {
				System.out.println("gordo");
		} else {
			System.out.println("bola");
		}
		scanner.close();
	}

}
