package estrutura_sequencial;

import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = (quant1 * valor1) + (quant2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
	
	}

}
