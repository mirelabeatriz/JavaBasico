package continuacao;

import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		double faixa;

		Scanner scanner = new Scanner(System.in);

		System.out.println("digite uma faixa salarial");
		faixa = scanner.nextDouble();

		if (faixa <= 1000) {
			System.out.println("sorry, não tem desconto");
			System.out.println("Valor a ser pago: " + faixa);
		} else if (faixa < 1000 && faixa >= 3000) {
			System.out.println("Você tem 5/% de desconto");
			faixa *= 0.95;
			System.out.println("Valor a ser pago: " + faixa);
		} else {
			System.out.println("Você tem desconto de 10/%");
			faixa *= 0.9;
			System.out.println("Valor a ser pago: " + faixa);
		}

	}

}
