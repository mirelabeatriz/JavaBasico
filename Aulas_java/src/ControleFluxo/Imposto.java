package ControleFluxo;

import java.util.Scanner;

public class Imposto {
	public static void main(String[] args) {
	double salario; 
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Qual seu salario?");
	salario= scanner.nextDouble();
	
	if (salario < 1903.98) {
		System.out.println("isento");
	}else if (salario > 1903.99 && salario < 2826.65) {

		salario = (salario* 7.5) - 142.80;

	}else if (salario > 2826.66 && salario < 3000) {

		salario = (salario* 7.5) - 142.80;
		
	}	else {
		System.out.println("ryco");
		
	}
	
	System.out.println("Seu salario é de: R$"+salario);
	System.out.println("Desconto: R$"+salario);
	scanner.close();
	}
	
}

