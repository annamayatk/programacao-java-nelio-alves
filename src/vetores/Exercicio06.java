package vetores;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		int max = 0;
		String maisVelho = "";
		
		for (int i =0; i<n ; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			
			if (idades[i] > max) {
				maisVelho = nomes[i];
				max = idades[i];
			}
		}
		System.out.println("Pessoa mais velha: " + maisVelho);
		sc.close();
	}

}
