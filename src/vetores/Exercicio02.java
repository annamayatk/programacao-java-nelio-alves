package vetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numeros = new int[n];

		int cont = 0;
		int[] pares = new int[0];

		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextInt();

			if (numeros[i] % 2 == 0) {
				cont++;

			}

		}
		pares = new int[cont];
		int j= 0;
			for (int i = 0; i < n; i++) {
				if (numeros[i] % 2 == 0) {
					pares[j] = numeros[i];
					j++;
				}
			}
		
		
		for (int i=0; i<cont ; i++) {
			System.out.printf("%d ",pares[i]);
		}
		System.out.println();
		System.out.println(cont);
		sc.close();
	}

}
