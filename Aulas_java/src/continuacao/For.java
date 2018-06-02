package continuacao;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
	
		int limite;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("digite um valor");
		limite = scanner.nextInt();
		
		for (int i = 0; i <= limite ; i ++) {	
		System.out.println(+ i);
		}
	} 
}
